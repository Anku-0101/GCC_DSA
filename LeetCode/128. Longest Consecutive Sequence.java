class Solution {
    public int longestConsecutive(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int len = 1;
        int maxLen = 0;
        if(nums.length == 0 || nums.length == 1)return nums.length;
        for(int i = 0; i < nums.length; i++)pq.add(nums[i]);

        int ele = pq.poll();
        while(!pq.isEmpty()){
            int next = pq.poll();
            if(next == ele)continue;
            int diff = next - ele;
            len = (diff == 1) ? len+1 : 1;
            maxLen = (len>maxLen)?len:maxLen;
            ele = next;
        }
        return Math.max(maxLen,len);
    }
}


public class Solution {
    public int LongestConsecutive(int[] nums) {
        HashSet<int> hs = new HashSet<int>();
        int n = nums.Length;
        for(int i = 0; i < n; i++)hs.Add(nums[i]);
        int longest = 0;
        int len = 1;
        
        foreach(int ele in hs){
            if(!hs.Contains(ele-1)){
                len =1;
                int item = ele;
                while(hs.Contains(item+1)){
                    len++;
                    item++;
                }
                if(len > longest){
                    longest = len;
                }
            }
        }
        return longest;
    }
}
