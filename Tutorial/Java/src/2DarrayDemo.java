import java.util.*;

public class Main{
	// 
	public static void main(String[] args) {
		int arr[][] = new int[3][2];
		StoreMarks(arr);
		
	}
	
	public static void StoreMarks(int[][] arr){
		int numOfStudent = arr.length; 
		int numOfSubject = arr[0].length;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < numOfStudent; i++){
			for(int j = 0; j < numOfSubject; j++){
				System.out.println("Enter mark of student roll = " +  (i+1) + " of subject = " + (j+1));
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i<numOfStudent; i++){
			for(int j = 0; j < numOfSubject; j++){
				System.out.println("Mark of student roll = " + (i+1) + " of subject " + (j+1) + " = " + arr[i][j]);
				//arr[i][j] = sc.nextInt();
			}
		}
	}
}
