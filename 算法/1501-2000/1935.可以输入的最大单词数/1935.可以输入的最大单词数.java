/*
 * @lc app=leetcode.cn id=1935 lang=java
 *
 * [1935] 可以输入的最大单词数
 * 
 * 20/20 cases passed (2 ms)
 * Your runtime beats 77.72 % of java submissions
 * Your memory usage beats 45.66 % of java submissions (41.2 MB)
 */

// @lc code=start
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        boolean[] map = new boolean[26];
        for(var c: brokenLetters.toCharArray()) map[c - 'a'] = true;
        int ans = 0;
        var arr = text.split(" ");
        for(var str: arr) {
            for(var c: str.toCharArray()) {
                if (map[c - 'a']) {
                    ans++;
                    break;
                }
            }
        }
        return arr.length - ans;
    }
}
// @lc code=end

