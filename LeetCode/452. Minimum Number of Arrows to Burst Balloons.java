class Solution {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        int count = n;
        sort(points);
        int start = points[0][0];
        int end = points[0][1];
        for(int i = 1; i<n; i++){
            System.out.println(points[i][0]+","+points[i][1]);
            System.out.println("start = "+start+" end = "+end);
            if(points[i][0] <= end){
                System.out.println("in block = "+points[i][0]+","+points[i][1]);
                start = points[i][0];
                end = points[i][1] >= end ? end : points[i][1];
                count--;
            }else{
                start = points[i][0];
                end = points[i][1];
            }
        }
        return count;
    }
    void sort(int[][] points){
        int n = points.length;
        if(n == 1)
            return;

        int mid = n/2;

        int[][] left = new int[mid][];
        int[][] right = new int[n-mid][];
        for(int i = 0; i<mid; i++){
            left[i] = new int[2];
            left[i][0] = points[i][0];
            left[i][1] = points[i][1];
        }
        for(int i =mid; i<n; i++){
            right[i-mid] = new int[2];
            right[i-mid][0]= points[i][0];
            right[i-mid][1]= points[i][1];
        }
        sort(left);
        sort(right);

        merge(left,right,points);
        
    }

    void merge(int[][] left, int[][] right, int[][] points){
        int i = 0;
        int j = 0;
        int k = 0;
        int l = left.length;
        int r = right.length;
        while(i < l && j < r){
            if(left[i][0] < right[j][0]){
                points[k][0] = left[i][0];
                points[k++][1] = left[i++][1];
                
            }else if(left[i][0] == right[j][0]){
                    if(left[i][1] < right[j][1]){
                        points[k][0] = left[i][0];
                        points[k++][1] = left[i++][1];
                    }else{
                        points[k][0] = right[j][0];
                        points[k++][1] = right[j++][1];
                    }
            }else{
                points[k][0] = right[j][0];
                points[k++][1] = right[j++][1];   
            }
        }
        while(i < l){
            points[k][0] = left[i][0];
            points[k++][1] = left[i++][1];
        }
        while(j < r){
            points[k][0] = right[j][0];
            points[k++][1] = right[j++][1];
        }
    }
}
