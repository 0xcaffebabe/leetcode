/*
 * @lc app=leetcode.cn id=3038 lang=java
 * @lcpr version=
 *
 * [3038] 相同分数的最大操作数目 I
 * 
 * 557/557 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 57.46 % of java submissions (40.9 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int maxOperations(int[] nums) {
        int ans = 1;
        for(int i = 2; i < nums.length; i += 2) {
            if (i + 1 >= nums.length) break;
            if (nums[i] + nums[i + 1] == nums[i - 1] + nums[i - 2]) 
                ans++;
            else break;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,2,1,4,5]\n
// @lcpr case=end

// @lcpr case=start
// [3,2,6,1,4]\n
// [1,2]\n
// [1,2,3,4]\n
// [1,2,3]\n
// [1,2,2,1]\n
// @lcpr case=end

 */

