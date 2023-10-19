/*
 * @lc app=leetcode.cn id=2441 lang=java
 * @lcpr version=
 *
 * [2441] 与对应负数同时存在的最大正整数
 * 
 * 337/337 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 72.23 % of java submissions (42.5 MB)
 */

// @lc code=start
class Solution {
    public int findMaxK(int[] nums) {
        boolean[] m = new boolean[2002];
        for(var i : nums)
            m[i + 1000] = true;
        int max = -1;
        for(var i : nums)
            if (i < 0) continue;
            else if (m[-i + 1000]) max = Math.max(max, i);
        return max;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [-1,2,-3,3]\n
// @lcpr case=end

// @lcpr case=start
// [-1,10,6,7,-7,1]\n
// @lcpr case=end

// @lcpr case=start
// [-10,8,6,7,-2,-3]\n
// [-1000,1000]\n
// @lcpr case=end

 */

