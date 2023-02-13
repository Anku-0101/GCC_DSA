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
