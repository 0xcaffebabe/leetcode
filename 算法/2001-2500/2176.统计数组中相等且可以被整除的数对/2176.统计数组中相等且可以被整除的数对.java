/*
 * @lc app=leetcode.cn id=2176 lang=java
 * @lcpr version=
 *
 * [2176] 统计数组中相等且可以被整除的数对
 * 
 * 238/238 cases passed (2 ms)
 * Your runtime beats 98.74 % of java submissions
 * Your memory usage beats 54.72 % of java submissions (40.3 MB)
 */

// @lc code=start
class Solution {
    public int countPairs(int[] nums, int k) {
        int ans = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && (i * j) % k == 0) ans++;
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,1,2,2,2,1,3]\n2\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4]\n1\n
// @lcpr case=end

 */

