/*
 * @lc app=leetcode.cn id=2765 lang=java
 * @lcpr version=
 *
 * [2765] 最长交替子数组
 * 
 * 2880/2880 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 5.39 % of java submissions (43.5 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int alternatingSubarray(int[] nums) {
        int ans = -1;
        for(int i = 0; i < nums.length - 1; i++) {
            int cnt = 0;
            int f = 1;
            for(int j = i + 1; j < nums.length; j++) {
                if (nums[j] - nums[j-1] == f) {
                    cnt++;
                    f = -f;
                } else {
                    break;
                }
            }
            if (cnt > 0) ans = Math.max(ans, cnt + 1);
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,3,4,3,4]\n
// [2,3]\n
// [1,2]\n
// @lcpr case=end

// @lcpr case=start
// [4,5,6]\n
// @lcpr case=end

 */

