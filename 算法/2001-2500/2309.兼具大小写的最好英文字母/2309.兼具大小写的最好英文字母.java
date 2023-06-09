/*
 * @lc app=leetcode.cn id=2309 lang=java
 * @lcpr version=21908
 *
 * [2309] 兼具大小写的最好英文字母
 * 
 * 113/113 cases passed (3 ms)
 * Your runtime beats 78.65 % of java submissions
 * Your memory usage beats 51.04 % of java submissions (40.4 MB)
 */

// @lc code=start
class Solution {
    public String greatestLetter(String s) {
        boolean[] lows = new boolean[128];
        for(var c: s.toCharArray()) 
            if (c >='a' && c <= 'z') lows[c] = true;
        char ans = '0';
        for(var c: s.toCharArray()){
            if (c >= 'A' && c <= 'Z') {
                if (c > ans && lows[c + 32]) ans = c;
            }
        }
        if (ans == '0') return "";
        return ans + "";
    }
}
// @lc code=end



/*
// @lcpr case=start
// "lEeTcOdE"\n
// "abcdefg"\n
// "ABCDEFG"\n
// @lcpr case=end

// @lcpr case=start
// "arRAzFif"\n
// @lcpr case=end

// @lcpr case=start
// "AbCdEfGhIjK"\n
// @lcpr case=end

 */

