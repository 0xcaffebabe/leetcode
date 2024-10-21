/*
 * @lc app=leetcode.cn id=LCR 177 lang=java
 * @lcpr version=
 *
 * [LCR 177] 撞色搭配
 * 
 * 36/36 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 69.97 % of java submissions (44.6 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] sockCollocation(int[] sockets) {
        int sum = 0;
        for(var i: sockets) sum ^= i;

        int difInd = 0;
        while ((sum & 1) == 0) {
            difInd++;
            sum >>= 1;
        }
        int r1 = 0, r2 = 0;
        for(var i: sockets) {
            if (((i >> difInd) & 1) == 0) r1 ^= i;
            else r2 ^= i;
        }
        return new int[]{r1, r2};
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4, 5, 2, 4, 6, 6]\n
// @lcpr case=end

// @lcpr case=start
// [1, 2, 4, 1, 4, 3, 12, 3]\n
// @lcpr case=end

 */

