class Solution {
    public String findLatestTime(String s) {
        char h1 = s.charAt(0);
        char h2 = s.charAt(1);

        char m1 = s.charAt(3);
        char m2 = s.charAt(4);
        char ch[] = new char[5];
        ch[2] = ':';
        if(h1 == '?' && h2 == '?'){
            ch[0] = '1'; ch[1] ='1'; 
        }else if(h1 == '?' && h2 != '?'){
            if(h2 == '1' || h2 =='0'){
                ch[0] = '1'; ch[1] = h2;
            }else{
                ch[0] = '0'; ch[1] = h2;
            }
        }else if(h1 != '?' && h2 == '?'){
            if(h1 == '1'){
                ch[0] = h1; ch[1] = '1';
            }else{
                ch[0] = h1; ch[1] = '9'; 
            }
        }else if(h1 != '?' && h2 != '?'){
            ch[0] = h1; ch[1] = h2;
        }

        if(m1 == '?' && m2 == '?'){
            ch[3]= '5'; ch[4] = '9';
        }else if(m1 == '?' && m2 != '?'){
            ch[3] = '5'; ch[4] = m2;
        }else if(m1 != '?' && m2 == '?'){
            ch[3] = m1; ch[4] = '9';
        }else if(m1 != '?' && m2 != '?'){
            ch[3] = m1; ch[4] = m2;
        }

        String str = new String(ch);
        return str;
    }
}
