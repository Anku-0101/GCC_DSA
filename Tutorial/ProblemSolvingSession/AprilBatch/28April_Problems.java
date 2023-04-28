import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double value=3.1415926536;
    
    
        System.out.printf("%."+n+"f",value);

    }
}

/////////////////

class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        double x = Math.PI*(10000000000L); 
        long y = (long)x;
        //System.out.println("integral y = " + y);
        if(n == 1){
            long res = y/(1000000000L);
            double ans = (double)res/10;
            System.out.println(ans);
        }
        //System.out.println(y);

    }
}


///////// 

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int pa = sc.nextInt();
            int pb = sc.nextInt();
            int maxTimeP = (pa > pb) ? pa : pb;
            int qa = sc.nextInt();
            int qb = sc.nextInt();
            int maxTimeQ = (qa > qb) ? qa : qb;

            if(maxTimeP == maxTimeQ){
                System.out.println("TIE");
            }
            if(maxTimeP > maxTimeQ){
                System.out.println("Q");
            }
            else if(maxTimeQ > maxTimeP){
                System.out.println("P");
            }
        }
    }
}
