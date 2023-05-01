// Question of the Day - Maximise Modulo
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();

        int ans = getMaxMod(l,r);
        System.out.println(ans);
    }

    static int getMaxMod(int l, int r){
        if(l <= r/2){
            return r%(r/2+1);
        }
        return r%l;
    }

}
