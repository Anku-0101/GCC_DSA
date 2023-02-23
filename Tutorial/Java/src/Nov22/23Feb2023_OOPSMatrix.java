import java.util.*;
import java.io.*;

class Main {  
    public static int LCM(int a , int b){
        int x = GCD(a,b);
        int res = x*(a/x)*(b/x);
        return res;
    }

    public static int GCD(int a , int b){
        return (b==0)?a:GCD(b,a%b);
    }
    
    // TC - O(n^2)
    // SC - O(n^2)
    public static int[][] sumOfMatrix(int arr [][], int nums [][]){
        if(arr.length != nums.length || arr[0].length != nums[0].length){
            System.out.println("Addition is not possible");
            return null;
        }

        int ans [][] = new int [arr.length][arr[0].length];
        
        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans[0].length; j++){
                ans[i][j] = arr[i][j]+nums[i][j];
            }
        }
        return ans;
    }
    
    
    public static int[][] productOfMatrix(int arr [][], int nums [][]){
        if(arr[0].length != nums.length){
            System.out.println("invalid input");
            return null;
        }

        int ans [][] = new int [arr.length][nums[0].length];
        
        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans[0].length; j++){
                for(int k=0; k<arr[0].length; k++){
                    ans[i][j] += (arr[i][k] * nums[k][j]);
                    //System.out.println(ans[i][j]);
                }
            }
        }
        return ans;
    }
    
    public static int[][] Transpose(int a[][],int m ,int n){
        int res [][]=new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[i][j]=a[j][i];
            }
        }
        return res;
    }

      
    public static void main(String args[]) {
       //System.out.println(LCM(5,18));
       // Interface can point to any of the 
       // concrete class which implements int
       
       Car car1 = new ManualCar();
       Car car2 = new AutomaticCar();
       Car car3 = new ElectricCar();

       //Car car4 = new Car();
        
        System.out.println("CAR1 DETAILS");
        car1.turnOnCar();
        car1.turnOffCar();
        
        System.out.println(car1.getCarType(0));
        
        System.out.println("CAR2 DETAILS");
        car2.turnOnCar();
        car2.turnOffCar();
        System.out.println(car2.getCarType(1));
       
       
    }
}
    
        
    
    interface Car{
        void turnOnCar();
        void turnOffCar();
        String getCarType(int carType);
    }
    
    class ElectricCar implements Car{
        private String carType = "Electric";
        
        public void turnOnCar(){
            System.out.println("turn on the Electric car");
        }
        
        
        public void turnOffCar(){
            System.out.println("turn off the Electric car");
        }
        
        
        public String getCarType(int cType){
            return this.carType;
        }
        
        
        public int YearsToExpire(){
            return 15;
        }
    }
    
    class ManualCar implements Car{
        
        private String carType = "Manual";
        
        public void turnOnCar(){
            System.out.println("turn on the manual car");
        }
        
        
        public void turnOffCar(){
            System.out.println("turn off the manual car");
        }
        
        
        public String getCarType(int cType){
            return this.carType;
        }
        
        
        public int YearsToExpire(){
            return 15;
        }
    }
    
    class AutomaticCar implements Car{
        private String carType = "Automatic";
        
        @Override
        public void turnOnCar(){
            System.out.println("turn on the automatic car");
        }
        
        @Override
        public void turnOffCar(){
            System.out.println("turn off the automatic car");
        }
        
        @Override
        public String getCarType(int cType){
            return this.carType;
        }
    }


    
    
    
    
    
    
    
    
    
    
    

