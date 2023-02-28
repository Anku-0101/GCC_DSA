// Brute Force
public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                String str = "";
                for(int k = i; k <= j; k++){
                    str += s.charAt(k);
                }
                //System.out.println("str = " + str);
                if(isUnique(str) && str.length()>maxLength){
                    //System.out.println("unique str = " + str);
                    maxLength = str.length();
                }
            }
        }
        return maxLength;
    }

    boolean isUnique(String s){
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            if(set.contains(s.charAt(i)))
                return false;
            
            set.add(s.charAt(i));
        }

        return true;
    }

// using Sliding Window, it takes 2n iterations in worst case, TC - O(2n) ~ O(n)

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>(); //freq map

        int right = 0;
        int left = 0;

        while(right < s.length()){
            char r = s.charAt(right);
            if(map.containsKey(r))
                map.put(r, map.get(r)+1);
            else
                map.put(r, 1);
            
            while(map.get(r)>1){
                char l = s.charAt(left);
                map.put(l, map.get(l)-1);
                left++;
            }

            if(right - left +1 > maxLength)
                maxLength = right-left+1;
            
            right++;
        }
        return maxLength;
    }
}

// using sliding window optimized 
/*  
The reason is that if s[j] have a duplicate in the range [i,j) with index j' 
, we don't need to increase i little by little. 
We can skip all the elements in the range [i,j'] and let i to be j′+1 directly.
*/

    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>(); //freq map

        int left = 0;

        for(int right = 0; right < s.length(); right++){
            char r = s.charAt(right);
            if(map.containsKey(r)){
                left = Math.max(map.get(r), left);
                System.out.println("update left to = " + map.get(r));
            }
            
            maxLength =  Math.max(right-left+1, maxLength);
            System.out.println("right = " + right + " left = " + left + " maxlength = " + maxLength);
            map.put(r,right+1);
        }
        return maxLength;
    }
}


