/*
 * @lc app=leetcode.cn id=2389 lang=java
 * @lcpr version=
 *
 * [2389] 和有限的最长子序列
 * 
 * 57/57 cases passed (10 ms)
 * Your runtime beats 17.93 % of java submissions
 * Your memory usage beats 18.33 % of java submissions (43.4 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] ans = new int[queries.length];
        for(int i = 0; i < queries.length; i++) {
            int sum = 0;
            for(int j : nums) {
                sum += j;
                if (sum <= queries[i]) ans[i]++;
                else break;
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,5,2,1]\n[3,10,21]\n
// @lcpr case=end

// @lcpr case=start
// [2,3,4,5]\n[1]\n
// [1]\n[1]\n
// @lcpr case=end

 */

