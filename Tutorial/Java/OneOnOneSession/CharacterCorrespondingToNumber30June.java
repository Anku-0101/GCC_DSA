import java.util.*;

class Main{
    public static void main(String[] args){
        //System.out.println(getMap());
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("character for value = " + x + "  = " + getMap().get(x));
    }

    public static HashMap<Integer, Character> getMap(){
        HashMap<Integer, Character> map = new HashMap<>();

        for(int i = 1; i <= 26; i++){
            char ch = (char)(i+96);
            map.put(i,ch);
        }

        return map;
    }
}
