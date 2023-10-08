class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        
        Collections.sort(processorTime);
        Collections.sort(tasks, Collections.reverseOrder());
        int maxTime = 0;
        
        for(int i = 0; i < processorTime.size(); i++){
            int time = tasks.get(i*4);
            time = time + processorTime.get(i);
            if(time > maxTime){
                maxTime = time;
            }
        }
        return maxTime;
    }
}
