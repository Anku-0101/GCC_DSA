using System;
using System.Collections.Generic;

namespace DesignPatterns.DesignPatterns.Structural.Bridge
{
    public interface IQuestions
    {
        void NextQuestion();
        void PreviousQuestion();
        void NewQuestion(string q);
        void DeleteQuestion(string q);
        void DisplayQuestion();
        void DisplayAllQuestions();
    }

    public class CSharpQuestions : IQuestions
    {
        public void DeleteQuestion(string q)
        {
            throw new NotImplementedException();
        }

        public void DisplayAllQuestions()
        {
            throw new NotImplementedException();
        }

        public void DisplayQuestion()
        {
            throw new NotImplementedException();
        }

        public void NewQuestion(string q)
        {
            throw new NotImplementedException();
        }

        public void NextQuestion()
        {
            throw new NotImplementedException();
        }

        public void PreviousQuestion()
        {
            throw new NotImplementedException();
        }
    }

    public class JavaQuestions : IQuestions
    {
        private List<string> questions = new List<string>();
        private int current = 0;

        public JavaQuestions()
        {
            questions.Add("What is class?");
            questions.Add("What is interface?");
            questions.Add("What is abstraction?");
            questions.Add("What is multi-threading?");
        }
        public void DeleteQuestion(string q)
        {
            if (questions.Contains(q))
                questions.Remove(q);
            else
                throw new Exception("Question " + q + "Not found");
        }

        public void DisplayAllQuestions()
        {
            foreach(string question in questions)
                Console.WriteLine(question);
        }

        public void DisplayQuestion()
        {
            Console.WriteLine(questions[current]);
        }

        public void NewQuestion(string q)
        {
            if (!questions.Contains(q))
                questions.Add(q);
            else
                throw new Exception("Question " + q + "Already present");
        }

        public void NextQuestion()
        {
            if (current <= questions.Count - 1)
                current++;
        }

        public void PreviousQuestion()
        {
            if (current > 0)
                current--;
        }
    }

    /// <summary>
    /// Creating a QuestionManager class that will use Question interface
    /// Which will act as a bridge
    /// </summary>
    public class QuestionManager
    {
        public IQuestions q;
        protected string catlog;

        public QuestionManager(string catlog)
        {
            this.catlog = catlog;
        }

        public void Next()
        {
            q.NextQuestion();
        }

        public void Previous()
        {
            q.PreviousQuestion();
        }

        public void NewOne(string question)
        {
            q.NewQuestion(question);
        }
        public void Delete(string question)
        {
            q.DeleteQuestion(question);
        }

        public void Display()
        {
            q.DisplayQuestion();
        }
        public void DisplayAll()
        {
            Console.WriteLine("Question Paper : " + catlog);
            q.DisplayAllQuestions();
        }
    }

    public class QuestionFormat : QuestionManager
    {
        public QuestionFormat(string catlog) : base(catlog)
        {

        }

        public void DisplayAllQuestions()
        {
            base.DisplayAll();
        }

        public IQuestions Questions(string questionType)
        {
            if (questionType.ToLower() == "java")
                return new JavaQuestions();
            else
                return null;

        }
    }

    public class BridgeDemo
    {
        public void Demo()
        {
            QuestionFormat question = new QuestionFormat("Java Programming Language");
            question.q = question.Questions("JAVA");

            question.DisplayAllQuestions();
            question.Delete("What is class?");
            question.DisplayAllQuestions();
            question.NewOne("What is Inheritance?");
            question.DisplayAllQuestions();
        }

    }
}

