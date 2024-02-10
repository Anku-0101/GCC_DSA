class RandomizedSet {
    HashSet<Integer> set;

    public RandomizedSet() {
        set = new HashSet<>();
    }
    
    public boolean insert(int val) {
        if(!set.contains(val)){
            set.add(val);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if(set.contains(val)){
            set.remove(val);
            return true;
        }
        return false;  
    }
    
    public int getRandom() {
        Random random = new Random();
        int randomNumber = random.nextInt(set.size());
        int x = 0, res;
        for(Integer val :set){
            if(x++ == randomNumber){
                return val;    
            }
        }
        return 0;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
