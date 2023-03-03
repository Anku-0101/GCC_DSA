public static void FindIt(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();

        // input space, 1 <= x <= 10^9

        long start = 1;
        long end = (long)1e9;
        //System.out.println(end);
        boolean found = false;

        while(start <= end){
            long mid = start + (end-start)/2;

            long val = mid*mid + 3*mid;

            if(val == k){
                System.out.println(mid);
                found = true;
                return;
            }
            if(val > k){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        if(!found)
            System.out.println(-1);
    }

        // O(1) * O(sqrt())
        static double findRoot(double k){
            int a=1, b =3;
            double x1,x2;
            double D = ((b*b)-(4*a*(-1*k)));
            
            if(D>0){
                x1 = (((-1*b)-(Math.sqrt(D)))/2);
               // System.out.println(x1);

                // 85.98
             x2 = (((-1*b)+(Math.sqrt(D)))/2);
              //  System.out.println(x2);


                if(x1>0 && x2<0){
                   return x1;
                }
              


                else if(x2>0 && x1<0){
                  return x2;
                }
              
                else if(x1>0 || x2 >0){
                  return x1;
                }

            }
            else if(D==0){
                x1 = ((-1*b)/(2*1));

                if(x1>0){
                    return x1;
                }
            }

            if(D<0){
                return -1;
            }
            return -1;
            
        }

    public static void FindIt_BinarySearch(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        double k = sc.nextDouble();
        double output = findRoot(k); // rational -> 1.23, 87.65

        if(output%1 == 0){ // the number is integer
            System.out.println((int)output); // type case into integer
        }else{
            System.out.println("-1");
        }
        
    }



public static void MedianofTwosortedArrays(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
         arr[i] = sc.nextInt();     
        }
        int[] arr1 = new int[m];
        for(int i=0;i<arr1.length;i++){
        arr1[i] = sc.nextInt();      
        }
        
        int[] merge = new int[arr.length+arr1.length];
        mergeArray(arr,arr1,merge);
        // for(int i=0;i<merge.length;i++){
        // // System.out.print(merge[i]+" ");      
        // }

        int a = merge.length;
        if(a%2==0){
            double n1 = merge[(a-1)/2];
            double n2 = merge[(a-1)/2+1];
            double ans = (n1+n2)/2;
            System.out.printf("%.2f",ans);
        }
        else{
            double n1 = merge[(a)/2];
            System.out.printf("%.2f",n1);
        }     
    }
     static void mergeArray(int[] arr1, int[] arr2, int[] merged){
        int i=0;
        int j=0;
        int k=0;
    while (i < arr1.length && j < arr2.length)
        {
            if (arr1[i] < arr2[j]) {
                merged[k] = arr1[i];
                i++;
                k++;
            } 
            else{
                merged[k] = arr2[j];
                j++;
                k++;
            }
        } 
                 
        while (i < arr1.length){
            merged[k] = arr1[i];
            i++;
            k++;
        } 
                 
        while (j < arr2.length){
            merged[k] = arr2[j];
            j++;
            k++;
        } 
             
        // return merged;
    }


public static void ResultofDivisionContest(String[] args) throws IOException {
        // Your code here
        
    //   BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
      String[] input = new String[2]; 
      long a; 
      long b; 

        // System.out.print("Please enter two integers: "); 
        input = in.readLine().split(" "); 

       a = Integer.parseInt(input[0]); 
       b = Integer.parseInt(input[1]); 
            // int a = Integer.parseInt(br.readLine());
            // int b = Integer.parseInt(br.readLine());


        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        long res = b%a;
        if(res%1!= 0){
            System.out.print("double");
        }
        else{
            System.out.print("integer");
        }
    }
