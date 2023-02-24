class Main{    
    public static void main(String[] args){
        //System.out.println(subString("Triangle", 6));
        //System.out.println(Reverse("Mango"));
        System.out.println(factRecursive(4));
    }
    
    static int factRecursive(int x){
        if(x < 2)
            return x;
        
        return x*factRecursive(x-1);
    }
    
    static int factIterative(int x){
        int res = 1;
        
        for(int i = 1; i <= x; i++){
            res = res*i;
        }
        
        return res;
    }

    
    static String Reverse(String str){
        if(str.length() == 1)
            return str;
        
        return Reverse(subString(str, 1)) + str.charAt(0);
    }
    
    
    static String subString(String str, int index){
        String sub ="";

        for(int i=index; i< str.length(); i++){
            sub = sub + str.charAt(i);
        }
        return sub;
    }
    
    
    /*
    public static String Reverse(String inp){
        String str= ""; // empty string
        int n = inp.length();
        
        
        
        
        while((--n)> -1){
            str = str + inp.charAt(n);
        }
        
        
        /*
        for(int i = 0; i < n; i++){
            str += inp.charAt(n-1-i); // n-1, n-2, n-3, .... 0
        }
        /*
        for(int i=inp.length()-1;i>=0;i--){
            str+=inp.charAt(i);
        }*/

      //  return str;
    //}
}
