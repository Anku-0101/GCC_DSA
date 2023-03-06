public static void The HighMedianParadigm(String[] args) {
        // Your code here9
        Scanner sc=new Scanner(System.in);
           int N = sc.nextInt();
        int sum = sc.nextInt();

        int medianIndex = N/2;

        int median = sum/(N-medianIndex);
        if(N%2 != 0)
            System.out.println(median);
        if(N%2 == 0){
            median = sum/(N-medianIndex+1);
            System.out.println(median);
        }
  
 
 
