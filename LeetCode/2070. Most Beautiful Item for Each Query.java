// Optimization required, passing all TC but runtime is maximum
class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        //PriorityQueue<Integer> pq = new PriorityQueue<>(); 
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = items.length;
        for(int i = 0; i<n; i++){
            if (!hm.containsKey(items[i][0]) || hm.get(items[i][0]) < items[i][1]) {
                hm.put(items[i][0], items[i][1]);
            }
        }
        int[] arr = new int[hm.size()];
        int idx = 0;
        for(int key : hm.keySet()){
            arr[idx++] = key;
        }
        int maxVal = 0;
        sort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + "\t");
            int key = arr[i];
            int val = hm.get(key);
            if(val > maxVal){
                hm.put(key, val);
                maxVal = val;
            }else{
                hm.put(key, maxVal);
            }
        }
        System.out.println(hm);
        int res[] = new int[queries.length];
        for(int i = 0; i<queries.length; i++){
            if(queries[i] < arr[0]){
                res[i] = 0;
            }
            else{
                int element = find(arr, queries[i]);
                res[i] = hm.get(element);
            }  
        }
        return res;
    }
    int find(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return arr[mid];
            }
            if(arr[mid] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return arr[start-1];
    }

    void sort(int[] arr){
        int n = arr.length;
        if(n < 2){
            return;
        }
        int[] l = new int[n/2];
        int[] r = new int[n-n/2];
        for(int i = 0; i<n; i++){
            if(i < n/2){
                l[i] = arr[i];
            }else{
                r[i-n/2] = arr[i];
            }
        }
        sort(l);
        sort(r);
        merge(l,r,arr);
    }
    void merge(int[] l, int[] r, int[] arr){
        int li = 0, ri = 0, m = l.length, n = r.length, idx = 0;
        while(li < m && ri < n){
            if(l[li] < r[ri]){
                arr[idx++] = l[li];
                li++;
            }else{
                arr[idx++] = r[ri];
                ri++;
            }
        }
        while(li < m){
            arr[idx++] = l[li++];
        }
        while(ri < n){
            arr[idx++] = r[ri++];
        }
    }
}
