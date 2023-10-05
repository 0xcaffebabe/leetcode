/*
 * @lc app=leetcode.cn id=2475 lang=java
 * @lcpr version=
 *
 * [2475] 数组中不等三元组的数目
 * 
 * 104/104 cases passed (4 ms)
 * Your runtime beats 58.7 % of java submissions
 * Your memory usage beats 68.26 % of java submissions (39 MB)
 */

// @lc code=start
class Solution {
    public int unequalTriplets(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for(int i = 0; i < n - 2; i++) {
            for(int j = i + 1; j < n - 1; j++) {
                if (nums[i] == nums[j]) continue;
                for(int k = j + 1; k < n; k++)
                    if (nums[k] != nums[i] && nums[j] != nums[k])
                        ans++;
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,4,2,4,3]\n
// @lcpr case=end

// @lcpr case=start
// [1,1,1,1,1]\n
// @lcpr case=end

 */

