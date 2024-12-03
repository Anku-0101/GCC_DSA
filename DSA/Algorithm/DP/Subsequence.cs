// Online C# Editor for free
// Write, Edit and Run your C# code using C# Online Compiler

using System;

public class HelloWorld
{
    public static void Main(string[] args)
    {
        int[] arr = {1,2,3,4,5};
        SubSeq(arr);
        subSeqRecursive(0, new List<int>(), arr);
    }

  // Iterative using bitwise operator
    static void SubSeq(int[] arr){
     for(int i = 0; i<Math.Pow(2,arr.Length); i++){
         for(int j = 0; j<arr.Length; j++){
             if((i&(1<<j)) != 0){
                 Console.Write(arr[j]);
             }
         }
         Console.WriteLine();
     }   
    }

  static void subSeqRecursive(int index, List<int> res, int[] arr){
        if(index >= arr.Length){
            for(int i = 0; i<res.Count; i++)Console.Write(res[i] + " ");
            Console.WriteLine();
            return; 
        }
        res.Add(arr[index]);
        subSeqRecursive(index+1,res ,arr);
        res.RemoveAt(res.Count-1);
        subSeqRecursive(index+1,res ,arr);
    }
  
}


