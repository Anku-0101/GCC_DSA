/*Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.

 

Example 1:

Input: nums = [1,1,2]
Output:
[[1,1,2],
 [1,2,1],
 [2,1,1]]
Example 2:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]*/

vector<vector<int>> ans;
    
    vector<vector<int>> permuteUnique(vector<int>& nums) {
        perm(nums, 0);
        return ans;
    }
    
    void perm(vector<int>& nums, int i){
        if(i == nums.size()){
            ans.push_back(nums);
            return;
        }
        
        unordered_set<int> s;
        for(int j = i; j<nums.size(); j++){
            if(s.find(nums[j]) != s.end())
                continue;
            
            s.insert(nums[j]);
            
            swap(nums[i], nums[j]);
            perm(nums,i+1);
            swap(nums[i],nums[j]);
        }
    }