/*
 * @lc app=leetcode.cn id=2535 lang=java
 * @lcpr version=
 *
 * [2535] 数组元素和与数字和的绝对差
 * 
 * 142/142 cases passed (2 ms)
 * Your runtime beats 89.59 % of java submissions
 * Your memory usage beats 50.47 % of java submissions (42.6 MB)
 */

// @lc code=start
class Solution {
    public int differenceOfSum(int[] nums) {
        int esum = 0;
        int dsum = 0;
        for(var i : nums) {
            esum += i;
            dsum += dsum(i);
        }
        return Math.abs(esum - dsum);
    }

    int dsum(int d) {
        int sum = 0;
        while(d > 0) {
            sum += d % 10;
            d /= 10;
        }
        return sum;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,15,6,3]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4]\n
// [1]\n
// [1,2]\n
// [1,2,3]\n
// [1,1,1]\n
// [1,1]\n
// @lcpr case=end

 */

