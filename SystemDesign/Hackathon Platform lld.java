import javax.swing.plaf.LabelUI;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ProblemManager problemManager = new ProblemManager();
        UserManager userManager = new UserManager();

        userManager.addUser("Alice", "Engineering");
        userManager.addUser("Bob", "Science");

        problemManager.addProblem("P1", "Graph problem", "Graph", "Medium", 50, new SimpleScoring());
        problemManager.addProblem("P2", "DP problem", "DP", "Hard", 100, new TimeBasedScoring());

        userManager.solveProblem("Alice", problemManager.getProblem("P1"), 10);
        userManager.solveProblem("Bob", problemManager.getProblem("P2"), 15);

        userManager.displayLeaderboard(false);
    }
}
// Without factory pattern
interface ScoringStrategy {
    int calculateScore(int baseScore, long timeTaken);
}

class SimpleScoring implements ScoringStrategy {
    @Override
    public int calculateScore(int baseScore, long timeTaken) {
        return baseScore;
    }
}

class TimeBasedScoring implements ScoringStrategy {
    @Override
    public int calculateScore(int baseScore, long timeTaken) {
        return (int) (baseScore - timeTaken * 0.5);
    }
}

class ProblemMetadata {
    String name, description, tag, difficulty;

    public ProblemMetadata(String name, String description, String tag, String difficulty) {
        this.name = name;
        this.description = description;
        this.tag = tag;
        this.difficulty = difficulty;
    }
}

class Problem {
    ProblemMetadata metadata;
    int baseScore;
    int solvedCount;
    long totalTimeTaken;
    ScoringStrategy scoringStrategy;

    public Problem(ProblemMetadata metadata, int baseScore, ScoringStrategy strategy) {
        this.metadata = metadata;
        this.baseScore = baseScore;
        this.solvedCount = 0;
        this.totalTimeTaken = 0;
        this.scoringStrategy = strategy;
    }

    public void markSolved(long timeTaken) {
        this.solvedCount++;
        this.totalTimeTaken += timeTaken;
    }

    public double getAverageTime() {
        return solvedCount == 0 ? 0 : (double) totalTimeTaken / solvedCount;
    }

    public int getScore(long timeTaken) {
        return scoringStrategy.calculateScore(baseScore, timeTaken);
    }
}


class User {
    String name, department;
    int totalScore;
    Set<String> solvedProblems;

    public User(String name, String department) {
        this.name = name;
        this.department = department;
        this.totalScore = 0;
        this.solvedProblems = new HashSet<>();
    }

    public void solveProblem(Problem problem, long timeTaken) {
        if (!solvedProblems.contains(problem.metadata.name)) {
            solvedProblems.add(problem.metadata.name);
            problem.markSolved(timeTaken);
            this.totalScore += problem.getScore(timeTaken);
        }
    }
}

class ProblemManager {
    Map<String, Problem> problems = new HashMap<>();

    public void addProblem(String name, String description, String tag, String difficulty, int baseScore, ScoringStrategy strategy) {
        ProblemMetadata metadata = new ProblemMetadata(name, description, tag, difficulty);
        problems.put(name, new Problem(metadata, baseScore, strategy));
    }

    public List<Problem> fetchProblems(String difficulty, String tag) {
        return problems.values().stream()
                .filter(p -> (difficulty == null || p.metadata.difficulty.equals(difficulty)) &&
                        (tag == null || p.metadata.tag.equals(tag)))
                .sorted(Comparator.comparingInt(p -> -p.baseScore))
                .collect(Collectors.toList());
    }

    public Problem getProblem(String name) {
        return problems.get(name);
    }
}

class UserManager {
    Map<String, User> users = new HashMap<>();
    Map<String, Integer> departmentScores = new HashMap<>();

    public void addUser(String name, String department) {
        users.put(name, new User(name, department));
    }

    public void solveProblem(String userName, Problem problem, long timeTaken) {
        User user = users.get(userName);
        if (user != null && problem != null) {
            user.solveProblem(problem, timeTaken);
            departmentScores.put(user.department, departmentScores.getOrDefault(user.department, 0) + problem.getScore(timeTaken));
        }
    }

    public List<String> fetchSolvedProblems(String userName) {
        return users.get(userName).solvedProblems.stream().toList();
    }

    public void displayLeaderboard(boolean byDepartment) {
        if (byDepartment) {
            departmentScores.entrySet().stream()
                    .sorted((a, b) -> b.getValue() - a.getValue())
                    .limit(5)
                    .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
        } else {
            users.values().stream()
                    .sorted((a, b) -> b.totalScore - a.totalScore)
                    .limit(5)
                    .forEach(user -> System.out.println(user.name + " - " + user.totalScore));
        }
    }
}








