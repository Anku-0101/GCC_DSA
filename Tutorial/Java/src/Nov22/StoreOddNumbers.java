import java.util.*;

public class Main{
	public static void main(String[] args) {
		int[] oddList= GetOddNumber(50);
		
		for(int i = 0; i < 50; i++){
			System.out.print(oddList[i] + " ");
		}
	}

	public static int[] GetOddNumber(int x){
		int[] answer = new int[50];
		
		int count = 0;
		int start = 1;
		while(count < 50){
			if(start % 2 != 0){
				answer[count] = start;
				count++;
			}
			start++;
		}
		return answer;
	}
}
