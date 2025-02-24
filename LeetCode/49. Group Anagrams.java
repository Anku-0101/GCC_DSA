class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        for(String str : strs){
            boolean isAdded = false;
            for(List<String> lst : ans){
                if(isAnagram(lst.get(0),str)){
                    lst.add(str);
                    isAdded = true;
                    break;
                }
            }
            if(!isAdded){
                List<String> ls = new ArrayList<>();
                ls.add(str);
                ans.add(ls);
            }
        }
        return ans;
    }

    private boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int[] chars = new int[26];
        for(int i = 0; i<s.length(); i++){
            chars[s.charAt(i) - 'a']++;
            chars[t.charAt(i) - 'a']--;
        }
        for(int freq : chars){
            if(freq != 0){
                return false;
            }
        }
        return true;
    }
}


// Optimized

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans  = new ArrayList<>();
        HashMap<String, Integer> hm = new HashMap<>();
        int idx = 0;
        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if(hm.containsKey(sorted)){
                ans.get(hm.get(sorted)).add(str);
            }else{
                hm.put(sorted, idx++);
                List<String> ls = new ArrayList<>();
                ls.add(str);
                ans.add(ls);
            }
        }
        return ans;
    }
}

// less code
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans  = new ArrayList<>();
        HashMap<String, List<String>> hm = new HashMap<>();
        
        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if(!hm.containsKey(sorted)){
                hm.put(sorted, new ArrayList<>());
            }
            
            hm.get(sorted).add(str);
            
        }
        return new ArrayList<>(hm.values());
    }
}
