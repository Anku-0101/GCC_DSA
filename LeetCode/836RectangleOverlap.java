class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int fx1 = Math.min(rec1[0], rec1[2]);
        int fx2 = Math.max(rec1[0], rec1[2]);
        
        int fy1 = Math.min(rec1[1], rec1[3]);
        int fy2 = Math.max(rec1[1], rec1[3]);
        
        int sx1 = Math.min(rec2[0], rec2[2]);
        int sx2 = Math.max(rec2[0], rec2[2]);
        
        int sy1 = Math.min(rec2[1], rec2[3]);
        int sy2 = Math.max(rec2[1], rec2[3]);
        
        boolean isX = false;
        boolean isY = false;
        
        // for x
        if(fx2 <= sx1){
            return false;
        }
        
        if(fx1 >= sx2){
            return false;
        }
           
        if(fy2 <= sy1){
            return false;
        }
        
        if(fy1 >= sy2){
            return false;
        }
        return true;
    }
}
