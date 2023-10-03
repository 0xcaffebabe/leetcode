/*
 * @lc app=leetcode.cn id=2103 lang=java
 * @lcpr version=
 *
 * [2103] 环和杆
 * 
 * 66/66 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 96.23 % of java submissions (39 MB)
 */

// @lc code=start
class Solution {
    public int countPoints(String rings) {
        int[] b = new int[10];
        int[] g = new int[10];
        int[] r = new int[10];
        for(int i = 1; i < rings.length(); i+= 2) {
            char c = rings.charAt(i - 1);
            int n = rings.charAt(i) - '0';
            if (c == 'B') b[n]++;
            if (c == 'G') g[n]++;
            if (c == 'R') r[n]++;
        }
        int ans = 0;
        for(int i = 0; i < 10; i++)
            if (b[i] != 0 && g[i] !=0 && r[i] != 0) ans++;
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "B0B6G0R6R0R6G9"\n
// @lcpr case=end

// @lcpr case=start
// "B0R0G0R9R0B0G0"\n
// @lcpr case=end

// @lcpr case=start
// "G4"\n
// @lcpr case=end

 */

