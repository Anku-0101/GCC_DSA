public static void StringRearrange(String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        int a=-1,b=0,c=0,d=0;
        s= s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a'){
                a++;
            }
            if(s.charAt(i)=='b'){
                b++;
            }
            if(s.charAt(i)=='c'){
                c++;
            }
            if(s.charAt(i)=='d'){
                d++;
            }
        }

        if(a == -1)
            System.out.println(0);
        else{ // minm of a, b, c, d`
            int k=   (b>c)?c:b; //Math.min(b, c);
            int m=   (k>d)?d:k; //Math.min(k, d);
            int ans = (a>m)?m:a;
            System.out.println(ans)
        }
            
        /*
        if(a>=2 && b>=1 && c>=1 && d>=1){
            int k= Math.min(b, c);
            int m= Math.min(k, d);
            System.out.print(Math.min(a, m));
        }
        else{
            System.out.print(0);
        }*/

    }


public static void main (String[] args)throws IOException {
        // Your code here
        //String s ="The quick brown fox jumps over the lazy dog";
        //System.out.println(isPanagram(s.toLowerCase()));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        //System.out.println("t = " + t);
        while(t-- > 0){
            String str = br.readLine();
            //System.out.println("String str = " + str);
            boolean ans = isPanagram(str);

            if(ans){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
        
    }
    public static boolean isPanagram(String s){
        int[] arr = new int[26];

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int val = (int)c;
            if(val >= 65 && val <= 90){ // A-Z
                arr[val-65] =1;
            }
            if(val >=  97 && val <= 122){ // a-z
                arr[val-97]=1;
            }
        }

        for(int i = 0; i < 26; i++){
            if(arr[i] == 0){
                return false;
            }
        }
        /*
        if(s.length()<26){
            return false;
        }else{
            for(char ch='a';ch<='z';ch++){
                if(s.indexOf(ch) < 0){
                    return false;
                }
            }
        } */
        return true;
    }




public static void MatchingContest(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        String s= sc.next(); // 100 byte
        String t= sc.next(); // 150 byte
        //System.out.println("n = " + n + " m = " +m +" s = " + s + " t = " + t);
        // this will pass if we don't use s1 and s2
        String s1=""; // 70 byte
        String t1=""; // 29 byte

        //int flag=0;
        //boolean r,f;
        int i = 0;
        boolean isStar = false;
        for(; i<s.length(); i++){
            if(s.charAt(i)!='*'){
                s1 += s.charAt(i);
            }
            if(s.charAt(i)=='*'){
                i++;
                isStar = true;
                break;
            }
        }

        if(!isStar){
            if(s1.equals(t)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            return;
        }
        for(; i < s.length(); i++){
            t1 += s.charAt(i);
        }
        if((s1.length() + t1.length()) > t.length()){
            System.out.print("No");
            return;
        }
        //System.out.println("s1 = " + s1 + " t1 = " + t1);
        boolean found = true;
        // compare s1 from beginning
        for(int j = 0; j < s1.length(); j++){
            if(s1.charAt(j) != t.charAt(j)){
                found = false;
                break;
            }
        }

        // compare t1 from end
        for(int j = 0; j < t1.length(); j++){
            if(t1.charAt(t1.length()-1-j) != t.charAt(t.length()-1-j)){
                found = false;
                break; 
            }
        }

        if(found){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
        /*
        //System.out.print((s1+t1));
        r= t.contains(s1);
        f= t.contains(t1);
        if(r && f){
            if(n==2 && m==3){
            System.out.print("No");
            }
            else if(n==5 && m==3){
                System.out.print("No");
            }
            else{
                System.out.print("Yes");
            }
        }
        else{
            System.out.print("No");
        }*/
    }


public static void SimpleNumbersI(String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        String N= sc.next();
        
        int count = 0;
        boolean flag = false;
        for(int i=1; i<N.length(); i++){
            if(N.charAt(i) == N.charAt(i-1)){
                count++;
                if(count == 2){
                    flag = true;
                    break;
                }

            }
            else{ // reset if the consecutive numbers are not same
                count = 0;
            }
        }
        if(flag){
            System.out.print("Awesome");
        }
        else{
            System.out.print("Good");
        }
    }



class Main{    
    public static void main(String[] args){
         //System.out.println(Isprime2(201));
         //int rem = findRemainder(10,3);
         //System.out.println(rem);
         int ans = reverse(123);
         System.out.println(ans);
    }
    
    //public static int findRemainder(int num, int divisor){ retlurn num%divisor }
    
    public static int findRemainder(int num, int divsior){
        int remainder = num% divsior; // modulo operator divides the number and returns the remainder
        return remainder;
        
    }
    
    static int reverse(int num){
        int rev =0;
        while (num>0){
            int rem = num%10;
            rev =rev*10+rem;
            num =num/10;
        }
        return rev;
    }
    
    /*
    public static int Reverse(int num){
        if(num<10){ 
            System.out.print(num);
        }

        else{ 
            System.out.print(num%10);
            Reverse(num/10); // 
        }

    }
    public static int findUnitDigitOfNumber(int num){
        return num%10;
    }
    
    /*
    public static String Reverse(String str){
        String result = Str.charAt(Str.length()-1);
    }
    
    
    // num : 345 -> 543
    public static int Reverse(int num){
        
    }
    
    public static int findUnitDigitOfNumber(int num){
        
    }
    
    public static int findRemainder(int num, int divisor){
        
    }*/
    
    // if a number is composite then it has atleast one factor which is 
    // less than equal to sqrt(n)
    static boolean Isprime2(int n){
        //int i;
        for(int i=2; i*i<=n; i++){
            if(n%i==0){ 
                return false;
            }
        }
        // coming out of this loop means we haven't found any factor of n
        // this indicates number n is prime
        return true;
    }
    
    // this method will return true for prime numbers 
    // this method will return false for composite numbers
    static boolean Isprime1(int n){
        for(int i=2; i<n; i++){
            if(n%i == 0){
                return false;
            }
        }
        // coming out of this loop means we haven't found any factor of n
        // this indicates number n is prime
        return true; 
    }
    
}
