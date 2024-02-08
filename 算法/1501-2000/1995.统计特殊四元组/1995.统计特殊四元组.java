/*
 * @lc app=leetcode.cn id=1995 lang=java
 * @lcpr version=
 *
 * [1995] 统计特殊四元组
 * 
 * 211/211 cases passed (16 ms)
 * Your runtime beats 25 % of java submissions
 * Your memory usage beats 52.5 % of java submissions (39.4 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int countQuadruplets(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for(int i = 0; i < n - 3; i++) {
            for(int j = i + 1; j < n - 2; j++) {
                for(int k = j + 1; k < n - 1; k++) {
                    for(int l = k + 1; l < n; l++) {
                        if (nums[i] + nums[j] + nums[k] == nums[l]) ans++;
                    }
                }
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,6]\n
// @lcpr case=end

// @lcpr case=start
// [3,3,6,4,5]\n
// @lcpr case=end

// @lcpr case=start
// [1,1,1,3,5]\n
// @lcpr case=end

 */

