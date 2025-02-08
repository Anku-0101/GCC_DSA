class NumberContainers {
    HashMap<Integer, TreeSet<Integer>> numVsInds;
    HashMap<Integer, Integer> indVsNum;
    public NumberContainers() {
        numVsInds = new HashMap<>();
        indVsNum = new HashMap<>();
    }
    // index, number = (1,5), (2,10), (3,5), (4,5), (1,8) 
    // 
    public void change(int index, int number) {
        if(numVsInds.containsKey(number)){
            var idxs = numVsInds.get(number);
            idxs.add(index);
        }else{
            TreeSet<Integer> pq = new TreeSet<>();
            pq.add(index);
            numVsInds.put(number, pq);
        }
        if(indVsNum.containsKey(index) && indVsNum.get(index)!=number){
            var idxs = numVsInds.get(indVsNum.get(index));
            idxs.remove(index);
            if(idxs.size() == 0){
                numVsInds.remove(indVsNum.get(index));
            } 
        }
        indVsNum.put(index, number);

    }
    
    public int find(int number) {
        //System.out.println("RES");
        //System.out.println(numVsInds);
        //System.out.println(indVsNum);
        if(numVsInds.containsKey(number)){
            return numVsInds.get(number).first();
        }
        return -1;
        
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */
