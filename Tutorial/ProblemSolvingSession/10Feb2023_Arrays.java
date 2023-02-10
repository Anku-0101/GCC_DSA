public static void EvenSumPair (String[] args){
        // Your code here
        // space complexity : O(1)
        // time complexity : O(N)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        int countOdd = 0;
        for(int i = 1; i <= 2*n; i++){
            int inp = sc.nextInt();
            if(inp%2 != 0)
                countOdd++;
        }

        if(countOdd%2 == 0) // number of odd numbers is even so it can form even pair
            System.out.println("YES");
        else // number of odd number(s) is odd so it can't form even pairs
            System.out.println("NO");
    }

// Time Complexity - O(N^2)
// Space Complexity - O(N)

public static void maxFreqUnOptimized(String[] args) throws IOException{
        // Your code here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int arr[]=new int[N];
        String str[]=br.readLine().split(" ");
        //System.out.println("N = " + N);
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(str[i]);
            //System.out.println("arr[ " + i +"]= " + arr[i]);
        }

        int maxFreq = 0;
        int maxElement = 0;
        for(int i=0;i<N;i++)
        {
            int count=0;
            for(int j=0;j<N;j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                }
            }
            // if maximum count is found
            if(count >= maxFreq)
            {
                // count -> current frequency of element if
                // compared with past frequency
                
                if((maxElement < arr[i]) || (maxFreq < count))
                    maxElement = arr[i];
                
                maxFreq = count;
                
            }
        }
        System.out.println(maxElement);
    }
}


// Time complexity - O(N)
// Space complexity - O(1)
public static void maxFreqOptimized(String[] args) throws IOException{
        // Your code here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        //int arr[]=new int[N];
        String str[]=br.readLine().split(" ");
        //System.out.println("N = " + N);

        int count[] = new int[101]; // it doesn't depend on input array length, or independent of input

        for(int i=0; i<N; i++){
            int x = Integer.parseInt(str[i]);
            count[x] += 1;
            //System.out.println("arr[ " + i +"]= " + arr[i]);
        }

        int maxFreq = 0;
        for(int i = 1; i<=100; i++){
            if(count[i] > maxFreq){
                maxFreq = count[i];
                //System.out.println("element = " + i + "max freq = " + maxFreq);
            }
        }


        int maxElement = 0;

        for(int i = 1; i <= 100; i++){
            if(count[i] == maxFreq && (maxElement < i))
                maxElement = i;
        }
        System.out.println(maxElement);
