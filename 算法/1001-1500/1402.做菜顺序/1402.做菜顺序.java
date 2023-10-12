/*
 * @lc app=leetcode.cn id=1402 lang=java
 * @lcpr version=
 *
 * [1402] 做菜顺序
 * 
 * 60/60 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 73.01 % of java submissions (39.3 MB)
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int sum = 0;
        int ans = 0;
        for(int i = satisfaction.length - 1; i >= 0; i--) {
            if (sum + satisfaction[i] > 0) {
                sum += satisfaction[i];
                ans += sum;
            }else break;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [-1,-8,0,5,-9]\n
// @lcpr case=end

// @lcpr case=start
// [4,3,2]\n
// @lcpr case=end

// @lcpr case=start
// [-1,-4,-5]\n
// @lcpr case=end

 */

