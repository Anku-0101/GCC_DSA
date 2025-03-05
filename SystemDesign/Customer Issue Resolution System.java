import javax.swing.plaf.LabelUI;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
    }
}

interface AgentSelecter{
    String assignAgent(int issueType);
}

interface IssueObserver{
    void updated(Issue issue);
}

interface IssueSubject{
    void attach(IssueObserver observer);
    void notifyAll(Issue issue);
}

class Driver{
    private IssueManager issueManager;
    private AgentAssigner agentAssigner;
    private AgentsManager agentManager;

    private List<String> issueTypes;

    public Driver(List<String> issueTypes){
        this.issueTypes = issueTypes;
        issueManager = new IssueManager();
        agentManager = new AgentsManager(issueTypes);
        agentAssigner = new AgentAssigner(issueManager, agentManager, issueTypes);
    }

    public String createIssue(String issueId, String orderId, int issueType, String description){
        if(issueType < 0 || issueType >= issueTypes.size())return "invlid issue type";
        return issueManager.createIssue(issueId, orderId, issueType, description);
    }

    public void resolveIssue(String issueId, String resolution){
        Issue issue = issueManager.getIssue(issueId);
        if(issue == null || issue.isResolved() || !issue.isAssigned())return;
        var agent = agentManager.getAgent(issue.getAgentId());
        agent.addResolveIssueId(issueId);
        issueManager.resolveIssue(issueId, resolution);
    }

    public List<String> getAgentHistory(String agentId){
        var agent = agentManager.getAgent(agentId);
        if(agent == null) return  new ArrayList<>();
        return agent.getResolvedIssues();
    }

    // assignStrategy: 0 -> agent with least open issues,
    // 1 -> agent with most resolved issues  of given issueType
    // 2 -> agent with least open issues of given issueType
    public String assignIssue(String issueId, int assignStrategy) {
        Issue issue = issueManager.getIssue(issueId);
        if(issue==null) return "issue doesn't exist";
        if(issue.isAssigned()) return "issue already assigned";
        String agentId = agentAssigner.getAgentForAssigningIssue(issue, assignStrategy);
        if(agentId.length()==0) return "agent with expertise doesn't exist";
        issueManager.assignIssue(issueId, agentId);
        return agentId;
    }
 }

class Agent{
    private String agentId;
    private List<Integer> skills;
    private List<String> resolvedIssues;

    public Agent(String agentId, List<Integer> skills){
        this.agentId = agentId;
        this.skills = skills;
    }

    public List<String> getResolvedIssues(){return resolvedIssues;}
    public synchronized void addResolveIssueId(String issueId){resolvedIssues.add(issueId);}
}

class AgentsManager{
    private HashMap<Integer, ConcurrentLinkedDeque<String>> agentSkillsMap;
    private ConcurrentHashMap<String, Agent> agents;

    public AgentsManager(List<String> issueTypes){
        agentSkillsMap = new HashMap<>();
        agents=new ConcurrentHashMap<>();
        // initialize all issueTypes i.e skills
        for(int i=0;i<issueTypes.size();i++)
            agentSkillsMap.put(i, new ConcurrentLinkedDeque<>());
    }

    public Agent getAgent(String agentId){
        return agents.get(agentId);
    }
    public String addAgent(String agentId, List<Integer> expertise){
        if(agents.containsKey(agentId)) return "agent already exists";
        agents.put(agentId, new Agent(agentId, expertise));
        for(int skill: expertise){
            Collection<String> agentIds = agentSkillsMap.get(skill);
            agentIds.add(agentId);
        }
        return "success";
    }

    public Collection<String> getAgentIdsForIssue(int issueType){
        Collection<String> agents = agentSkillsMap.getOrDefault(
                issueType, new ConcurrentLinkedDeque<>());
        return Collections.unmodifiableCollection(agents);
    }
}

class Issue{
    private String issueId, orderId, description;
    private int issueType;
    private String agentId, resolution;

    private int status;

