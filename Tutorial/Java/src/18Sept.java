// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        HelloWorld hw = new HelloWorld();
        System.out.println("is anagram = "+ hw.isAnagram("abccbc","aabbcc"));
    }
    
    public boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
        
        int[] arr1 = new int[26]; // a-z
        int[] arr2 = new int[26];
        for(int i = 0; i<s1.length(); i++){
            int val1 = (int)s1.charAt(i);
            int val2 = (int)s2.charAt(i);
            
            arr1[val1-97]++; // arr[index] = val
            arr2[val2-97]++;
        }
        
        for(int i =0; i<26; i++){
            if(arr1[i] != arr2[i])
                return false;
        }
        return true;
    }
    
    public boolean IsAnagram(String s1,String s2)
    {
        if(s1.length()!=s2.length())
        {
            return false;
        }
        int n1=s1.length();
        int n2=s2.length();
        int[] arr1=new int[n1];
        int[] arr2=new int[n2];
        
        for(int i=0;i<n1;i++)
        {
            int val1 = (int)s1.charAt(i);
            arr1[i] = val1;
            
        }
        for(int i=0;i<n2;i++)
        {
            int val2 = (int)s2.charAt(i); // safe 
            arr2[i] = val2;
        }
        QuickSort(arr1,0,n1-1);
        QuickSort(arr2,0,n2-1);
        for (int i = 0; i < n1; i++)
                if (arr1[i] != arr2[i])
                    return false;
     
            return true;
    }
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] arr = {3,5,6,8,9,11,15};
        HelloWorld hw = new HelloWorld();
        System.out.println("Get target index = "+hw.GetTargetIndex(arr,arr.length, 17));
        int[] res = hw.GetReverse(arr, arr.length);
        for(int i = 0; i<arr.length; i++){
            System.out.print(res[i] + " ");
        }
    }
    
    
    public int[] GetReverse(int[] arr,int size)
    {
        int[] rev = new int[size];
        int j = 0;
        for (int i = size-1; i >=0; i--) 
        {
            rev[j] = arr[i];
            j++;
         }
         
        return rev;
    }
