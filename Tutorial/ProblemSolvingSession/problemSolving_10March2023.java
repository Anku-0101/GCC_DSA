public static void Ropes(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        double ans = 0;
        
        double high = 1e9;
        double low = 0;

        // low <= high, high >= low
        while(high - low > 0.000001){
            double mid = low + (high-low)/2;

            int count = 0; // number of ropes of length = mid
            for(int i = 0; i < arr.length; i++){
                count += arr[i]/mid;
            }

            // re-iterating to find if we can cut 
            // even less than mid
            if(count >= k){
                ans = mid;
                low = mid;
            }else{
                high = mid;
            }
        }
        System.out.format("%.6f", ans);
    }

public static void AkashsContest(String[] args) {
        // Your code here
        // time = 10sec

        // xPrinter = 10/x 
        // yPrinter = 10/y

        // minm 0 copy maxmium copy int T time T/x + T/y = N
        // minm of(x,y)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int low = 1;
        int high = (int)2e9;

        int ans = 0;

        while(low <= high){
            int time_mid = low + (high-low)/2;

            int copies = (time_mid/x) + (time_mid/y);

            // 
            if(copies >= n-1){
                ans = time_mid;
                high = time_mid-1; // to check if we can get even less time for n-1 copies
            }else{
                low = time_mid+1;
            }
        }
        int timeToStartBothMachine = (x>y)?y:x; // by this time both machines will start and we'll have 1 copy also
        System.out.println(ans + timeToStartBothMachine);
  
    }


static int numOfMerge = 0; 
    public static void NumberOfMerge (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        mergeSort(arr);
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        
        System.out.println();
        System.out.println(numOfMerge);
    }

    static void mergeSort(int[] arr){
        int n = arr.length;
        
        // base condition, sorted array
        if(n < 2)
            return;
        int mid = n/2;
        // left and right // 2 to 5 -> endIndex - startIndex +1 -> 4
        // left -> 0 to mid-1;
        // right -> mid to n-1

        int[] left = new int[mid];
        for(int i = 0; i < mid; i++)
            left[i] = arr[i];

        int[] right = new int[n-mid];
        for(int i = mid; i < n; i++){
            right[i-mid] = arr[i]; 
        }

        mergeSort(left);
        mergeSort(right);

        mergeArray(left,right,arr);
    }

    static void mergeArray(int[] arr1, int[] arr2, int[] arr3){
        int i = 0;
        int j = 0;
        int k = 0;
        numOfMerge++;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                arr3[k] = arr1[i];
                i++;
            }else{
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i < arr1.length){
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while(j < arr2.length){
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        
    }


int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                break;
            }
            index++;
        }

        if(index != -1)
            for(int i = index; i >=0; i--)
                System.out.print(arr[i] + " ");
        
        for(int i = index+1; i <n; i++)
                System.out.print(arr[i] + " ");
