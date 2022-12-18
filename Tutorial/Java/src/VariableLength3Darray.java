import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of schools \n");
        int numOfSchool = sc.nextInt();
        
        int[][][] arr=new int[numOfSchool][][];
        store_data(arr);
        print_data(arr);
    }


    public static void store_data(int[][][] arr){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter number of students in school = " + (i+1));
            int numOfStudent = sc.nextInt();
            arr[i] = new int[numOfStudent][];
            for(int j = 0; j < arr[i].length; j++){
                System.out.println("Enter number of subjects for school = " + (i+1) + " and student = " + (j+1));
                int numberOfSubjects = sc.nextInt();
                arr[i][j] = new int[numberOfSubjects];
                for(int k = 0; k < arr[i][j].length; k++){
                    System.out.println("Enter mark of subject " + (k+1) + "for school = " + (i+1) + " and student = " + (j+1));
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
    }
    
    public static void print_data(int[][][] arr){
        for(int i =0; i<arr.length; i++){
            System.out.println("Data for school = " + (i+1));
            for(int j = 0; j < arr[i].length; j++){
                System.out.println("Data for student = "+ (j+1));
                for(int k = 0; k < arr[i][j].length; k++){
                    System.out.println("Mark for subject = " + (k+1) + " " + arr[i][j][k] + "\n");
                    
                }
            }
        }
    }

}
