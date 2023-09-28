/*
 * @lc app=leetcode.cn id=2161 lang=java
 * @lcpr version=
 *
 * [2161] 根据给定数字划分数组
 * 
 * 44/44 cases passed (5 ms)
 * Your runtime beats 58.57 % of java submissions
 * Your memory usage beats 38.57 % of java submissions (64.1 MB)
 */

// @lc code=start
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int lcnt = 0;
        int rcnt = 0;
        for(var i : nums) {
            if (i < pivot) lcnt++;
            if (i > pivot) rcnt++;
        }

        int lp = 0;
        int rp = nums.length - rcnt;
        int pp = lcnt;
        int[] ans = new int[nums.length];
        for(var i : nums) {
            if (i < pivot) ans[lp++] = i;
            if (i > pivot) ans[rp++] = i;
            if (i == pivot) ans[pp++] = i;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [9,12,5,10,14,3,10]\n10\n
// @lcpr case=end

// @lcpr case=start
// [-3,4,3,2]\n2\n
// [1]\n1\n
// @lcpr case=end

 */

