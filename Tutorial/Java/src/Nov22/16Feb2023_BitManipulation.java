public static void ChecKiFNAnd2_N_Exist(String[] args)throws IOException{
  BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] arr = bf.readLine().split(" ");
        int[] nums = new int[arr.length];

        for(int i = 0; i < nums.length; i++){
            nums[i] = Integer.parseInt(arr[i]);
        }
        mergeSort(nums); // nlog(n)

        boolean found = false;
        
        // nlog(n)
        for(int i = 0; i < nums.length; i++){
            int index = BinarySearch(nums, nums[i]*2);

            if(index != -1 && index != i ){
                System.out.println("YES");
                found = true;
                break;
            }
        }

        if(!found)
            System.out.println("NO");

        
    }

    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    static void mergeSort(int[] arr){
    int n = arr.length;
    if(n < 2)
        return;

    int start = 0;
    int end = arr.length-1;

    int mid = n/2;

    int left[] = new int[mid]; // 0 to mid-1
    for(int i = 0; i < mid; i++)
        left[i] = arr[i];

    int right[] = new int[n-mid];
    for(int i = mid; i < n; i++)
        right[i-mid] = arr[i];

    mergeSort(left);
    mergeSort(right);
    merge(left,right, arr);
    }

    static void merge(int[] left, int[] right, int[] arr){
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                arr[k++] = left[i];
                i++;
            }
            else{
                arr[k++] = right[j];
                j++;
            }
        }

        while(i < left.length){
            arr[k++] = left[i++];
        }
        while(j < right.length){
            arr[k++] = right[j++];
        }
    }
}

class Main {    
    public static void main(String args[]) {
        // Your code goes here
        //System.out.println(find(29,0)); // 11101
        //System.out.println(set(12,4));
        //System.out.println(clear(12,3));
        /*
        int x = 5;
        int y = ~x;
        int z = ~y;
        //System.out.println(y);*/
        //int x = 12<<2;
        //System.out.println(x);
        //System.out.println(isEven(13));
        //Swap(7,5);
        //System.out.println(noOfChanges(22,27));
        
    }
    
    public static int noOfChanges(int a, int b){
        int x = a^b;
        // count set bits in x
        /* Method 2 
          use (n)&(n-1) -> till n becomes 0
        /* method 1
        int count  = 0;
        while(x > 0){
            int x1 = x;
            if((x1 & 1) == 1){
                count++;
            }
            x = x>>1;
        }
        return count;
        */
    }
    
    public static int clear(int a, int i){
        int mask = ~(1<<i);
        return a & mask;
    }
    
    public static int set(int a, int i){
        int mask = (1<<i);
        return a|mask;
    }
    public static void Swap(int a, int b){
        a = a^b;
        b = a^b;
        a = a^b;
        
        /* Method 1
        a = a+b;
        b = a-b;
        a = a-b;*/
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    
    public static boolean isEven(int n){
        if((n&1) == 0) // even 
            return true;
        else if((n&1) == 1) // odd
            return false;
        
        return false;
    }

    
    // find the ith bit
    public static int find(int num, int i){
        ///System.out.println(1<<i);
        int n = num&(1<<i); // mask = (1<<i)
        if(n != 0)
            return 1;
        
        return 0;            
    }
    
    
    public static int ModInverse(int A , int M){
        if(gcd(A,M)!=1){
            return -1;
        }
        
        for(int i=1; i<M; i++){
            if(((A%M)*(i%M))%M==1){
                return i;
            }
        }
        return -1;
    }

    public static int gcd(int a , int b){
        return (b==0)?a:gcd(b,a%b);
    }
    
    
    // TC - O(log(n))
    public static int getRemOptimized(int x, int n, int M){
        if(n == 0)
            return 1%M;
        
        if(n%2 == 0){
            int y = getRemOptimized(x,n/2,M);
            return (y*y)%M;
        }
        
        return ((x%M)*getRemOptimized(x,n-1,M))%M;
    }
    
    // O(n) -> where n is the exponent 
    public static int getRem(int a ,int n , int m){
        int result = 1;
        
        while(n!=0){
            result = ((result % m) * (a %m))%m;
            --n;
        }
        return result;
    }
    
    public static void KDistinct(int arr[] , int k){
        HashMap <Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<k;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }

        System.out.println(map.size());
        
        for(int i = k; i<arr.length;i++){
            if(map.get(arr[i-k])==1){
                map.remove(arr[i-k]);
            }
            else{
                map.put(arr[i-k], map.get(arr[i-k])-1);
            }
            
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);    
            }
            else{
                map.put(arr[i], 1);
            }
            
            System.out.println(map.size());
        }
    }
    
}



 
