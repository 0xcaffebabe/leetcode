/*
 * @lc app=leetcode.cn id=2455 lang=java
 * @lcpr version=21908
 *
 * [2455] 可被三整除的偶数的平均值
 * 
 * 181/181 cases passed (1 ms)
 * Your runtime beats 54.2 % of java submissions
 * Your memory usage beats 27.62 % of java submissions (41.9 MB)
 */

// @lc code=start
class Solution {
    public int averageValue(int[] nums) {
        int sum = 0;
        int cnt = 0;
        for(var i : nums) {
            if (i % 3 == 0 && i % 2 == 0) {
                sum += i;
                cnt++;
            }
        }
        if (cnt == 0) return 0;
        return sum / cnt;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,3,6,10,12,15]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,4,7,10]\n
// @lcpr case=end

 */

