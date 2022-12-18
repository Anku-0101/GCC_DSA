import java.util.*;

public class Main{
	// 
	public static void main(String[] args) {
		int arr[][] = new int[6][]; // it is comprised of 6 1-D array // each of size 4
		StoreMarks(arr);
		
	}
	
	public static void StoreMarks(int[][] arr){
		int numOfStudent = arr.length; 
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < numOfStudent; i++){
		    System.out.println("Number of subjects student with roll number = "+(i+1));
		    int sub = sc.nextInt();
		    arr[i] = new int[sub];
		    for(int j = 0; j < arr[i].length; j++){
				System.out.println("Enter mark of student roll = " +  (i+1) + " of subject = " + (j+1));
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i<numOfStudent; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.println("Mark of student roll = " + (i+1) + " of subject " + (j+1) + " = " + arr[i][j]);
				//arr[i][j] = sc.nextInt();
			}
		}
	}
}
