// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import  java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Subsequence sb = new Subsequence();
        sb.getAllSubSeq(new int[]{2,3,4,5,9});
    }
    
}

class Subsequence{
    public void getAllSubSeq(int[] arr){
        List<Integer> ls = new ArrayList<>();
        getAllSubSeqRec(arr, 0, ls);
    }
    public void getAllSubSeqRec(int[] arr, int index, List<Integer> ls){
        if(index >= arr.length){
            System.out.println(ls);
            return;
        }
        ls.add(arr[index]);
        getAllSubSeqRec(arr, index+1, ls);
        ls.remove(ls.size()-1);
        getAllSubSeqRec(arr, index+1, ls);
    }
}
