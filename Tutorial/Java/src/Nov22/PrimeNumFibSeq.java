class problems:
Prime number:
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i = 2 ; i<=a;i++){
		    if(isprime(i))
		    System.out.print(i+" ");
		    else
		    continue;
		}
		
	}
	public static boolean isprime(int num){
	    int count=0;
	    for(int i =1;i<num;i++){
	        if(num%i==0){
	            count++;
	        }
	    }if(count==1)
	        return true;
	    else
	    return false;
	}
}

fabbinaci series:
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int a=0,b=1,temp;
		int nums=sc.nextInt();
		for(int i = 1 ; i<=nums;i++){
		   System.out.print(b+ " ");
		   temp=b;
		   b=a+b;
		   a=temp;
		}
		
	}
}