/*
 * @lc app=leetcode.cn id=2024 lang=java
 * @lcpr version=
 *
 * [2024] 考试的最大困扰度
 * 
 * 93/93 cases passed (11 ms)
 * Your runtime beats 82.56 % of java submissions
 * Your memory usage beats 81.4 % of java submissions (43.6 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int n = answerKey.length();
        int l = 0, r = 0;
        int ans = 0;
        int t = 0, f = 0;
        while(r < n) {
            if (answerKey.charAt(r) == 'T') t++;
            else f++;
            while(Math.min(t, f) > k) {
                if (answerKey.charAt(l) == 'T') t--;
                else f--;
                l++;
            }
            ans = Math.max(ans, r - l + 1);
            r++;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "TTFF"\n2\n
// @lcpr case=end

// @lcpr case=start
// "TFFT"\n1\n
// @lcpr case=end

// @lcpr case=start
// "TTFTTFTT"\n1\n
// @lcpr case=end

 */

