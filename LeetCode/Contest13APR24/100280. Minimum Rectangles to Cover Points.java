class Solution {
    public int minRectanglesToCoverPoints(int[][] points, int w) {
        List<Integer> x = new ArrayList<Integer>();
        for(int i = 0; i<points.length; i++){
            x.add(points[i][0]);
        }
        Collections.sort(x);
        int count = 0;
        
        int diff = 0;
        int p1 = x.get(0);
        for(int i = 1; i < x.size(); i++){
            int p2 = x.get(i);
            if(p2-p1 > w){
                count++;
                p1 = p2;
            }
        }
        
        return count+1;
        
    }
}
