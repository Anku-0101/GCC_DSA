 public static void N_And_2XN(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]a = new int[n];

        for(int i=0; i<n; i++){
            a[i] =sc.nextInt();
        }
        Arrays.sort(a); // O(n*log(n));

        boolean found = false;

        // in the worst case how many times is binary search called
        // O(n*long(n))
        // for binary search - log(n)
        // here we're calling binary search n number of times 
        // so total complexity = O(n*log(n))
        for(int i=0; i<n; i++){
            if(binarySearch(a, a[i]*2)){ // arr[i] != 2*arr[i], arr[i] >= 1
                found = true;
                break;
            }
        }
        
        if(found){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
       
    }

    // TC : log(n)
    static boolean binarySearch(int[] arr, int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start <= end){
            int mid = start +(end-start)/2; // to prevent overflow
            if(arr[mid] == target){
                return true;
            }

            if(arr[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }
