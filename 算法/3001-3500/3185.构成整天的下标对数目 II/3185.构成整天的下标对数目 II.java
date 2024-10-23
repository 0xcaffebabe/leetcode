/*
 * @lc app=leetcode.cn id=3185 lang=java
 * @lcpr version=
 *
 * [3185] 构成整天的下标对数目 II
 * 
 * 714/714 cases passed (3 ms)
 * Your runtime beats 99.62 % of java submissions
 * Your memory usage beats 9.19 % of java submissions (95.1 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

class Solution {
    public long countCompleteDayPairs(int[] hours) {
        long ans = 0;
        long[] hash = new long[25];
        for (var i : hours) hash[i % 24]++;

        for(int i = 0; i <= 12; i++) {
            if (i == 0 || i == 12) ans += (hash[i] * (hash[i] - 1)) / 2;
            else ans += hash[i] * hash[24 - i];
        }
            
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [12,12,30,24,24]\n
// @lcpr case=end

// @lcpr case=start
// [72,48,24,3]\n
// @lcpr case=end

 */

