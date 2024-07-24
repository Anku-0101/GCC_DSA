import java.util.*;
public class AgainTwentyFive{
    public static void main(String[] args) {
        long n = (new Scanner(System.in)).nextLong();
        if(n == 1){
            System.out.println(5);
        }
        else{
            System.out.println(25);
        }
        //int res = getRem(5,n,100);
        //System.out.println(res);
    }

    static int getRem(int x, int n, int M){
        if(n == 0){
            return 1;
        }
        if(n%2 == 0){
            int y = getRem(x, n/2, M);
            return (y%M)*(y%M)%M;
        }
        int y = getRem(x, n-1, M);
        return (y%M)*(x%M)%M;
    }
}