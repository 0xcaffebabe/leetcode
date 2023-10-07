/*
 * @lc app=leetcode.cn id=LCP 66 lang=java
 * @lcpr version=
 *
 * [LCP 66] 最小展台数量
 * 
 * 62/62 cases passed (2 ms)
 * Your runtime beats 96.93 % of java submissions
 * Your memory usage beats 47.85 % of java submissions (39.9 MB)
 */

// @lc code=start
class Solution {
    public int minNumBooths(String[] demand) {
        int[] m = new int[26];
        for(var i : demand) {
            int[] n = new int[26];
            for(var j : i.toCharArray())
                n[j - 'a']++;
            for(int k = 0; k < m.length; k++) {
                m[k] = Math.max(m[k], n[k]);
            }
        }
        int ans = 0;
        for(var i : m) ans+=i;
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["abc","ab","ac","b"]\n
// ["acd","bed","accd"]\n
// @lcpr case=end

// @lcpr case=start
// @lcpr case=end

 */

