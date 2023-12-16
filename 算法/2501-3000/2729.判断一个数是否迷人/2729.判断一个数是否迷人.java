/*
 * @lc app=leetcode.cn id=2729 lang=java
 * @lcpr version=30112
 *
 * [2729] 判断一个数是否迷人
 * 
 * 900/900 cases passed (9 ms)
 * Your runtime beats 40.18 % of java submissions
 * Your memory usage beats 11.61 % of java submissions (39.7 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean isFascinating(int n) {
        String s = n + "" + (2 * n) + "" + (3 * n);
        int[] m = new int[10];
        for(var c: s.toCharArray())
            m[c - '0']++;
        if (m[0] != 0) return false;
        for(int i = 1; i <= 9; i++)
            if (m[i] != 1) return false;
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 192\n
// @lcpr case=end

// @lcpr case=start
// 100\n
// @lcpr case=end

 */

