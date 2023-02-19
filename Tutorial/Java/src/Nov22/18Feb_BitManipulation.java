public static void MinCutTree(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] nx = bf.readLine().split(" ");
        int n = Integer.parseInt(nx[0]);
        int x = Integer.parseInt(nx[1]);

        String[] arr = bf.readLine().split(" ");
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = Integer.parseInt(arr[i]);
        }

        mergeSort(nums);
        
        //int totallen = 0;
        //for(int i = 0; i )
        /*
        for(int i = 0; i<n; i++)
            System.out.print("nums["+i+"] = " + nums[i]);*/
        
        //System.out.println("x = " + x);
        int start = 0; // maximum cut, when we cut at height = 0,  
        int end = nums[n-1]; // minimum cut i.e 0, when we cut at max height
        int mid = 0;

        while(start <= end){
            mid = start + (end-start)/2;

            int sum = 0;
            for(int i = 0; i < n; i++){
                if((nums[i] - mid)>0) // cutting from above mid
                    sum += (nums[i] - mid);
            }

            if(sum == x){
                break; // ans = mid
            }

            if(sum > x){ // we need to cut at above mid to get less word
                start = mid+1;
            }
            else{ // we need to cut below mid to get more wood
                end = mid-1;
            }
        }
        System.out.println(mid);
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



static void printall32bits(int n){
        for(int i = 31; i>=0; i--){
            System.out.print(((n>>i)&1));
        }
        System.out.println();
    }
    
    static void printall64bits(long n){
        for(int i = 63; i>=0; i--){
            System.out.print(((n>>i)&1));
        }
        System.out.println();
    }
    
    
    public static int nonRepeating(int arr[]){
        int n = arr.length;
        int sum =0;
        
        for(int i=0;i<n;i++){
            sum = sum ^ arr[i];
        }
        return sum;
    }
    
    public static int noOfChanges(int a, int b){
        int x = a^b;
        // count set bits in x
        /* Method 2 
          use (n)&(n-1) -> till n becomes 0*/
          // TC - O(set bits in a^b);
          int count = 0;
          while(x> 0){
              x = x&(x-1);
              count++;
          }
          return count;
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
    


 
