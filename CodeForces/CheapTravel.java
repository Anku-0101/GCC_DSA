import java.util.*;

public class CheapTravel{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // num of trips
        int m = sc.nextInt(); // number of trips by pass
        int a = sc.nextInt(); // cost of each trip without pass
        int b = sc.nextInt(); // cost of pass
        

        int cost1 = n*a;
        int cost2 = (n%m)*a < b ? (n%m)*a : b;
        int cost3 = cost2+(n/m)*b;
        
        if(cost1 > cost3){
            System.out.println(cost3);
        }
        else{
            System.out.println(cost1);
        }
        
    }
}