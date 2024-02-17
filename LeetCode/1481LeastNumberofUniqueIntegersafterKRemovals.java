class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int val = hm.containsKey(arr[i])?hm.get(arr[i])+1:1;
            hm.put(arr[i],val);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            pq.add(entry.getValue());
        }
        //System.out.println(pq+" pq.peek() = "+pq.peek());
        int elementsRemoved = 0;
        while(!pq.isEmpty()){
            elementsRemoved += pq.peek();
            if(elementsRemoved > k){
                return pq.size(); 
            }
            pq.poll();
        }
        return 0;
    }
}


// O(n) - Time , O(n) - Space

class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        // Map to track the frequencies of elements
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int n = arr.length;

        // Array to track the frequencies of frequencies
        // The maximum possible frequency of any element
        // will be n, so we'll initialize this array with size n + 1
        int[] countOfFrequencies = new int[n + 1];

        // Populating countOfFrequencies array
        for (int count : map.values()) {
            countOfFrequencies[count]++;
        }

        // Variable to track the remaining number of unique elements
        int remainingUniqueElements = map.size();

        // Traversing over all possible frequencies
        for (int i = 1; i <= n; i++) {
            // For each possible frequency i, we'd like to remove as
            // many elements with that frequency as possible.
            // k / i represents the number of maximum possible elements
            // we could remove with k elements left to remove.
            // countOfFrequencies[i] represents the actual number of elements
            // with frequency i.
            int numElementsToRemove = Math.min(k / i, countOfFrequencies[i]);

            // Removing maximum possible elements
            k -= (i * numElementsToRemove);

            // numElementsToRemove is the count of unique elements removed
            remainingUniqueElements -= numElementsToRemove;

            // If the number of elements that can be removed is less
            // than the current frequency, we won't be able to remove
            // any more elements with a higher frequency so we can return
            // the remaining number of unique elements
            if (k < i) {
                return remainingUniqueElements;
            }
        }

        // We have traversed all possible frequencies i.e.,
        // removed all elements. Returning 0 in this case.
        return 0;
    }
}
