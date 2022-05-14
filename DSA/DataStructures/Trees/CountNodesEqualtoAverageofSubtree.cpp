int ans = 0;
    int averageOfSubtree(TreeNode* root) {
        solve(root);
        return ans;
    }
    
    pair<int,int> solve(TreeNode* root){
        if(root == NULL){
            return {0,0};
        }
        
        pair<int,int> lt = solve(root->left);
        int lsum = lt.first;
        int lcount = lt.second;
        
        pair<int,int> rt = solve(root->right);
        int rsum = rt.first;
        int rcount = rt.second;
        
        int sum = root->val + rsum + lsum;
        int count = 1 + rcount + lcount;
        
        int avg = sum/count;
        
        if(avg == root->val){
            ans++;
        }
        
        return {sum,count};
    }