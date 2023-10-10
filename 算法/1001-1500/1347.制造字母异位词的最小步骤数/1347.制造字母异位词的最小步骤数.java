/*
 * @lc app=leetcode.cn id=1347 lang=java
 * @lcpr version=
 *
 * [1347] 制造字母异位词的最小步骤数
 * 
 * 63/63 cases passed (6 ms)
 * Your runtime beats 96.97 % of java submissions
 * Your memory usage beats 81.82 % of java submissions (43 MB)
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int minSteps(String s, String t) {
        int[] a = new int[26];
        int[] b = new int[26];
        for(var c: s.toCharArray()) a[c - 'a']++;
        for(var c: t.toCharArray()) b[c - 'a']++;
        for(int i = 0; i < 26; i++)
            a[i] -= b[i];
        // System.out.println(Arrays.toString(a));
        int ans = 0;
        for(var i : a)
            if (i < 0) ans += Math.abs(i);
        return ans;
    }
}
// @lc code=end


/*
// @lcpr case=start
// "bab"\n"aba"\n
// "leetcode"\n"practice"\n
// "anagram"\n "mangaar"\n
// "friend"\n "family"\n
// "aaaa"\n "bbbb"\n
// @lcpr case=end

 */
