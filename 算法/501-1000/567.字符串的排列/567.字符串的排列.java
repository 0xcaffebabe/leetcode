import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=567 lang=java
 *
 * [567] 字符串的排列
 * 
 * 107/107 cases passed (5 ms)
 * Your runtime beats 77.93 % of java submissions
 * Your memory usage beats 69.69 % of java submissions (41.2 MB)
 */

// @lc code=start
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // s1各个字符的频次
        int[] map1 = new int[26];
        // s2窗口内各个字符的频次
        int[] map2 = new int[26];
        int n = s1.length();
        int m = s2.length();
        if (n > m) return false;
        for(int i = 0; i < n; i++) {
            map1[s1.charAt(i) - 'a']++;
            map2[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(map1, map2)) return true;
        for(int i = n; i < m; i++) {
            // 窗口向右平移
            map2[s2.charAt(i) - 'a']++;
            map2[s2.charAt(i - n) - 'a']--;
            if (Arrays.equals(map1, map2)) return true;
        }
        return false;
    }
}
// @lc code=end

