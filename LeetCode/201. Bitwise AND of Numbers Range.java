class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        if(left==right)
            return left;
        for(int i = 0; i <32; i++){
            left = left>>1;
            right = right>>1;
            if(left == right){
                return left<<(i+1);
            }
        }
        return 0;
    }
    
}
