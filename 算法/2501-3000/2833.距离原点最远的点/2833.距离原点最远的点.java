/*
 * @lc app=leetcode.cn id=2833 lang=java
 * @lcpr version=
 *
 * [2833] 距离原点最远的点
 * 
 * 1252/1252 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 81.48 % of java submissions (40.2 MB)
 */

// @lc code=start
class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int r = 0;
        int l = 0;
        for(var c : moves.toCharArray()) {
            if (c == 'R') r++;
            if (c == 'L') l++;
        }
        return Math.abs(l - r) + moves.length() - (l + r);
    }
}
// @lc code=end



/*
// @lcpr case=start
// "L_RL__R"\n
// @lcpr case=end

// @lcpr case=start
// "_R__LL_"\n
// @lcpr case=end

// @lcpr case=start
// "_______"\n
// @lcpr case=end

 */

