import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int[][][] arr=new int[2][3][1];
        store_data(arr);
        print_data(arr);
    }

///
public static void store_data(int[][][] arr){
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<arr.length; i++){
        // sout "Enter data for school (i+1)"
        for(int j=0;j<arr[i].length ;j++){
            for(int k=0;k<arr[i][j].length; k++){
                System.out.println("For School no. = "+(i+1)+" and student roll no.  = "+(j+1)+"Enter mark of in  subject = "+(k+1) +"\n");
                arr[i][j][k]=sc.nextInt();}
        }
    }
}

public static void print_data(int[][][] arr){
    for(int i=0;i<arr.length; i++){
        for(int j=0;j<arr[i].length; j++){
            for(int k=0;k<arr[i][j].length; k++){
                System.out.println("School no. = "+(i+1)+" and Stdent roll no. = "+(j+1)+" and mark in subject = "+(k+1)+ " " +arr[i][j][k] + "\n");
            }
        }
    }
}

}
