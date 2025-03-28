// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import  java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Subsequence sb = new Subsequence();
        //sb.getAllSubSeq(new int[]{2,3,4,5,9});
        sb.getSubSeqWithSumK(new int[]{2,3,4,5,1,2}, 5);
    }
    
}

class Subsequence{
    public void getAllSubSeq(int[] arr){
        List<Integer> ls = new ArrayList<>();
        getAllSubSeqRec(arr, 0, ls);
    }
    public void getSubSeqWithSumK(int[] arr, int k){
        List<Integer> ls = new ArrayList<>();
        getSubSeqSumK(arr, k, ls, 0, 0);
    }
    private void getSubSeqSumK(int[] arr, int k, List<Integer> ls, int sum, int index){
        if(sum == k ){
            System.out.println(ls);
            return;
        }
        if(sum > k || index >= arr.length){
            return;
        }
        sum += arr[index];
        ls.add(arr[index]);
        getSubSeqSumK(arr, k, ls, sum, index+1);
        sum -= arr[index];
        ls.remove(ls.size()-1);
        getSubSeqSumK(arr, k, ls, sum, index+1);
    }
    private void getAllSubSeqRec(int[] arr, int index, List<Integer> ls){
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
