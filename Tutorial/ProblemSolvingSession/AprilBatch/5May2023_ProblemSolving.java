//Question of the Day - Lit the Bulbs

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        /*String a  = sc.next();

        int p = Integer.parseInt(a.charAt(0));
        int q = Integer.parseInt(a.charAt(1));
        int r = Integer.parseInt(a.charAt(3));
        int s = Integer.parseInt(a.charAt(4));*/

        int x = sc.nextInt();

        int p = 0, q = 0, r = 0, s = 0;

        int index = 0;
        while(x > 0){
            int digit = x%10;
            x = x/10;

            if(index == 0){
                s = digit;
            }

            if(index == 1){
                r = digit;
            }

            if(index == 2){
                q = digit;
            }

            if(index == 3){
                p = digit;
            }

            index++;
        }

        int count = 4;

        if(p==q || p==r || p==s){
            count--;
        }
        if(q==r || q==s){
            count--;
        }
        if(r==s){
            count--;
        }
        
        if(count == 1){
            System.out.println(-1);
        }

        if(count == 2){
            System.out.println(6);
        }

        if(count == 3){
            System.out.println(4);
        }

        if(count == 4){
            System.out.println(4);
        }

        //System.out.println("distinct numbers = " + count);

        //System.out.println("p = " + p + " q = " + q + " r = " + r + " s = " + s);


        /*    
        if((p == q) && (q == r) && (r == s)) 
            System.out.println(-1);

        else if((p==q) && (q == r) && (r != s)) 
            System.out.println(6);

        else if((p == q) && (r != s) && ) 
            System.out.println(4);

        else  System.out.println(4);*/


    }
}



/// With function

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        /*String a  = sc.next();

        int p = Integer.parseInt(a.charAt(0));
        int q = Integer.parseInt(a.charAt(1));
        int r = Integer.parseInt(a.charAt(3));
        int s = Integer.parseInt(a.charAt(4));*/

        int x = sc.nextInt();

        // Step 1 : get all the four numbers
        int p = 0, q = 0, r = 0, s = 0;

        int index = 0;
        while(x > 0){
            int digit = x%10;
            x = x/10;

            if(index == 0){
                s = digit;
            }

            if(index == 1){
                r = digit;
            }

            if(index == 2){
                q = digit;
            }

            if(index == 3){
                p = digit;
            }

            index++;
        }


        // step 2 : counting or getting the number of distinct numbers in the four numbers
        int count = getDistinctCount(p,q,r,s);

        // It gives the answer based on the number of distinct numbers
        getMinimumNumberOfSteps(count);
    }
    
    public static void getMinimumNumberOfSteps(int count){
        if(count == 1){
            System.out.println(-1);
        }

        if(count == 2){
            System.out.println(6);
        }

        if(count == 3){
            System.out.println(4);
        }

        if(count == 4){
            System.out.println(4);
        }
    }
    // Counting or getting the number of distinct numbers in the four numbers    
    public static int getDistinctCount(int p, int q, int r, int s){
        int count = 4;

        if(p==q || p==r || p==s){
            count--;
        }
        if(q==r || q==s){
            count--;
        }
        if(r==s){
            count--;
        }
        return count;
    }
}
