/*
 * @lc app=leetcode.cn id=剑指 Offer II 014 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 014] 字符串中的变位词
 * 
 * 106/106 cases passed (5 ms)
 * Your runtime beats 70.22 % of java submissions
 * Your memory usage beats 94.34 % of java submissions (40.7 MB)
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



/*
// @lcpr case=start
// "eidbaooo"\n
// @lcpr case=end

// @lcpr case=start
// "eidboaoo"\n
// @lcpr case=end

 */

