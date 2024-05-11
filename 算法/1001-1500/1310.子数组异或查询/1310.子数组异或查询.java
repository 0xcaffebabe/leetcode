/*
 * @lc app=leetcode.cn id=1310 lang=java
 * @lcpr version=
 *
 * [1310] 子数组异或查询
 * 
 * 42/42 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 95.56 % of java submissions (54.1 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int sum = 0;
        int[] prefixs = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            sum ^= arr[i];
            prefixs[i] = sum;
        }
        int[] ans = new int[queries.length];
        for(int i = 0; i < queries.length; i++) {
            if (queries[i][0] == 0) ans[i] = prefixs[queries[i][1]];
            else ans[i] = prefixs[queries[i][1]] ^ prefixs[queries[i][0] - 1];
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,3,4,8]\n[[0,1],[1,2],[0,3],[3,3]]\n
// [1]\n[[0,0]]\n
// [15,8,8,8,15]\n[[2,2],[3,3]]\n
// @lcpr case=end

// @lcpr case=start
// [4,8,2,10]\n[[2,3],[1,3],[0,0],[0,3]]\n
// @lcpr case=end

 */

