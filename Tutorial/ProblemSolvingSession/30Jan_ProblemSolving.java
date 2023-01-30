static int RotationPolicy(int A, int B){
//Enter your code here
// D and L, (i-1)%2 && (i-1)%3
// LCM -> 6, 
// 2 and 3 -> 6, 12, 18
// 2, 6, 8, 12, 14, 18, 20, 24
    int count  = 0;
    for(int i = A; i <= B; i++){
        if((i-1)%2 != 0 && (i-1)%3 != 0){
            count++;
        }
    }
    return count;
}

static int Phone(int N, int K, int M){
    // total memory -> N*K 
    /*
    // if total memory is less than the memory required to free up
    // then we can say it's not possible
    if(N*K < M)
        return -1;
    
    // M = 10 units 
    // N = 8, K = 2 -> total memory = 15
    // if 2 app -> 4
    // if 3 app -> 6
    // if 4 app -> 8
    // if 5 app -> 10
    // M/K = 10/2 -> 5
    // M/k -> 10/3 -> 3 + 1
    if(M%K == 0)
        return M/K;
    
    return M/K+1;*/
    if(N*K < M)
        return -1;
    int x = M%K; // 0 , 1, 2 , ... K-1
    // num/10 -> 0,1,2,3,4,5,6,7,8,9
    

    switch(x){
        case 0:
            return M/K;
        default :
            return M/K+1;
    }
}


    public static void ShinchanKazama(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int S = sc.nextInt();

        int V = S ;
        int D = A-B;
        
        if(D < 0)
            D = -1*D;

        int T = D/V;
        System.out.println(T);
    }
