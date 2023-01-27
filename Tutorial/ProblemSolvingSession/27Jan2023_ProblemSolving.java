public static void Printsquare(String[] args) {
        // Your code here
        // 1. solve by using for loop 
            // let's solve by 2 different ways
        // 2. solve by using while loop
            // let's solve by 2 different ways
        // 3. solve by using do-while loop
            // let's solve by two different ways

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // for loop method 1
        //for(int i = 1; i <= n; i++){
        //    System.out.println(i*i);
        //}

        //for loop method 2
        //for(int i = 1; i != n+1; i++){
        //    System.out.println(i*i);
        //}
        /*
        // for loop method 3
        for(int i = n; i>=1; i--){
            int res = (n-(i-1))*(n-(i-1));
            System.out.println(res);
        }*/
        // while method 1
        //int i = 0;
        //while(++i <= n){
        //    System.out.println(i*i);
        //}
        // while method 2
        //int N = n;
        //while(n >0){
        //    int val = (N-(--n));
        //    System.out.println(val*val);
        //}
        // do - while loop
        int i = 1;
        do{
            System.out.println(i*i);

        }
        while(++i <= n);

    }

public static void IsAlphabet(String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        char ch =sc.next().charAt(0);
        int val =(int)ch;
        if((val>=65) && (val<=90)){
            System.out.println("YES");
            return;
        }
        if((val>=97) && (val<=122)){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
        
    }

public static void ValueofPI(String[] args) {
        // Your code here
        Scanner sc=new Scanner (System.in);
        String n = sc.next();
        //String str = "";
        //str += "." + n + "f"; // "n.f"
        
        // string can be concatinated 
        System.out.printf("%."+n+"f", Math.PI);
    }

public static void FizzBuzz(String [] args){

        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();

        for (int i=1; i<=n; i++){  

            if (i%3==0 && i%5==0){
                System.out.print("FizzBuzz ");
                continue;
            }

            else if(i%5==0){
                System.out.print("Buzz ");
            }

            else if(i%3==0){
                System.out.print("Fizz ");
            }

            else{
                System.out.print(i+" ");
            }      
        }
    }
public static void Bidding(String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        //System.out.println("N = " + N);

        for(int i=0;i < N; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            //System.out.println("A = " + A + "B = " + B + "C = " + C);
            
            if(A>B && A>C){
                System.out.println("Alice");
            }
            else if(B > C && B > A){
                System.out.println("Bob");
            }
            else if(C > A && C > B){
                System.out.println("Charlie");
            }
        }
    }

public static void SaleSeason(String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-- > 0){
            int X=sc.nextInt();
            
            if (X <= 100){
                System.out.println(X);
            }
            
            else if (X>100 && X <= 1000){
                System.out.println(X-25);
            }
            else if (X>1000 && X<=5000){
                System.out.println(X-100);
            }
            else if(X > 5000)
            {
                System.out.println(X-500);
            }
        }

    }

  static void Print_Digits(int N){
    //Enter your code here
    String s = Integer.toString(N);

    for(int i=0; i< s.length(); i++){
      char x = s.harAt(i);
      
      if(x == '1')
        System.out.print("one ");
      
      if(x == '2')
        System.out.print("two ");
      
      if(x == '3')
        System.out.print("three ");

      if(x == '4')
        System.out.print("four ");
      
      if(x == '5')
        System.out.print("five ");
      
      if(x == '6')
        System.out.print("six ");
      
      if(x == '7')
        System.out.print("seven ");
      
      if(x == '8')
        System.out.print("eight ");
      
      if(x == '9')
        System.out.print("nine ");
      
      if(x == '0')
        System.out.print("zero ");
      
      
    }

  }
