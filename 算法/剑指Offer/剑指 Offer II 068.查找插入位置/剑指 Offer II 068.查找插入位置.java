/*
 * @lc app=leetcode.cn id=剑指 Offer II 068 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 068] 查找插入位置
 * 
 * 62/62 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 5.25 % of java submissions (42.4 MB)
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int l,h,m;
        l=0;
        h=nums.length-1;
        while (true){
            m = (l+h)/2;
            if (l>h){
                break;
            }
            
            if (nums[m] == target){
                return m;
            }
            
            if (nums[m]<target){
                l=m+1;
            }else{
                h=m-1;
            }
            
        }
        
        return l;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,3,5,6]\n5\n
// @lcpr case=end

// @lcpr case=start
// [1,3,5,6]\n2\n
// @lcpr case=end

// @lcpr case=start
// [1,3,5,6]\n7\n
// @lcpr case=end

// @lcpr case=start
// [1,3,5,6]\n0\n
// @lcpr case=end

// @lcpr case=start
// [1]\n0\n
// @lcpr case=end

 */