//sir isme output me garbage value aa rhi h
    public int GetTargetIndex(int []arr, int size, int target){
        int start =0;
        int end =size-1;
        
        while(start <= end){  //start > end , start == end+1
            int mid = (start+end)/2;
            
            if(arr[mid] == target)
                return mid;
                
            if(arr[mid]>target)
                end = mid-1;
            
            if(arr[mid]<target)
                start = mid+1;
        } 
        return start; // end +1 
    }

}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        HelloWorld hw = new HelloWorld();
        System.out.println("GCD of a,b = "+ hw.GetGCD(5,10));
    }
    // eg 15%2 -> divisor = 2, divident = 15
    //Iterative 2
    // log10(b)
    // a =100, b =1,   log10(1) = 0
    public int GetGCD(int a, int b){
        int divident = (a >= b) ? a : b; // you can do by if-else
        int divisor = (a>=b) ? b:a;
        
        while(divisor != 0){
            int remainder = divident%divisor;
            divident = divisor;
            divisor = remainder;
        }
        return divident;
    }
    // Recursive 
    // a = 15, b =10 
    // gcd(15,10) 
    // log10(b) 
    public int gcd(int a, int b){
        if(a==0)
          return b;
        else
            return gcd(b%a,a);
    }
    public int gcd1(int a, int b){
        if(a%b == 0)
            return b;
        else
          return gcd(b,a%b);
    }
    
    // Iterative 1
    // a =100, b = 1
    // loop will run 100 times
    public static int gcd2(int a, int b){
        if (a == 0){
            return b; 
        }
        else if (b == 0){
            return a;
        }
        while (a != b) {
            if (a > b){
                a = a - b; // Division, 
            }
            else{
                b = b - a; 
            }
        }
        return a;
    }


}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String test = "Newton_School";
        HelloWorld hw = new HelloWorld();
        System.out.println("Sub string = " + hw.GetSubString(4,13,test));
        
    }
    
    public String GetSubString(int startIndex,int endIndex,String str)
    {
        int size = str.length();
        System.out.println("Size = "+ size);
        if(endIndex >= size || endIndex < startIndex || startIndex < 0){ //
            System.out.println("INVALID SEGMENT");
            return "EMPTY";
        }
        String temp="";
        for(int i=startIndex; i<=endIndex; i++)
        {
            temp+=str.charAt(i);
        }
        return temp;
    }
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        HelloWorld hw = new HelloWorld();
        System.out.println("Get int of char = Z == " + hw.GetCharNumber('Z') );
        hw.GetComposition1("ABC1abc[]");
        
    }
    public static void count(String str)
	{
		int upper = 0, lower = 0, number = 0, special = 0;

		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				upper++;
			else if (ch >= 'a' && ch <= 'z')
				lower++;
			else if (ch >= '0' && ch <= '9')
				number++;
			else
				special++;
		}
		System.out.println("Lower case letters : " + lower);
		System.out.println("Upper case letters : " + upper);
		System.out.println("Number : " + number);
		System.out.println("Special characters : " + special);
	}
	
    public void GetComposition1(String str)
    {
        int upper=0,lower=0,number=0,symbol=0;
        
        for(int i=0;i<str.length();i++)
        {
            int a = (int)str.charAt(i); // it is done by java
    
        if(a>=65 && a<=90)
        {
            upper++;
        }
        else if(a>=97&&a<=122)
        {
            lower++;
        }
        else if(a>=48&&a<57)
        {
            number++;
        }
        else
        {
            symbol++;
        }
            
        }
        System.out.println("Count of uppercase"+upper);
        System.out.println("Count of lowercase"+lower);
        System.out.println("Count of number"+number);
        System.out.println("Count of symbol"+symbol);
    }
    
    public int GetCharNumber(char x){
        return (int)x; // typeCasting :: char to int
    }
    public static void  GetComposition(String str){
         int upper = 0;
         int lower = 0;
         int number = 0;
         int symbol = 0;
         int size = str.length();
         
         for(int i=0; i<size; i++){
             int value = str.charAt(i);
             
             if(str.charAt(i)== 'T' || str.charAt(i)=='C'){
                 upper++;
             }
             if(str.charAt(i)== 'i'||str.charAt(i)=='m'||str.charAt(i)=='e'|| str.charAt(i)=='u'|| str.charAt(i)=='r'|| str.charAt(i)=='e'|| str.charAt(i)=='n'|| str.charAt(i)=='t'){
                 lower++;
             }
             if(str.charAt(i)== '=' || str.charAt(i)==':'){
                 symbol++;
             }
              if(str.charAt(i)== '1' || str.charAt(i)=='8'||str.charAt(i)=='9'){
                 number++;
             }
         }
         System.out.println(upper);
         System.out.println(lower);
         System.out.println(number);
         System.out.println(symbol);
     }
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        HelloWorld hw = new HelloWorld();
        System.out.println("Reverse of ABCD = "+ hw.reverse12("ABCD"));
        System.out.println("------");
        hw.rev("PQRS");
        System.out.println("-----RECURSIVE--------");
        System.out.println("Reverse of qwerty = "+hw.RevRec("qwerty"));
        
    }
    
    public String RevRec(String str){
        if(str.length() < 2)
            return str;
        
        return RevRec(GetSubString(1,str.length()-1,str))+str.charAt(0);
    }
    
    public String GetSubString(int startIndex,int endIndex,String str)
    {
        int size = str.length();
        //System.out.println("Size = "+ size);
        if(endIndex >= size || endIndex < startIndex || startIndex < 0){ //
            System.out.println("INVALID SEGMENT");
            return "EMPTY";
        }
        String temp="";
        for(int i=startIndex; i<=endIndex; i++)
        {
            temp+=str.charAt(i);
        }
        return temp;
    }
    
    public String reverse(String str){
        char ch;
        String s = "";
        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); // ch 
            s= ch+s; // adding the character to the end of, s
        }
        return s;
    }
    
    public String reverse12(String str)
    {
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev+=str.charAt(i);
        }
        return rev;
    }

    public void rev(String str){
        String r ="";
      for (int i=str.length()-1; i>=0; i--)
      {
       char ch= str.charAt(i); 
        r= r+ch; 
      }
      System.out.println(r);
    }
    
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        HelloWorld hw = new HelloWorld();
        //System.out.println("is palindrome = "+ hw.reverse("abba"));
        System.out.println("is palindrome = "+ hw.isPalindrome("abbc"));
    }
    
    public  boolean reverse(String str){
			char ch;
			String s = "";
			for (int i=0; i<str.length(); i++)
			{
				ch= str.charAt(i); 
				s= ch+s; 
			}
			System.out.println("post reverse = "+ s);
			boolean result=false;
			if(str.equals(s))
			    return true;
			
			return result;
    }
    
    public boolean isPalindrome(String str){
         if(str==null || str.length()==0) 
              return true;
        for(int i=0;i<str.length()/2; i++){
            char start=str.charAt(i);
            char end= str.charAt(str.length()-1-i);
            if(start != end)
                return false;
            
        }
        
        return true;
    }
    public boolean IsPalindrome(String str)
    {
            String y = reverse(str);//this will give space complexity
            if(str.equals(y))             
            return true;         
        return false; 
    
    }



}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// charAt(index), str.lenght();
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        HelloWorld hw = new HelloWorld();
        int[] arr = {2,4,6,7,11,14,15,19};
        System.out.println("Get target Index = "+hw.GetTargetIndex(arr, arr.length, 8));
        
    }
    
    public int GetTargetIndex(int[] arr, int size, int target){
        int start = 0;
        int end = size-1;
            
        while(start <= end){
            int mid = (start+end)/2;
            
            if(arr[mid] == target){
                return mid;
            }
            
            if(arr[mid] > target)
                end = mid-1;
            
            if(arr[mid] < target)
                start = mid+1;
        }
        return start;//end+1;
    }
}