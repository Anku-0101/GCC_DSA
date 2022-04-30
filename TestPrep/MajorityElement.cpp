//https://leetcode.com/problems/majority-element/

/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
 

Follow-up: Could you solve the problem in linear time and in O(1) space?
*/
/*
Approach 5: Divide and Conquer
Intuition

If we know the majority element in the left and right halves of an array, we can determine which is the global majority element in linear time.

Algorithm

Here, we apply a classical divide & conquer approach that recurses on the left and right halves of an array until an answer can be trivially achieved for a length-1 array. Note that because actually passing copies of subarrays costs time and space, we instead pass lo and hi indices that describe the relevant slice of the overall array. In this case, the majority element for a length-1 slice is trivially its only element, so the recursion stops there. If the current slice is longer than length-1, we must combine the answers for the slice's left and right halves. If they agree on the majority element, then the majority element for the overall slice is obviously the same[1]. If they disagree, only one of them can be "right", so we need to count the occurrences of the left and right majority elements to determine which subslice's answer is globally correct. The overall answer for the array is thus the majority element between indices 0 and nn.


Complexity Analysis

Time complexity : O(nlgn)O(nlgn)

Each recursive call to majority_element_rec performs two recursive calls on subslices of size \frac{n}{2} 
2
n
​
  and two linear scans of length nn. Therefore, the time complexity of the divide & conquer approach can be represented by the following recurrence relation:

T(n) = 2T(\frac{n}{2}) + 2nT(n)=2T( 
2
n
​
 )+2n

By the master theorem, the recurrence satisfies case 2, so the complexity can be analyzed as such:

\begin{aligned} T(n) &= \Theta(n^{log_{b}a}\log n) \\ &= \Theta(n^{log_{2}2}\log n) \\ &= \Theta(n \log n) \\ \end{aligned} 
T(n)
​
  
=Θ(n 
log 
b
​
 a
 logn)
=Θ(n 
log 
2
​
 2
 logn)
=Θ(nlogn)
​
 

Space complexity : O(lgn)O(lgn)

Although the divide & conquer does not explicitly allocate any additional memory, it uses a non-constant amount of additional memory in stack frames due to recursion. Because the algorithm "cuts" the array in half at each level of recursion, it follows that there can only be O(lgn)O(lgn) "cuts" before the base case of 1 is reached. It follows from this fact that the resulting recursion tree is balanced, and therefore all paths from the root to a leaf are of length O(lgn)O(lgn). Because the recursion tree is traversed in a depth-first manner, the space complexity is therefore equivalent to the length of the longest path, which is, of course, O(lgn)O(lgn).


Approach 6: Boyer-Moore Voting Algorithm
Intuition

If we had some way of counting instances of the majority element as +1+1 and instances of any other element as -1−1, summing them would make it obvious that the majority element is indeed the majority element.

Algorithm

Essentially, what Boyer-Moore does is look for a suffix sufsuf of nums where suf[0]suf[0] is the majority element in that suffix. To do this, we maintain a count, which is incremented whenever we see an instance of our current candidate for majority element and decremented whenever we see anything else. Whenever count equals 0, we effectively forget about everything in nums up to the current index and consider the current number as the candidate for majority element. It is not immediately obvious why we can get away with forgetting prefixes of nums - consider the following examples (pipes are inserted to separate runs of nonzero count).

[7, 7, 5, 7, 5, 1 | 5, 7 | 5, 5, 7, 7 | 7, 7, 7, 7]

Here, the 7 at index 0 is selected to be the first candidate for majority element. count will eventually reach 0 after index 5 is processed, so the 5 at index 6 will be the next candidate. In this case, 7 is the true majority element, so by disregarding this prefix, we are ignoring an equal number of majority and minority elements - therefore, 7 will still be the majority element in the suffix formed by throwing away the first prefix.

[7, 7, 5, 7, 5, 1 | 5, 7 | 5, 5, 7, 7 | 5, 5, 5, 5]

Now, the majority element is 5 (we changed the last run of the array from 7s to 5s), but our first candidate is still 7. In this case, our candidate is not the true majority element, but we still cannot discard more majority elements than minority elements (this would imply that count could reach -1 before we reassign candidate, which is obviously false).

Therefore, given that it is impossible (in both cases) to discard more majority elements than minority elements, we are safe in discarding the prefix and attempting to recursively solve the majority element problem for the suffix. Eventually, a suffix will be found for which count does not hit 0, and the majority element of that suffix will necessarily be the same as the majority element of the overall array.


Complexity Analysis

Time complexity : O(n)O(n)

Boyer-Moore performs constant work exactly nn times, so the algorithm runs in linear time.

Space complexity : O(1)O(1)

Boyer-Moore allocates only constant additional memory.

*/

 int majorityElement(vector<int>& nums) {
        int count = 0;
        int candidate = 0;
        
        for(int i =0; i<nums.size(); i++){
            if(count == 0){
                candidate = nums[i];
            }
            count += (nums[i] == candidate)? 1 : -1;
            cout<<"nums["<<i<<"] ="<<nums[i]<<" count = "<<count<<"\n";
        }
        
        return candidate;
    }