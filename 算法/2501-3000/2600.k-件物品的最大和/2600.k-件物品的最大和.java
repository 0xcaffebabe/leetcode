/*
 * @lc app=leetcode.cn id=2600 lang=java
 * @lcpr version=21909
 *
 * [2600] K 件物品的最大和
 * 
 * 1310/1310 cases passed (1 ms)
 * Your runtime beats 82.01 % of java submissions
 * Your memory usage beats 45.71 % of java submissions (39 MB)
 */

// @lc code=start
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int ans = 0;
        while(k != 0) {
            if (numOnes > 0) {
                k--;
                numOnes--;
                ans++;
                continue;
            } else if (numZeros > 0) {
                k--;
                numZeros--;
                continue;
            } else if (numNegOnes > 0) {
                k--;
                ans--;
                numNegOnes--;
                continue;
            }
            break;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 3\n2\n0\n2\n
// 0\n0\n3\n2\n
// 0\n0\n0\n0\n
// @lcpr case=end

// @lcpr case=start
// 3\n2\n0\n4\n
// @lcpr case=end

 */

