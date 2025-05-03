using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace HelloWorld
{
	public class Program
	{
		public static void Main(string[] args)
		{
			TransactionBasedStorage obj = new TransactionBasedStorage();
			obj.Set(1,"one");
			obj.Set(2,"two");
			obj.Set(3,"three");
			
			obj.Begin();
			obj.Set(4, "four");
			obj.Set(5, "five");
			obj.View();
			obj.Rollback();
			obj.Commit();
			obj.View();
		}
	}
	
	public class Node{
	  public List<int> keysToAdd;
	  public List<string> valuesToAdd;
	  public List<int> keysToUpdate;
	  public List<string> valuesToUpdate;
	  public List<int> keysToDelete;
	  public Node nextNode;
	  public Node prevNode;
	  
	  public Node(){
	    keysToAdd = new List<int>();
	    valuesToAdd = new List<string>();
	    keysToUpdate = new List<int>();
	    valuesToUpdate = new List<string>();
	    keysToDelete = new List<int>();
	    nextNode = null;
	    prevNode = null;
	  }
	}
	
	public class TransactionBasedStorage{
	  Dictionary<int, string> kvs;
	  Node currNode;
	  Node prevNode;
	  public TransactionBasedStorage(){
	    kvs = new Dictionary<int, string>();
	  }
	  
	  public void Set(int key, string value){
	    if(currNode == null){
	      if(kvs.ContainsKey(key)){
	        Update(key, value);
	      }else{
	        kvs.Add(key,value);
	      }
	    }else{
	      currNode.keysToAdd.Add(key);
	      currNode.valuesToAdd.Add(value);
	    }
	  }
	  
	  public void Delete(int key){
	    if(currNode == null){
	      if(kvs.ContainsKey(key)){
  	      kvs.Remove(key);
  	    }else{
  	      throw new Exception("key not found");
  	    }
	    }else{
	      currNode.keysToDelete.Add(key);
	    }
	  }
	  
	  public void Update(int key, string value){
	    if(currNode == null){
	      if(kvs.ContainsKey(key)){
	        Delete(key);
	        kvs.Add(key, value);
	      }else{
	        throw new Exception("key not found");
	      }
	    }else{
	      currNode.keysToUpdate.Add(key);
	      currNode.valuesToUpdate.Add(value);
	    }
	  }
	  
	  public void Begin(){
	    if(currNode != null){
	      currNode.nextNode = new Node();
	      prevNode = currNode;
	      currNode = currNode.nextNode;
	      currNode.prevNode = prevNode;
	    }else{
	      currNode = new Node();
	      currNode.prevNode = null;
	    }
	  }
	  
	  public void Rollback(){
	    if(currNode != null){
	      currNode = currNode.prevNode;
	    }
	  }
	  
	  public void Commit(){
	    if(currNode != null){
	      List<int> keysToAdd = currNode.keysToAdd;
	      List<string> valuesToAdd = currNode.valuesToAdd;
	      List<int> keysToUpdate = currNode.keysToUpdate;
	      List<string> valuesToUpdate = currNode.valuesToUpdate;
	      List<int> keysToDelete = currNode.keysToDelete;
	      currNode = null;
	      for(int i = 0; i<keysToAdd.Count; i++){
	        Set(keysToAdd[i], valuesToAdd[i]);
	      }
	      for(int i = 0; i< keysToUpdate.Count; i++){
	        Update(keysToUpdate[i], valuesToUpdate[i]);
	      }
	      for(int i = 0; i<keysToDelete.Count; i++){
	        Delete(keysToDelete[i]);
	      }
	      currNode = prevNode;
	    }
	  }
	  
	  public void View(){
	    foreach(int key in kvs.Keys)
	    Console.WriteLine(key + " =  " + kvs[key]);
	  }
	}
}
