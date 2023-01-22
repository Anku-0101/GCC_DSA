import java.util.*;

class Main{
    public static void main(String[] args){
        
    }
    
    public static void PolynomialEquation(String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        long k=sc.nextLong();
        
        // apply binary search
        // arr -> 0,1,2,3,4,5,....100000000
        long start = 0;
        long end = 100000000; // (10^7 and 10^8)
        long ans = 0;

        while(start <= end){
            long mid = (end+start)/2;
            long value = a*mid*mid + b*mid + c;

            if(value >= k){
                ans = mid;
                end = mid-1;
            }
            else
                start = mid+1;
        }
        System.out.println(ans);
    }
    
    public static void ChessBoard(String[] args) throws IOException {

                      BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
                      int n = Integer.parseInt(sc.readLine());
                      String[] arr = new String[n];
                      for(int i = 0  ; i < n ; i++){
                         arr[i] = sc.readLine();
                      }

                      int initial =1, paintWhenStartWithOne = 0;
                      for(int i = 0 ; i < n ;i++){
                          int current = initial;
                          for(int j = 0 ; j < arr[i].length() ; j+=2){
                              int val = (int)arr[i].charAt(j) - 48;

                              if(current != val)
                                paintWhenStartWithOne++;

                                current = 1-current; // if 1 -> 0 , if 0->1
                          }
                          initial = 1-initial; // if 1 -> 0 , if 0->1
                      }

                      initial =0;
                      int paintWhenStartWithZero = 0;
                      for(int i = 0 ; i < n ;i++){
                          int current = initial;
                          for(int j = 0 ; j < arr[i].length() ; j+=2){
                            int val = (int)arr[i].charAt(j)-48;
                            if(current != val)
                                paintWhenStartWithZero++;

                                current = 1-current;
                          }
                          initial = 1-initial;
                      }


                      int ans = Math.min(paintWhenStartWithOne, paintWhenStartWithZero);
                      System.out.println(ans);

	}
    
    public static void BooleanMatrix(String[] args)throws Exception {
        //Scanner sc = new Scanner(System.in);
        //int t = sc.nextInt();

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);

        int t = Integer.parseInt(bf.readLine());
        //System.out.println("t = " + t);
        while(t-- > 0){
        
            //int m = sc.nextInt();
            //int n = sc.nextInt();
            String inputs[] = bf.readLine().split(" ");
            
            int m = Integer.parseInt(inputs[0]);
            int n = Integer.parseInt(inputs[1]);
            //System.out.println("m = " + m + " n = " + n);

            StringBuilder sb1 = new StringBuilder("");
            StringBuilder sb0 = new StringBuilder("");

            for(int i =0; i <n; i++){
                sb1.append("1 "); 
                sb0.append("0 ");
            }

            String[] matrix = new String[m];
            
            for(int i=0; i<m; i++){
                matrix[i] = bf.readLine();
            }

            //for(int i=0; i<m; i++){
            //    System.out.println(matrix[i]);
            //}

            for(int i = 0; i < m; i++){
                boolean isOne = false;
                
                if(matrix[i].contains("1"))
                    isOne = true;
                

            
                if(isOne){
                    System.out.print(sb1);
                    //for(int j = 0; j < n; j++)
                      //  System.out.print("1 ");
                }
                else{
                    System.out.print(sb0);
                    //for(int j = 0; j < n; j++)
                      //  System.out.print("0 ");
                }
                System.out.println();
            }
        }
    }
}
