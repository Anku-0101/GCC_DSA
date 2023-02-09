import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        System.out.println();
        int[] arr = {1,0,1,1,0,0,1,1,0,1,1,1};
        System.out.println(maxLength(arr));
    }
    
    public static boolean isAnagramHashMap(String s1, String s2){
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        
        for(int i = 0; i < s1.length(); i++){
            if(map1.containsKey(s1.charAt(i))){
                int value = map1.get(s1.charAt(i));
                map1.put(s1.charAt(i), value+1);
            }
            else{ // first occurance
                map1.put(s1.charAt(i), 1);
            }
            
        }
        
        for(int i = 0; i < s2.length(); i++){
            if(map2.containsKey(s2.charAt(i))){
                int value = map1.get(s2.charAt(i));
                map2.put(s2.charAt(i), value+1);
            }
            else{ // first occurance
                map2.put(s2.charAt(i), 1);
            }
            
        }
        
        if(map1.size() != map2.size())
            return false;
        
        Iterator <Character> it = map1.keySet().iterator();       //keyset is a method  
        
        while(it.hasNext()) {  
            char key=(char)it.next();  
            if(!map2.containsKey(key)){
                return false;
            }
            if(map1.get(key) != map2.get(key)){
                return false;
            }
        }
        return true;
        
        /* //method 2
        while(it.hasNext()) {  
            char key=(char)it.next();  
            int count = 0;
            for(int i = 0; i< s2.length(); i++){
                if(s2.charAt(i) == key){
                    count++;
                }
            }
            if(count != map1.get(key))
                return false;
        }
        return true;  */
         
        
    }
    
    public static boolean isAnagram(String s1, String s2){
        int n1=s1.length();
        int n2=s2.length();
        
        if(n1!=n2){
            return false;
        }
        
        if(n1==n2){
            int[] a=new int[26];
            int[] b=new int[26];
            
            for(int i=0;i<n1;i++){
                int ch=(int)s1.charAt(i);
                if(ch>=97 && ch<=122){
                    int index1=ch-97;
                    a[index1]++;
                }

if(ch>=65 && ch<=90){

int index1=ch-65;

a[index1]++;

}

}

for(int i=0;i<n2;i++){

int ch=(int)s2.charAt(i);

if(ch>=97 && ch<=122){

int index2=ch-97;

b[index2]++;

}

if(ch>=65 && ch<=90){

int index2=ch-65;

b[index2]++;

}

}

int i=0,j=0;

while(i<a.length && j<b.length){

if(a[i]!=b[j]){

return false;

}

i++;

j++;

}

}

return true;

}


    
    // TC - O(n^2)
    public static int maxLength(int[] a){
        int maxLength = 0;
        int n = a.length;
        
        for(int i=0;i<n;i++){
            if(a[i]==0)
                a[i]=-1;
        }

        for(int i=0;i<n;i++){
            int sum=0;
            
            // arr = [1,-1,1,-1,1,1,-1]
            for(int j=i;j<n;j++){
                sum += a[j]; // i = 0, j = 0, 

                if(sum==0){
                    int subArraylength = (j-i+1);
                    maxLength = (maxLength > subArraylength ) ? maxLength:subArraylength;
                }
            }
        }
        return maxLength;
        //System.out.print(max);
    }
    
    public static void KSum(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] inp = bf.readLine().trim().split(" ");
        int n = Integer.parseInt(inp[0]);
        int k = Integer.parseInt(inp[1]);
        
        String[] val = bf.readLine().trim().split(" ");
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(val[i]);
        }

        System.out.println(getMinimumM(arr, n, k));

    }

    static int getMinimumM(int[] arr, int n, int limit){
        int start = 1;
        int end = 100000000;

        while(start < end){
            int mid = start + (end-start)/2;
            int sum = 0;

            for(int i = 0; i <n; i++){
                int ans = ceiling(arr[i], mid);
                sum += ans;
            }
            if(sum <= limit){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }


    static int ceiling(int num, int factor){
        return (num%factor == 0) ? num/factor : num/factor+1;
    }
}
