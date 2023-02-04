    public static void ABString(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String str=sc.nextLine();
        if(n < 2){
            System.out.println("NO");
            return;
        }

        int countB = 0;
        int flag = 0;
        for(int i = n-1; i >=0; i--){
            if(s.charAt(i) == 'A'){
                if(countB == 0){
                    if(flag == 0){
                        flag = -1;
                        break;
                    }
                }
                else{
                    countB--;
                }
            }
            else{
                countB++;
                flag = 1;
            }
        }
        if(flag == -1 || countB != 0)
            System.out.println("NO");
        else
            System.out.println("YES");
        
    }

}
/*
// AB String method 2
int counta=0, countb=0, a=0;
        
        for(int i=0;i<n;i++) {
            char ch=str.charAt(i);
            a=(int)ch;
            if(a==65)
                counta++;
            else if(a==66)
                countb++;
        }
        if(counta>=countb && countb>0 && a==66)
            System.out.print("YES");
        else
            System.out.print("NO");
            */

public static void main(String[] args){
       HashSetDemo();
        
    }
    
    public static void HashSetDemo(){
        HashSet<Integer> set = new HashSet<>(); // un-ordered hashset
        System.out.println(set.size()); // 0
        set.add(4);
        set.add(4);
        set.add(4);
        set.add(4);
        System.out.println(set.size()); // 1
        System.out.println(set.isEmpty()); // false
        set.remove(4);
        System.out.println(set.size()); // 0
        System.out.println(set.isEmpty()); // true
        
        set.add(3);
        set.add(-1);
        set.add(-10);
        
        Iterator itr = set.iterator();
        
        // order of traversal might be differet from order of insertion
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        
    }
