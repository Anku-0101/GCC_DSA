public static void maxFreqMinLen(int[] arr){
        HashMap <Integer,Integer> count = new HashMap <> (); // count hashmap to store current index
        HashMap <Integer,Integer> left = new HashMap <> (); // it is storing left most index of an element
        
        int maxFreq = 0;
        int minLen = 0;
        int startIdx = -1;
        
        for(int i = 0; i < arr.length; i++){
            int x = arr[i];
            if(!count.containsKey(x)){
                left.put(x,i);
                count.put(x,1);
            }
            else{ // increase the freq of element
                count.put(x, count.get(x)+1);
                // find maximum repeated elements
                // store it's length or start and end index
                if(count.get(x) > maxFreq){
                    maxFreq = count.get(x);
                    minLen = i - left.get(x)+1;
                    startIdx = left.get(x);
                }
                else if((count.get(x) == maxFreq) && (i-left.get(x)+1)<minLen) {
                    minLen = i-left.get(x) +1;
                    startIdx = left.get(x);
                }
            }
        }
        
        System.out.println("Start Index = " + startIdx + " end Index = " + (startIdx+minLen-1));
        
    }
    
    public static ArrayList<Integer> smallestSubArray(int arr []){
        HashMap <Integer,Integer> map = new HashMap <> (); // count hashmap or freq hashMap
        HashMap <Integer,Integer> index = new HashMap <> (); // it is storing left most index of an element
        
        
        int endIdx =0;
        int startIdx =0;
        int highFreq =0;
        int length = endIdx - startIdx +1;

        for(int i=0; i< arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
                index.put(arr[i],i);
            }
            if(map.get(arr[i])>highFreq){
                endIdx = i;
                startIdx = index.get(arr[i]);
                highFreq = map.get(arr[i]);
                length =endIdx - startIdx +1;
            }
            else if(map.get(arr[i])==highFreq){
                int currentLength = i - index.get(arr[i])+1;
                if(currentLength<length){
                    endIdx =i;
                    startIdx = index.get(arr[i]);
                    highFreq = map.get(arr[i]);
                    length =endIdx - startIdx +1;
                }
            }
        }
        ArrayList <Integer> list = new ArrayList <> ();
        for(int i= startIdx; i<= endIdx; i++){
            list.add(arr[i]);
        }
        return list;
    }
    
    
    public static int maxDist(int arr[]){
        int n = arr.length;
        int maxcount =0;
        int count =0;
        HashMap<Integer , Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])==false){
                map.put(arr[i],i);
            }
            else{
                count = i-map.get(arr[i]);
                maxcount = Math.max(count , maxcount);
            }
        }
        return maxcount;
    }
    
    public static int noOfOperation(int[] a){
        HashMap<Integer, Integer> map=new HashMap<>();
        
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])==false)
                map.put(a[i],1);
            else
                map.put(a[i],(map.get(a[i])+1));
        }
        int sum=0, max=0;
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            sum += e.getValue();
            if(max<e.getValue()){
                max=e.getValue();
            }
        }
        return sum-max;
    }
    
    
    public static int maxSumSubArray(int[] arr) {
        int maxSum = 0;
        int currSum = 0;
        int left = 0;
        int right = 0;
        for(int i = 0; i < arr.length; i++){
            currSum = currSum + arr[i];
            if(currSum > maxSum){
                maxSum = currSum;
                right = i;
            }
            if(currSum < 0){
                currSum = 0;
                left = i+1;
            }
        }
        // for loop for left to right and populate arrayList
        System.out.println("left index = " + left + " right index = " + right);
        return maxSum;
    }
    

public static void minCutTree(String[] args)throws IOException {
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
        //Arrays.sort(nums);   
        //int totallen = 0;
        //for(int i = 0; i )
        
        /*for(int i = 0; i<n; i++)
            System.out.print("nums["+i+"] = " + nums[i]);*/
        
        //System.out.println("x = " + x);
        int start = 0; // maximum cut, when we cut at height = 0,  
        int end = nums[n-1]; // minimum cut i.e 0, when we cut at max height
        int mid = nums[n-1];
        boolean found = false;
        while(start <= end){
            mid = start + (end-start)/2;

            int sum = 0;
            for(int i = 0; i < n; i++){
                if((nums[i] - mid)>0) // cutting from above mid
                    sum += (nums[i] - mid);
            }

            if(sum == x){
                found = true;
                break; // ans = mid
            }

            if(sum > x){ // we need to cut at above mid to get less word
                start = mid+1;
            }
            else{ // we need to cut below mid to get more wood
                end = mid-1;
            }
        }
        if(found)
            System.out.println(mid);
        else
            System.out.println(start);
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

public static void PerfectSquare (String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());

        while(t-- > 0){
            long num = Long.parseLong(bf.readLine());
            if(num == 0)
                System.out.println("YES");
            else
                isPerfectSquare(num);
        }
    }

    static void isPerfectSquare(long n){
        long start = 1;
        long end = n;
        boolean found = false;

        while(start <= end){
            long mid = start + (end - start)/2;
            
            long sqr = mid*mid;
            if(sqr == n){
                found = true;
                break;
            }

            if(sqr > n){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        if(found)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
