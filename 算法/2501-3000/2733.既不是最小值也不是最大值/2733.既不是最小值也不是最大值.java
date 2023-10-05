/*
 * @lc app=leetcode.cn id=2733 lang=java
 * @lcpr version=
 *
 * [2733] 既不是最小值也不是最大值
 * 
 * 9558/9558 cases passed (4 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 68.09 % of java submissions (42.5 MB)
 */

// @lc code=start
class Solution {
    public int findNonMinOrMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(var i : nums) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        for(var i : nums)
            if (i != min && i != max) return i;
        return -1;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,2,1,4]\n
// @lcpr case=end

// @lcpr case=start
// [1,2]\n
// @lcpr case=end

// @lcpr case=start
// [2,1,3]\n
// @lcpr case=end

 */

