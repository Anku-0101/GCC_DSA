public static void OddEvenPattern(String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i = 1; i <= 2*n; i++){
            int count = i;
            if(i%2 != 0){
                while(count-- > 0)
                    System.out.print("*");
            }
            else{
                count = (i-1);
                while(count-- > 0)
                    System.out.print("##");
            }
            System.out.println();
        }
    }

public static void GrossPay (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int num = sc.nextInt();
            if(num < 1500){
                float basic = 1.00f*num;
                float hra = 0.10f*basic;
                float da = 0.90f*basic;
                System.out.printf("%.2f", basic+hra+da);

            }
            else{
                float basic = 1.00f*num;
                float hra = 500;
                float da = 0.98f*basic;
                System.out.printf("%.2f", basic+hra+da);

            }
            System.out.println();
        
        }
    }

public static void FindingRoots(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        

        float second = (float)(b*b - 4*a*c);

        if(second < 0){
            double first = -b/(2*a);

            
            float root = (float)Math.sqrt(-second)/(2*a);
            //second = second/2*a;

            System.out.printf("%.2f", first);
            System.out.print("+i");
            System.out.printf("%.2f", root);

            System.out.println();

            System.out.printf("%.2f", first);
            System.out.print("-i");
            System.out.printf("%.2f", root);
        }
        else{
            float first = -b/(2*a);

            float root = (float)Math.sqrt(second)/(2*a);
            

            System.out.printf("%.2f", first+root);
            System.out.println();
            System.out.printf("%.2f", first-root);
        }
    }


