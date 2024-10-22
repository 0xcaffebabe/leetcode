/*
 * @lc app=leetcode.cn id=3184 lang=java
 * @lcpr version=
 *
 * [3184] 构成整天的下标对数目 I
 * 
 * 667/667 cases passed (1 ms)
 * Your runtime beats 80.77 % of java submissions
 * Your memory usage beats 92.18 % of java submissions (41.2 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int ans = 0;
        for(int i = 0; i < hours.length - 1; i++) {
            for(int j = i + 1; j < hours.length; j++)
                if ((hours[i] + hours[j]) % 24 == 0) ans++;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [12,12,30,24,24]\n
// [24]\n
// [24, 24]\n
// @lcpr case=end

// @lcpr case=start
// [72,48,24,3]\n
// @lcpr case=end

 */

