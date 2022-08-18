/*
 * @lc app=leetcode.cn id=2068 lang=java
 *
 * [2068] 检查两个字符串是否几乎相等
 * 
 * 196/196 cases passed (1 ms)
 * Your runtime beats 35.1 % of java submissions
 * Your memory usage beats 50.97 % of java submissions (39.8 MB)
 */

// @lc code=start
class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] map = new int[128];
        for(var c : word1.toCharArray()) map[c]++;
        for(var c : word2.toCharArray()) map[c]--;

        for(var i : map) if (Math.abs(i) > 3) return false;
        return true;
    }
}
// @lc code=end

