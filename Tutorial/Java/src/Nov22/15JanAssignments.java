import java.util.*;

class Main{
    static int[][] matrixa = new int[9][9];
    
    public static void main(String[] args){
        //Permutation("abcd");
        //int arr[] = {2,4,5,7,9,11,13,15,17,19};
        //System.out.println(TernarySearch(arr, 2, 0, arr.length-1));
        System.out.println(totalPaths(9,9,0,0));
    }
    
    static void MakeAB_Equal(){
        // Your code here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] A=new int[N];
        int[] B=new int[N];
        for(int i=0;i<N;i++)
        {
            A[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            B[i]=sc.nextInt();
        }
        System.out.print(equal(A,B,N));
    }
    
    }
    
    public static int equal(int[] a, int[] b, int n)
    {
        int swap=0;
        int aOneCount=0;
        int bOneCount=0;
        for(int i=0;i<n;i++)
        {  
            bOneCount += b[i];
            aOneCount += a[i];
        }

        // 
        for(int i=0;i<n;i++)
        {
          //  bOneCount+=b[i];

            if(a[i]!=b[i])
            {
                swap++;
            }
        }
        
        // swap + arrange
        int swap_arrange = Math.abs(aOneCount-bOneCount)+1;

        // swap
        int min  = Math.min(swap_arrange, swap);
        return min;
    }
    static void MaxNumbers(){
        Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       for(int k=0;k<t;k++){
           int n = sc.nextInt();
           //int A [] = new int[n];
           
           //for(int i=0;i<n;i++){
            //   A[i]=sc.nextInt();
            //}
            int first=0;
            int second=0;
            int third=0;

            for(int i=0;i<n;i++){
              int ele = sc.nextInt();
              if(ele>first){
                  third=second;
                  second = first;
                  first=ele;
              }
               else if(second<ele){
                   third = second;
                   second=ele;
               }
               else if (third<ele)
                   {
                   third=ele;
               }
               
               if(i%10000 ==0){
                    System.gc();  
                }
            }

            System.out.println(first+" "+second+" "+third);        
       }
    }   
    
        
    static int Phone(int N, int K, int M){
        if(N*K < M)
            return -1;

        if(M%K == 0)
            return M/K;

        return M/K + 1;
    }
        
    public static int totalPaths(int n, int m, int i, int j){
        if (i==n-1|| j==m-1){
            matrixa[i][j] = 1;
            return matrixa[i][j];
        }
    //        if(matrixa[i][j] != 0)
    //          return matrixa[i][j];
        
        matrixa[i][j]= totalPaths(n,m,i+1,j) + totalPaths(n,m,i,j+1);
        return matrixa[i][j];
    }
        
}
