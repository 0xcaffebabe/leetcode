/*
 * @lc app=leetcode.cn id=1860 lang=java
 * @lcpr version=21907
 *
 * [1860] 增长的内存泄露
 * 
 * 82/82 cases passed (5 ms)
 * Your runtime beats 42.67 % of java submissions
 * Your memory usage beats 40 % of java submissions (39.2 MB)
 */

// @lc code=start
class Solution {
    public int[] memLeak(int memory1, int memory2) {
        int i = 1;
        while(i <= memory1 || i <= memory2) {
            if (memory1 >= memory2) memory1 -= i;
            else memory2 -= i;
            i++;
        }
        return new int[]{i, memory1, memory2};
    }
}
// @lc code=end



/*
// @lcpr case=start
// 2\n2\n
// @lcpr case=end

// @lcpr case=start
// 8\n11\n
// @lcpr case=end

// @lcpr case=start
// 2147483647\n0\n
// @lcpr case=end

// @lcpr case=start
// 2147483647\n2147483647\n
// @lcpr case=end

 */

