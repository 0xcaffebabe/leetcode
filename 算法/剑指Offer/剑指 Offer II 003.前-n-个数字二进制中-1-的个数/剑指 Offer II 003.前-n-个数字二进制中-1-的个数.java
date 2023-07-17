/*
 * @lc app=leetcode.cn id=剑指 Offer II 003 lang=java
 * @lcpr version=21909
 *
 * [剑指 Offer II 003] 前 n 个数字二进制中 1 的个数
 * 
 * 15/15 cases passed (7 ms)
 * Your runtime beats 12.44 % of java submissions
 * Your memory usage beats 67.47 % of java submissions (45.3 MB)
 */

// @lc code=start
class Solution {
    public int[] countBits(int num) {
        int[] ret = new int[num+1];
        for(int i=0;i<=num;i++){
            int k = i;
            while(k > 0) {
                ret[i]+=k%2;
                k/=2;
            }
        }
        return ret;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 2\n
// @lcpr case=end

// @lcpr case=start
// 5\n
// @lcpr case=end

 */

