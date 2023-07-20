/*
 * @lc app=leetcode.cn id=剑指 Offer II 073 lang=java
 * @lcpr version=21910
 *
 * [剑指 Offer II 073] 狒狒吃香蕉
 * 
 * 118/118 cases passed (19 ms)
 * Your runtime beats 14.48 % of java submissions
 * Your memory usage beats 28.67 % of java submissions (43.1 MB)
 */

// @lc code=start
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long left = 1;
        long right = 0;
        for(var p : piles) right = Math.max(p, right);
        long ans = right;

        while(left < right) {
            long mid = (left + right) / 2;
            // 以这个速度吃香蕉 需要多少时间
            var h0 = getTimes(piles, mid);
            if (h0 <= h) {
                // 快了或刚好
                ans = mid;
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return (int) ans;
    }

    long getTimes(int[] piles, long speed) {
        long times = 0;
        for(var p : piles) {
            if (p % speed > 0) times++;
            times += p/ speed;
        }
        return times;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,6,7,11]\n8\n
// @lcpr case=end

// @lcpr case=start
// [30,11,23,4,20]\n5\n
// @lcpr case=end

// @lcpr case=start
// [30,11,23,4,20]\n6\n
// @lcpr case=end

 */

