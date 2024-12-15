class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        int n = classes.length;
         PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            double fractionA = (double) (a[0]+1) / (a[1]+1) - (double)a[0]/a[1];
            double fractionB = (double) (b[0]+1) / (b[1]+1) - (double)b[0]/b[1];
            return Double.compare(fractionB, fractionA);
        });
        for(int i = 0; i<n; i++){
            pq.add(new int[]{classes[i][0], classes[i][1]});
        }
        while(extraStudents > 0){
            int[] itm = pq.poll();
            pq.add(new int[]{(itm[0]+1), (itm[1]+1)});
            extraStudents--;
        }
        double sum = 0;
        
        while(!pq.isEmpty()){
            int[] itm = pq.poll();
            System.out.println(itm[0] + " "+itm[1]);
            sum += (double)itm[0]/itm[1];
        }
        return sum/n;
    }
}
