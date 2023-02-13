public static void BeautifulFork(String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        int a,b,x,y;
        
        for(int i=0; i<T; i++){
            x = sc.nextInt();
            y = sc.nextInt();
            a = sc.nextInt();
            b = sc.nextInt();
            
            int[][] arrx = new int[9][9];
            int[][] arra = new int[9][9];
            
            arrx = getKnightPoints(x,y,arrx);
            arra = getKnightPoints(a,b,arra);
            
            boolean canFork = compareArray(arrx, arra);

            if(canFork)
                System.out.println("YES");
            else
                System.out.println("NO");
            /////
            
            
        }
    }

    static boolean compareArray(int[][] arr1, int[][] arr2){
        for(int i = 1; i<=8; i++){
            for(int j =1; j<=8; j++){
                if((arr1[i][j] == arr2[i][j]) && arr1[i][j] == 1){
                    return true;
                }
            }
        }

        return false;
    }

    static int[][] getKnightPoints(int x, int y, int[][] arrx){
            int p1x =  x - 2;
            int p1y =  y + 1;
            if((p1x <9 && p1x >0)&&(p1y < 9 && p1y > 0)){
                arrx[p1x][p1y] = 1;
            }

            p1x =  x - 2;
            p1y =  y - 1;
            if((p1x < 9 && p1x >0)&&(p1y < 9 && p1y > 0)){
                arrx[p1x][p1y] = 1;
            }

            p1x =  x - 1;
            p1y =  y + 2;
            if((p1x < 9 && p1x >0)&&(p1y < 9 && p1y > 0)){
                arrx[p1x][p1y] = 1;
            }

            p1x =  x + 1;
            p1y =  y + 2;
            if((p1x < 9 && p1x >0)&&(p1y < 9 && p1y > 0)){
                arrx[p1x][p1y] = 1;
            }

            p1x =  x + 2;
            p1y =  y - 1;
            if((p1x < 9 && p1x >0)&&(p1y < 9 && p1y > 0)){
                arrx[p1x][p1y] = 1;
            }
            
            p1x =  x + 2;
            p1y =  y + 1;
            if((p1x < 9 && p1x >0)&&(p1y < 9 && p1y > 0)){
                arrx[p1x][p1y] = 1;
            }

            p1x =  x + 1;
            p1y =  y - 2;
            if((p1x < 9 && p1x >0)&&(p1y < 9 && p1y > 0)){
                arrx[p1x][p1y] = 1;
            }


            p1x =  x - 1;
            p1y =  y - 2;
            if((p1x < 9 && p1x >0)&&(p1y < 9 && p1y > 0)){
                arrx[p1x][p1y] = 1;
            }

            return arrx;
    }

// Space complexity - O(N^2) .. 
// need to be optimized for the solution to get accepted 
public static void BinaryFlippingMatrix(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[][] arr = new int[N+2][M+2];

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= M; j++){
                // mark all neighbours as 1 if they are 0
                // mark all neighbours as 0 if they are 1
                arr[i+1][j+1] = 1 - arr[i+1][j+1];
                arr[i+1][j] = 1 - arr[i+1][j];
                arr[i+1][j-1] = 1 - arr[i+1][j-1];

                arr[i][j+1] = 1 - arr[i][j+1];
                arr[i][j] = 1 - arr[i][j]; // 0 -> 1, 1 -> 0 ::(1- arr[i][j])
                arr[i][j-1] = 1 - arr[i][j-1];

                arr[i-1][j] = 1 - arr[i-1][j];
                arr[i-1][j-1] = 1 - arr[i-1][j-1];
                arr[i-1][j+1] = 1 - arr[i-1][j+1];
            }
        }
        
        int count_one = 0;
        for(int i = 0; i <= N; i++){
            for(int j = 0; j <= M; j++){
                if(arr[i][j] == 1){
                    count_one++;
                }
            }
        }

        System.out.println(count_one);
    }

class ArrayListCustom{
    int[] data = new int[10]; // fixed capacity 10
    int curr = -1;
    
    public void add(int value){
        if(curr +1 == data.length){ // it is reaching the capacity
            // resize the array
            int capacity = 2*(data.length);
            // copy the old array to new array
            int[] arr = new int[capacity];
            for(int i = 0; i < data.length; i++){
                arr[i] = data[i];
            }
            
            // change the reference
            data = arr;
        }
        
        data[++curr] = value;
    }
    
    public int get(int index){
        // you can add check if(index < data.length) return 
        return data[index];
    }
}

class Main{
    
    
    public static void main(String[] args){
        ArrayListCustom myarrayList = new ArrayListCustom();
        
        myarrayList.add(9);
        myarrayList.add(29);
        myarrayList.add(19);
        myarrayList.add(0);
        myarrayList.add(11);
        myarrayList.add(6);
        myarrayList.add(2);
        myarrayList.add(5);
        myarrayList.add(4);
        myarrayList.add(6);
        myarrayList.add(7);
        myarrayList.add(8);
        myarrayList.add(9);
        myarrayList.add(10);
        
        System.out.println(myarrayList.get(0));
        System.out.println(myarrayList.get(10));
        System.out.println(myarrayList.get(13));
        
        
        
         
    }
