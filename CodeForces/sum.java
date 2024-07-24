import java.util.*;
public class sum{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();

        while(n-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            boolean c1 = (a == b+c);
            boolean c2 = (b == a+c);
            boolean c3 = (c == a+b);

            if(c1||c2||c3){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}