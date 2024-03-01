/*
 * @lc app=leetcode.cn id=2924 lang=java
 * @lcpr version=
 *
 * [2924] 找到冠军 II
 * 
 * 758/758 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 16.95 % of java submissions (44.7 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int findChampion(int n, int[][] edges) {
        int[] inDegrees = new int[n];
        for(var i: edges) inDegrees[i[1]]++;
        int ans = -1;
        for(int i = 0; i < n; i++) {
            if (inDegrees[i] == 0) {
                if (ans == -1) ans = i;
                else return -1;
            }
        }
        return ans;
    }
}
// @lc code=end


/*
// @lcpr case=start
// 3\n[[0,1],[1,2]]\n
// 1\n[]\n
// @lcpr case=end

// @lcpr case=start
// 4\n[[0,2],[1,3],[1,2]]\n
// @lcpr case=end

 */

