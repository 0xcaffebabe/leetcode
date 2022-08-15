/*
 * @lc app=leetcode.cn id=455 lang=java
 *
 * [455] 分发饼干
 * 
 * 21/21 cases passed (8 ms)
 * Your runtime beats 24.61 % of java submissions
 * Your memory usage beats 18.59 % of java submissions (42.7 MB)
 */

// @lc code=start
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ans = 0;
        int p = 0;
        int q = 0;
        while(p < g.length && q < s.length) {
            if (s[q] >= g[p]) {
                ans++;
                p++;
                q++;
            }else if (s[q] < g[p]) {
                q++;
            }
        }

        return ans;
    }
}
// @lc code=end

