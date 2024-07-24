class Solution {
    public List<int> leaders(int n, int[] arr) {
        Stack<int> st = new Stack<int>();
        List<int> ans = new List<int>();
        st.Push(arr[n-1]);
        for(int i = n-2; i >= 0; i--){
            if(st.Peek() < arr[i]){
                st.Push(arr[i]);
            }
        }
        while(!(st.Count == 0)){
            ans.Add(st.Pop());
        }
        return ans;
    }
}
