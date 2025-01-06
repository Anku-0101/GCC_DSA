// Optimized code, TC : O(n) , SC : O(1)
class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] res = new int[n];
        int countLeft = 0;
        int leftMoves = 0;
        for(int i = 0; i < n; i++){
            res[i] = leftMoves;
            if(boxes.charAt(i) == '1'){
                countLeft++;
            }
            leftMoves += countLeft;
        }
        int countRight = 0;
        int rightMoves = 0;
        for(int i = n-1; i > -1; i--){
            res[i] += rightMoves;
            if(boxes.charAt(i) == '1'){
                countRight++;
            }
            rightMoves += countRight;
        }
        return res;
    }
}

// Higly unoptimized, O(n^2) solution
class Solution {
    public int[] minOperations(String boxes) {
        HashSet<Integer> hs = new HashSet<>();
        int n = boxes.length();
        int[] res = new int[n];

        for(int i = 0; i < n; i++){
            if(boxes.charAt(i) == '1'){
                hs.add(i);
            }
        }
        for(int i = 0; i < n; i++){
            res[i] = getDiff(hs, i);
        }
        return res;
    }
    int getDiff(HashSet<Integer> hs, int idx){
        int res = 0;
        for(int x : hs){
            res  += x-idx > 0 ? x-idx : idx-x;
        }
        return res;
    }
}
