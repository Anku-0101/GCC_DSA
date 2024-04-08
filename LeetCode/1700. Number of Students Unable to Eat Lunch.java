class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n = students.length;
        int m = sandwiches.length;

        int one = 0;
        int zero = 0;

        for(int i =0; i<n; i++){
            if(students[i] == 0){
                zero++;
            }else{
                one++;
            }
        }

        for(int i = 0; i < n; i++){
            if(sandwiches[i] == 0 && zero > 0){
                zero--;
            }
            else if(sandwiches[i] == 1 && one > 0){
                one--;
            }
            else if(sandwiches[i] == 0 && zero == 0){
                return one;
            }
            else if(sandwiches[i] == 1 && one == 0){
                return zero;
            }
        }
        return zero+one;
    }
}
