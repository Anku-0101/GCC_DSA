//7021. Check if Strings Can be Made Equal With Operations I

class Solution {
    public boolean canBeEqual(String s1, String s2) {
        if(s1.equals(s2))
            return true;
        HashMap<Character, Integer> hs1 = new HashMap<>();
        HashMap<Character, Integer> hs2 = new HashMap<>();
        HashMap<Character, Integer> hs3 = new HashMap<>();
        HashMap<Character, Integer> hs4 = new HashMap<>();
        
        for(int i = 0; i < 4; i+= 2){            
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            
            if(hs1.containsKey(c1)){
                hs1.put(c1, hs1.get(c1)+1);
            }else{
                hs1.put(c1,1);
            }
            
            if(hs2.containsKey(c2)){
                hs2.put(c2, hs2.get(c2)+1);
            }else{
                hs2.put(c2,1);
            }
        }
        
        for(int i = 1; i < 4; i+= 2){            
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            
            if(hs3.containsKey(c1)){
                hs3.put(c1, hs3.get(c1)+1);
            }else{
                hs3.put(c1,1);
            }
            
            if(hs4.containsKey(c2)){
                hs4.put(c2, hs4.get(c2)+1);
            }else{
                hs4.put(c2,1);
            }
        }
        return CompareMaps(hs1,hs2)&&CompareMaps(hs3,hs4);
        
    }
    
    private boolean CompareMaps(HashMap<Character, Integer> hs1, HashMap<Character, Integer> hs2){
        if(hs1.size() != hs2.size())
            return false;
        
        for(Character ch : hs1.keySet()){
            if(!hs2.containsKey(ch) || hs2.get(ch)!=hs1.get(ch))
                return false;
        }
        
        for(Character ch : hs2.keySet()){
            if(!hs1.containsKey(ch) || hs1.get(ch)!=hs2.get(ch))
                return false;
        }
        return true;
    } 
    
    private String getString(char c[]){
        String s = "";
        for(int i = 0; i < c.length; i++){
            s += c[i];
        }
        return s;
    }
}
