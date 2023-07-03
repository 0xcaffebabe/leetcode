/*
 * @lc app=leetcode.cn id=492 lang=java
 * @lcpr version=21909
 *
 * [492] 构造矩形
 * 
 * 52/52 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 19.62 % of java submissions (39.3 MB)
 */

// @lc code=start
class Solution {
    public int[] constructRectangle(int area) {

        int wid = (int) Math.sqrt(area);
        while(area % wid != 0) {
            wid--;
        }
        return new int[]{area / wid, wid};
    }
}
// @lc code=end



/*
// @lcpr case=start
// 4\n
// 151518\n
// 9999825\n
// 1\n
// @lcpr case=end

// @lcpr case=start
// 37\n
// @lcpr case=end

// @lcpr case=start
// 122122\n
// @lcpr case=end

 */

