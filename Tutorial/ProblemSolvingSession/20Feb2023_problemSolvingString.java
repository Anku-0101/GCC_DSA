public static void main (String[] args) {
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
