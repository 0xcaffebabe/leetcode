/*
 * @lc app=leetcode.cn id=1400 lang=java
 *
 * [1400] 构造 K 个回文字符串
 * 
 * 108/108 cases passed (3 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 73.21 % of java submissions (41.8 MB)
 */

// @lc code=start
class Solution {
    public boolean canConstruct(String s, int k) {
        if (s.length() < k) return false;
        int[] map = new int[26];
        for(var c : s.toCharArray()) map[c - 'a']++;
        int ans = 0;
        for(var i : map) if (i % 2 == 1) ans++;
        return ans <= k;
    }
}
// @lc code=end

