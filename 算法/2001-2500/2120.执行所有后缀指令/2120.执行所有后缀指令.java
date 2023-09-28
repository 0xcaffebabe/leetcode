/*
 * @lc app=leetcode.cn id=2120 lang=java
 * @lcpr version=
 *
 * [2120] 执行所有后缀指令
 * 
 * 113/113 cases passed (28 ms)
 * Your runtime beats 60.44 % of java submissions
 * Your memory usage beats 78.02 % of java submissions (42.6 MB)
 */

// @lc code=start
class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int[] ans = new int[s.length()];
        for(int i = 0; i < s.length(); i++) {
            int r = startPos[0];
            int c = startPos[1];
            int cnt = 0;
            for(int k = i; k < s.length(); k++) {
                char p = s.charAt(k);
                if (p == 'R') c++;
                if (p == 'L') c--;
                if (p == 'U') r--;
                if (p == 'D') r++;
                if (c < 0 || r < 0 || c >= n || r >= n) {
                    break;
                }
                cnt++;
            }
            ans[i] = cnt;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 3\n[0,1]\n"RRDDLU"\n
// @lcpr case=end

// @lcpr case=start
// 2\n[1,1]\n"LURD"\n
// @lcpr case=end

// @lcpr case=start
// 1\n[0,0]\n"LRUD"\n
// 3\n[1, 2]\n"LLRRRUDUD"\n
// 4\n[2, 0]\n"UUDDRRRLD"\n
// 2\n[0, 0]\n"RRLL"\n
// 5\n[3, 4]\n"UDUDUUULRR"


// @lcpr case=end

 */

