/*
 * @lc app=leetcode.cn id=2027 lang=java
 * @lcpr version=
 *
 * [2027] 转换字符串的最少操作次数
 * 
 * 55/55 cases passed (1 ms)
 * Your runtime beats 71.43 % of java submissions
 * Your memory usage beats 87.07 % of java submissions (39.3 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int minimumMoves(String s) {
        int ans = 0;
        int i = 0;
        while(i < s.length()) {
            if (s.charAt(i) == 'X') {
                ans++;
                i += 3;
            } else {
                i++;
            }

        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "XXX"\n
// @lcpr case=end

// @lcpr case=start
// "XXOX"\n
// "OXOXOXOXOXOXOX"\n
// "XOXOXOXOXOXOX"\n
// "XXXXXXXXXXXOOOOOOOOOOO"\n
// "XOX"\n
// "OOO"\n
// @lcpr case=end

// @lcpr case=start
// "OOOO"\n
// @lcpr case=end

 */

