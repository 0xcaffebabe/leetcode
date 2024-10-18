/*
 * @lc app=leetcode.cn id=LCR 092 lang=java
 * @lcpr version=
 *
 * [LCR 092] 将字符串翻转到单调递增
 * 
 * 81/81 cases passed (3 ms)
 * Your runtime beats 93.97 % of java submissions
 * Your memory usage beats 95.26 % of java submissions (41.5 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int minFlipsMonoIncr(String s) {
        int n = s.length();
        int ans = 0;
        int oneCnt = 0;
        for(int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') oneCnt++;
            else ans = Math.min(ans + 1, oneCnt);
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "00110"\n
// @lcpr case=end

// @lcpr case=start
// "010110"\n
// @lcpr case=end

// @lcpr case=start
// "00011000"\n
// @lcpr case=end

 */

