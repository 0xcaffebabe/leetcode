/*
 * @lc app=leetcode.cn id=LCP 50 lang=java
 * @lcpr version=
 *
 * [LCP 50] 宝石补给
 * 
 * 63/63 cases passed (2 ms)
 * Your runtime beats 91.3 % of java submissions
 * Your memory usage beats 9.78 % of java submissions (42.8 MB)
 */

// @lc code=start
class Solution {
    public int giveGem(int[] gem, int[][] operations) {
        for(var i : operations) {
            gem[i[1]] += gem[i[0]] / 2;
            gem[i[0]] -= gem[i[0]] / 2;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(var i : gem) {
            if (i > max) max = i;
            if (i < min) min = i;
        }
        return max - min;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,1,2]\n[[0,2],[2,1],[2,0]]\n
// [100,0,50,100]\n[[0,2],[0,1],[3,0],[3,0]]\n
// [0,0,0,0]\n[[1,2],[3,1],[1,2]]\n
// @lcpr case=end

// @lcpr case=start
// @lcpr case=end

// @lcpr case=start
// @lcpr case=end

 */

