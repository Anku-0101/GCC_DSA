import java.util.*;

class Main{
    public static void main(String[] args){
        //lowerCase("IndiaIsGREAT*!1");
        //int arr[][] = {{1,3,5},
          //              {4,5,-1},
            //            {3,2,9}};
                        
        //Print(arr, arr.length, arr[0].length);
        int arr[] = {4,0,2,5,1,-3,4,7};
        arr = SelectionSort(arr);
        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
        
    }
    
    // TC - O(n^2)
    // Space complexity : O(1)
    // Non - recursive
    public static int[] SelectionSort(int[] arr){
      for(int i = 0; i < arr.length-1; i++){
          // assuming first element is the minimum
          int min = arr[i];
          int index = i;
          
          // finding minimum in i+1 to last index
          for(int j = i+1; j < arr.length; j++){
              if(min > arr[j]){
                // our assumption is wrong
                min = arr[j];
                index = j;
              }
          }
          // what to swap ??
          // arr[i] with arr[index]
          if(index != i){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
          }
          
      }
      return arr;  
    }
    
    public static void BoundaryTraversalofMatrix(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            int arr[][] = new int[n][m];

            // Invariant for traversing a 2D array using 
            // one for loop is the number of columns or the 2nd dimension
            for(int i = 0; i < n*m; i++)
                arr[i/m][i%m] = sc.nextInt();
            
            printBoundary(arr);
            System.out.println();
        }
        
    }

    static void printBoundary(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;

        for(int i = 0; i < m; i++){
            System.out.print(arr[0][i] + " ");
        }
        for(int i = 1; i < n; i++){
            System.out.print(arr[i][m-1] + " ");
        }
        if(n > 1){
            for(int i = m-2; i > 0; i--){
                System.out.print(arr[n-1][i] + " ");
            }
        }
        
        if(m > 1){
            for(int i = n-1; i > 0; i--){
                System.out.print(arr[i][0] + " ");
            }
        }
        
    }
    
    public static void KillingMonsters(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] A=new int[N+1];
        int[] B=new int[N];
        for(int i=0;i < N+1;i++)
        {
            A[i]=sc.nextInt();
        }
        int ans = 0;

        for(int i=0;i<N;i++)
        {
            B[i] = sc.nextInt();
            int monsters = A[i] + A[i+1]; // before : A[i] = A[i] + A[i+1]

            int res = Math.min(B[i], monsters);
            ans += res;
            
            if(res > A[i]){
                A[i+1] -= res - A[i]; // before : A[i+1] -= ans - A[i]
            }
            
        }

        System.out.println(ans);

    }
    public static void Print(int[][] arr, int m, int n){
        for(int i = 0; i < m*n; i++){
           System.out.print(arr[i/n][i%n] + " ");
        }
    }
    public static void lowerCase(String S) {
        int n=S.length();
        for(int i=0;i<n;i++) {
            int a=(int)S.charAt(i);
            
            if(a>=65 && a<=90) {
                a = a+32;
            }
            char ch=(char)a;
            System.out.print(ch);
        }
    }    
    
}
