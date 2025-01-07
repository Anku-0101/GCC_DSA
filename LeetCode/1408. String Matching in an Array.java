class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();
        HashSet<String> ans = new HashSet<>();
        int n = words.length;
        for(int i = 0; i <n; i++){
            String str1 = words[i];
            for(int j = i+1; j<n; j++){
                String str2 = words[j];
                if(contains(str2, str1)){
                    if(str1.length() < str2.length())ans.add(str1);
                    else ans.add(str2);
                }
            }
        }
        for(String str : ans)res.add(str);
        return res;
    }
    boolean contains(String str2, String str1){
        if(str2.length() < str1.length()){
            String tmp = str1;
            str1 = str2;
            str2 = tmp;
        }

        char ch = str1.charAt(0);
        for(int i = 0; i<str2.length(); i++){
            if(ch == str2.charAt(i) && i+str1.length()<=str2.length()){
                boolean flag = true;
                for(int j = 1; j<str1.length(); j++){
                    if(str1.charAt(j) != str2.charAt(i+j)){
                        flag = false;
                        break;
                    }
                }
                if(flag)return true;
            }
        }
        return false;
    }
}
