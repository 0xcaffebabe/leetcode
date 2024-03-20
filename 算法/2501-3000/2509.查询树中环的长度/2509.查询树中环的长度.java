/*
 * @lc app=leetcode.cn id=2509 lang=java
 * @lcpr version=
 *
 * [2509] 查询树中环的长度
 * 
 * 27/27 cases passed (52 ms)
 * Your runtime beats 9.3 % of java submissions
 * Your memory usage beats 76.74 % of java submissions (86.7 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] cycleLengthQueries(int n, int[][] queries) {
        // System.out.println(depth(10));;
        // System.out.println(lca(4, 5));

        int[] ans = new int[queries.length];
        for(int i = 0; i < queries.length; i++) {
            var a = queries[i][0];
            var b = queries[i][1];
            ans[i] = depth(a) + depth(b) - 2 * depth(lca(a,b)) + 1;
        }
        return ans;
    }

    /* 
     * 
     * 最近的共同祖先
     */
    int lca(int a, int b) {
        while(a != b) {
            if (a > b) a /= 2;
            else b /= 2;
        }
        return a;
    }

    int depth(int n) {
        int d = 0;
        while(n > 1) {
            n /= 2;
            d++;
        }
        return d;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 3\n[[5,3],[4,7],[2,3]]\n
// @lcpr case=end

// @lcpr case=start
// 2\n[[1,2]]\n
// 29\n[[1,50000]]\n
// 30\n[[1,500000]]\n
// 30\n[[98765,500000]]\n
// 30\n[[98765,5000000]]\n
// 30\n[[98765,500000000]]\n
// @lcpr case=end

 */

