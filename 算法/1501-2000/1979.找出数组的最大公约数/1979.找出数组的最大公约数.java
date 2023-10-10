/*
 * @lc app=leetcode.cn id=1979 lang=java
 * @lcpr version=
 *
 * [1979] 找出数组的最大公约数
 * 
 * 215/215 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 94.02 % of java submissions (41.6 MB)
 */

// @lc code=start
class Solution {
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(var i : nums) {
            max = Math.max(i, max);
            min = Math.min(i, min);
        }
        return gcd(max, min);
    }
    int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,5,6,9,10]\n
// @lcpr case=end

// @lcpr case=start
// [7,5,6,8,3]\n
// @lcpr case=end

// @lcpr case=start
// [3,3]\n
// @lcpr case=end

 */

