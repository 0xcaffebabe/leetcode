/*
 * @lc app=leetcode.cn id=1880 lang=java
 *
 * [1880] 检查某单词是否等于两单词之和
 * 
 * 100/100 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 71.6 % of java submissions (39.4 MB)
 */

// @lc code=start
class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return toNum(firstWord) + toNum(secondWord) == toNum(targetWord);
    }

    private int toNum(String word) {
        int n = word.length() - 1;
        int ret = 0;
        for(int i = n; i >= 0; i--) {
            char c = word.charAt(i);
            if (n == i) ret += c - 97;
            else ret += (c - 97) * Math.pow(10, n - i);
        }
        return ret;
    }
}
// @lc code=end

