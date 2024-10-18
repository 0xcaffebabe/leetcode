/*
 * @lc app=leetcode.cn id=926 lang=java
 * @lcpr version=
 *
 * [926] 将字符串翻转到单调递增
 * 
 * 93/93 cases passed (8 ms)
 * Your runtime beats 85.15 % of java submissions
 * Your memory usage beats 56.77 % of java submissions (44.3 MB)
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
// "0"\n
// "1"\n
// "01"\n
// "10"\n
// "11"\n
// "00"\n
// @lcpr case=end

// @lcpr case=start
// "010110"\n
// @lcpr case=end

// @lcpr case=start
// "00011000"\n
// @lcpr case=end

 */