    // use builder pattern for more readability
    public Issue(String issueId, String orderId, String description, int issueType){

    }
    public String getAgentId(){return agentId;}
    public int getIssueType(){return issueType;}
    public void assignIssue(String agentId){}
    public boolean isAssigned(){return  agentId!=null;}
    public boolean isResolved(){return status==2;}
    public void resolveIssue(String resolution){
        this.resolution=this.resolution+" "+resolution;
        status=2;
    }
}

class IssueManager implements IssueSubject{
    private ArrayList<IssueObserver> observeAllIssues = new ArrayList<>();
    private ConcurrentHashMap<String, Issue> allIssues = new ConcurrentHashMap<>();

    public String createIssue(String issueId, String orderId, int issueType, String description){
        if(allIssues.containsKey(issueId)) return "issue already exists";
        Issue issue = new Issue(issueId, orderId, description, issueType);
        allIssues.put(issueId, issue);
        return "issue created";
    }
    public void resolveIssue(String issueId, String resolution){
        Issue issue = allIssues.get(issueId);
        if(issue==null) return;
        issue.resolveIssue(resolution);
        notifyAll(issue);
    }
    public Issue getIssue(String issueId){
        return allIssues.getOrDefault(issueId,null);
    }
    void assignIssue(String issueId, String agentId){
        Issue issue = allIssues.get(issueId);
        if(issue==null) return;
        issue.assignIssue(agentId);
        notifyAll(issue);
    }
    public void attach(IssueObserver observer){
        observeAllIssues.add(observer);
    }
    public void notifyAll(Issue issue){
        for(IssueObserver observer: observeAllIssues)
            observer.updated(issue);
    }
}

class AgentAssigner {
    // assignStrategy vs AgentSelecter
    private HashMap<Integer, AgentSelecter> map = new HashMap<>();

    AgentAssigner(IssueSubject issueSubject,
                  AgentsManager agentManager, List<String> issueTypes){
        var lowestIssuesOpenAssigner =  new LowestIssuesOpenSelecter(agentManager);
        var experiencedAgentAssigner=new MostExperiencedAgentSelecter(
                agentManager, issueTypes);
        var traineeAgentAssigner = new TraineeAgentSelecter(agentManager, issueTypes);

        map.put(0, lowestIssuesOpenAssigner);
        map.put(1, experiencedAgentAssigner);
        map.put(2, traineeAgentAssigner);

        issueSubject.attach(lowestIssuesOpenAssigner);
        issueSubject.attach(experiencedAgentAssigner);
        issueSubject.attach(traineeAgentAssigner);
    }

    // returns id of the agent or empty string i.e ""
    String getAgentForAssigningIssue(Issue issue, int assignStrategy ){
        int issueType = issue.getIssueType();
        AgentSelecter strategy = map.get(assignStrategy);
        if(strategy!=null)return strategy.assignAgent(issueType);
        return "";
    }
}

// 0 assigns agent with the least number of open issues overall
class LowestIssuesOpenSelecter implements AgentSelecter, IssueObserver {
    // agentId vs open issue count
    private final ConcurrentHashMap<String, AtomicInteger> agentOpenIssuesMap =
            new ConcurrentHashMap<>();
    private final AgentsManager agentsManager;

    LowestIssuesOpenSelecter(AgentsManager agentsManager){
        this.agentsManager=agentsManager;
    }

    // returns id of the agent or empty string i.e ""
    public String assignAgent(int issueType) {
        String chosenAgentId ="";
        int minOpenIssues=1000*1000*1000;
        Collection<String> agentIds = agentsManager.getAgentIdsForIssue(issueType);
        for(String agentId: agentIds){
            AtomicInteger open= agentOpenIssuesMap.getOrDefault(
                    agentId, new AtomicInteger(0));
            if(open.get()==0) return agentId;
            if(open.get()<=minOpenIssues){
                minOpenIssues=open.get();
                chosenAgentId=agentId;
            }
        }
        return chosenAgentId;
    }

    public void updated(Issue issue) {
        if(!issue.isAssigned()) return;
        agentOpenIssuesMap.putIfAbsent(
                issue.getAgentId(), new AtomicInteger(0));
        AtomicInteger existing = agentOpenIssuesMap.get(issue.getAgentId());
        if(!issue.isResolved()) existing.addAndGet(1);
        else existing.addAndGet(-1);
    }

}

