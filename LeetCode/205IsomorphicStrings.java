class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Character> hm = new HashMap<>();
        HashSet<Character> hs = new HashSet<>();

        String str = "";

        for(int i = 0; i < s.length(); i++){
            if(hs.contains(t.charAt(i))){
                int key1 = s.charAt(i);
                for (Map.Entry<Character, Character> mapElement : hm.entrySet()) {
                    if(t.charAt(i) == mapElement.getValue()){
                        if(mapElement.getKey()!=key1)
                            return false;
                    }
                }

            }
            if(!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i), t.charAt(i));
            }
            hs.add(t.charAt(i));
            str += hm.get(s.charAt(i));
        }

        return str.equals(t);
    }
}
