import java.util.*;

class Main{
public static void main(String[] args){
    int arr[] = {5,2,3,4,1};
    print(arr);
    Double(arr);
    print(arr);
    int x = 8;
    Double(x);
    System.out.println( "x = " + x);
 }
  public static void Double(int x){
      x = x*2;
  }
  public static void Double(int[] arr){
    for(int i = 0; i < arr.length; i++){
            arr[i] = 2*arr[i];
     }
 }

 public static void print(int[] arr){
  for(int i = 0; i < arr.length; i++)
      System.out.print(arr[i] + " ");
 }
}