// 1 assigns agent with most resolved issues of given issueType
class MostExperiencedAgentSelecter implements AgentSelecter, IssueObserver {
    // issueType vs (agentId vs number of resolved issues of type issueType)
    private final HashMap<Integer, ConcurrentHashMap<String, AtomicInteger>> issueTypeAgentResolvedCountMap =
            new HashMap<>();
    private final AgentsManager agentsManager;

    MostExperiencedAgentSelecter(
            AgentsManager agentsManager, List<String> issueTypes){
        this.agentsManager=agentsManager;
        for(int issueType=0;issueType<=issueTypes.size();issueType++)
            issueTypeAgentResolvedCountMap.put(issueType, new ConcurrentHashMap<>());
    }

    // returns id of the agent or empty string i.e ""
    public String assignAgent(int issueType) {
        ConcurrentHashMap<String, AtomicInteger> agentResolvedIssuesCountMap =
                issueTypeAgentResolvedCountMap.get(issueType);
        Collection<String> agentIds = agentsManager.getAgentIdsForIssue(issueType);

        //if(agentResolvedIssuesCountMap==null || agentResolvedIssuesCountMap.size()==0) return "";
        String chosenAgentId ="";
        int maxResolvedIssues=-1;
        for(String agentId: agentIds){
            AtomicInteger issuesResolved= agentResolvedIssuesCountMap.getOrDefault(agentId, new AtomicInteger(0));
            if(issuesResolved.get()>=maxResolvedIssues){
                maxResolvedIssues=issuesResolved.get();
                chosenAgentId=agentId;
            }
        }
        return chosenAgentId;
    }

    public void updated(Issue issue) {
        if(!issue.isResolved()) return;
        ConcurrentHashMap<String, AtomicInteger> agentResolvedIssuesCountMap =
                issueTypeAgentResolvedCountMap.get(issue.getIssueType());
        agentResolvedIssuesCountMap.putIfAbsent(
                issue.getAgentId(), new AtomicInteger(0));
        AtomicInteger existing = agentResolvedIssuesCountMap.get(issue.getAgentId());
        existing.addAndGet(1);
    }
}

// 2 assigns agent with the least open issues of given issueType
class TraineeAgentSelecter implements AgentSelecter, IssueObserver {
    // issueType vs (agentId vs number of open issues of type issueType)
    // using Integer to store count rather than AtomicInteger
    private final HashMap<Integer, ConcurrentHashMap<String, Integer>> issueTypeAgentOpenCountMap =
            new HashMap<>();
    private final AgentsManager agentsManager;

    TraineeAgentSelecter(AgentsManager agentsManager, List<String> issueTypes){
        this.agentsManager=agentsManager;
        for(int issueType=0;issueType<issueTypes.size();issueType++)
            issueTypeAgentOpenCountMap.put(issueType, new ConcurrentHashMap<>());
    }

    // returns id of the agent or empty string i.e ""
    public String assignAgent(int issueType) {
        Collection<String> agentIds = agentsManager.getAgentIdsForIssue(issueType);
        ConcurrentHashMap<String, Integer> agentOpenIssues =
                issueTypeAgentOpenCountMap.get(issueType);
        String chosenAgentId ="";
        int minOpenIssues=1000*1000*1000;

        for(String agentId: agentIds){
            Integer open = agentOpenIssues.getOrDefault(agentId, 0);
            if(open==0) return agentId;
            if(open<=minOpenIssues){
                minOpenIssues=open;
                chosenAgentId=agentId;
            }
        }

        return chosenAgentId;
    }

    public void updated(Issue issue) {
        if(!issue.isAssigned()) return;
        ConcurrentHashMap<String, Integer> agentOpenIssues =
                issueTypeAgentOpenCountMap.get(issue.getIssueType());

        agentOpenIssues.compute(issue.getAgentId(),
                (key, value)-> {
                    int next =value == null ? 0 :value;
                    return issue.isResolved() ? next - 1 : next + 1;
                });
    }
}



