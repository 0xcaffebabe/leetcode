/*
 * @lc app=leetcode.cn id=997 lang=java
 * @lcpr version=21909
 *
 * [997] 找到小镇的法官
 * 
 * 92/92 cases passed (2 ms)
 * Your runtime beats 96.14 % of java submissions
 * Your memory usage beats 78.73 % of java submissions (47.6 MB)
 */

// @lc code=start
class Solution {
    public int findJudge(int n, int[][] trust) {
        if (n == 1 && trust.length == 0) return 1;

        int[] t = new int[n + 1]; // 信任它的人数
        int[] tt = new int[n + 1]; // 它信任的人数

        for(var i : trust) {
            t[i[1]]++;
            tt[i[0]]++;
        }
        for(int i = 0; i <= n; i++) {
            if (t[i] == n - 1 && tt[i] == 0) return i;
        }
        return -1;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 2\n[[1,2]]\n
// @lcpr case=end

// @lcpr case=start
// 3\n[[1,3],[2,3]]\n
// @lcpr case=end

// @lcpr case=start
// 3\n[[1,3],[2,3],[3,1]]\n
// @lcpr case=end

 */

