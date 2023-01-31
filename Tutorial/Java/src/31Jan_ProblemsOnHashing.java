public static void RepeatedCharactersAndTheirCount(String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
       
       String str=sc.nextLine();
       int[] arr=new int[26];

       for(int i=0;i<n;i++) {
            char ch = str.charAt(i);
            int index = ch-'a'; 
            arr[index]++;
       }

       for(int i=0;i<26;i++){
           if(arr[i]>1){
               char ch=(char)(i + 97);
               System.out.println(ch + " " + arr[i]);
           } 
       }
    }

static int[] arr = new int[50];
    public static void trifibonacci(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = trifibM(n); 
        System.out.println(res);
    }
    
    // without recursion with memoization 
    static int trifib(int n){
        if(n < 3)
            return 0;
        
        if(n == 3)
            return 1;
        
        return trifib(n-1) + trifib(n-2) + trifib(n-3);
    }

    static int trifibM(int n){
        if(n < 3)
            return 0;
        
        if(n == 3)
            return 1;
        
        if(arr[n] != 0)
            return arr[n];
        
        return arr[n] = trifib(n-1) + trifib(n-2) + trifib(n-3);
    }
}

import java.util.*;

class Main{
    public static void main(String[] args){
        int[] arr = {2,3,4,5,2,4,5,1};
        Random(arr);
        System.out.println(countDistinct(arr));
        
        
        //for(int i = 0; i< arr.length; i++){
        //    System.out.print(arr[i]+ " ");
        //}
    }
    
    // TC -> O(n^2)
    static int countDistinct(int[] arr){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            int flag = 0;
            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
                count++;
        }
        return count;
    }


    static void Random(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int n = arr.length;
        while(start < end){
            int ptr = (start+end)/2;
            int index1 = (start+end)%n;
            
            int temp = arr[ptr];
            arr[ptr] = arr[index1];
            arr[index1] = temp;
            
            start++; end--;
        }
    }
    
}
