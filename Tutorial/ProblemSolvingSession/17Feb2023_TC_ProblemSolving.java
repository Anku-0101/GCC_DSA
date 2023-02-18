public static void CountFrequenciesArrayList(String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        
        /*
        // Method1
        // default value will be 0
        int count[] = new int[10001]; 

        for(int i=0; i<n; i++){
            int x = list.get(i);
            count[x] += 1;
            //System.out.println("arr[ " + i +"]= " + arr[i]);
        }

        for(int i = 1; i < 10001; i++){
            if(count[i] > 0){
                System.out.println(i + " " + count[i]);
            }
        }*/
        
        Collections.sort(list);
        //System.out.println(list);
        list.add(Integer.MAX_VALUE);
        //System.out.println(list);
        for(int i=0; i<list.size()-1; i++)
        {
            int fre=1;
            while((list.get(i)==list.get(i+1)))
            {
                fre++;
                i++;
            }
            System.out.println(list.get(i)+" "+fre);
        }
    }



class Main{    
    public static void main(String[] args){
         System.out.println(Isprime2(201));
    }
    
    // if a number is composite then it has atleast one factor which is 
    // less than equal to sqrt(n)
    static boolean Isprime2(int n){
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
    
    
