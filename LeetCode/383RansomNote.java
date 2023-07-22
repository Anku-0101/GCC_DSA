class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> mag = new HashMap<Character, Integer>();
        HashMap<Character, Integer> ran = new HashMap<Character, Integer>();

        for(int i = 0; i < magazine.length(); i++){
            char ch = magazine.charAt(i);
            if(mag.containsKey(ch)){
                mag.put(ch, mag.get(ch)+1);
            }
            else{
                mag.put(ch,1);
            }
        }

        for(int i = 0; i < ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);
            if(ran.containsKey(ch)){
                ran.put(ch, ran.get(ch)+1);
            }
            else{
                ran.put(ch,1);
            }
        }

        for (Map.Entry<Character, Integer> mapElement : ran.entrySet()){
            char ch = (char)mapElement.getKey();
            int val = (int)mapElement.getValue();

            if(!mag.containsKey(ch)){
                return false;
            }
            if((int)mag.get(ch) < val){
                return false;
            }
        }
        return true;
    }
}

////////////////////////////////////

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        for(int i = 0; i < magazine.length(); i++){
            Character ch = magazine.charAt(i);
            if(hm.containsKey(ch)){
               hm.put(ch,hm.get(ch)+1); 
            }
            else{
                hm.put(ch,1);
            }
        }

        for(int i = 0; i < ransomNote.length(); i++){
            Character ch = ransomNote.charAt(i);           
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)-1);
                if(hm.get(ch) < 0){
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return true;                 
    }
}
