import java.util.*;

public class Main{
	// 
	public static void main(String[] args) {
		
		//FindPrimes(500);
		FindPrimesSieveMethod(500);
		
	}
	
	public static void FindPrimesSieveMethod(int N){
		// false -> prime 
		// true -> composite
		boolean[] prime = new boolean[N+1]; // O(N)
		
		for(int i = 2; i*i < N+1; i++){
			if(prime[i] == false){
				//marking of composite numbers
				for(int  j = i; i*j < N+1; j++){
						prime[i*j] = true; // mark
				}
			}
		}
		
		// Iteration i = 2 -> false -> prime 
		// j = 2 to N 
		//			2*2 = true, 2*3 = true, 2*4 = true, 2*5 = true, 2*6 = true, 2*x = true
		// i = 3 
		// 		3*3 = true, 3*4 = true, 3*5 = true, ... 
		// i = 4 -> i++
		// i = 5 
		//		5*5 = true, 5*6 = true, .... 
		// i =6 -> i++
		// i = 7 
		//		7*7 = true, 7*8 = true, ... 
		// print to check 
		for(int i = 2; i<N+1; i++){
			if(prime[i] == false)
				System.out.print(i + " ");
		}
	}
	
	public static void FindPrimes(int N){
		for(int i =2; i <= N; i++)
			if(IsPrime(i))
				System.out.print(i + " ");
	}

	public static boolean IsPrime(int n){
		for(int i = 2; i*i <= n; i++)
			if(n%i == 0)
				return false;
		
		return true;
	}
}
