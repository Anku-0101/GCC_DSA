public static void ThirdMaximum(String[] args) throws IOException{
        // Your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str[] = br.readLine().split(" ");
        
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(str[i]);
            //System.out.println("arr[" + i + "] = " + arr[i]);
        }

        int firstIndex = 0, secondIndex = 0, thirdIndex = 0;

        for(int i =0; i<n; i++){
            if(arr[i] >= arr[firstIndex]){
                thirdIndex = secondIndex;
                secondIndex = firstIndex;
                firstIndex = i;
            }
            if((arr[i] > arr[secondIndex]) && (arr[i] < arr[firstIndex])){
                thirdIndex = secondIndex;
                secondIndex = i;
            }
            if((arr[i] > arr[thirdIndex])&& (arr[i] < arr[secondIndex])){
                thirdIndex = i;
            }
        }
        System.out.println(arr[thirdIndex]);
    }

static char Race(int A,int B,int C){
//Enter your code here
    int distanceN = ((C-A) < 0) ? (A-C) : (C-A);
    int distanceS = ((C-B) < 0) ? (B-C) : (C-B);

    if(distanceN == distanceS){
        return 'D';
    }

    return (distanceN < distanceS) ? 'N' : 'S';
}

static void Pattern05_02_23(int N){
    System.out.println('*');

    for(int i = 2; i <N; i++){
        System.out.print('*');
        int j = i-1;
        
        while(j-- > 0)
            System.out.print('^');

        System.out.print('*');

        System.out.println();
    }

    for(int i =1 ; i <= N+1; i++)
        System.out.print('*');
}


public static void CalculateBMI(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        w = w*0.453592;
        h = h*0.0254;
        double BMI = w / (h*h); // ->(B/h)*h XX :: (B/(h*h))
        System.out.printf("%"+".2f" , BMI );
    }

static int QueenAttack(int X, int Y, int P, int Q){
//Enter your code here
    if(X==P)
        return 1;
    if(Y==Q)
        return 1;
    if((X-P) == -1*(Y-Q))
        return 1;
    if((X-P) == (Y-Q))
        return 1;
    else
        return 0;
}
