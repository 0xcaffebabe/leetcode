/*
 * @lc app=leetcode.cn id=LCP 62 lang=java
 * @lcpr version=
 *
 * [LCP 62] 交通枢纽
 * 
 * 67/67 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 19.72 % of java submissions (43.3 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int transportationHub(int[][] path) {
        boolean[] nodes = new boolean[1001];
        int[] inDegrees = new int[1001];
        int[] outDegrees = new int[1001];
        for(var p: path) {
            nodes[p[0]] = true;
            nodes[p[1]] = true;
            inDegrees[p[1]]++;
            outDegrees[p[0]]++;
        }

        int nodeCnt = 0;
        for(var i: nodes) if (i) nodeCnt++;
        for(int i = 0; i < inDegrees.length; i++) {
            if (inDegrees[i] == nodeCnt - 1 && outDegrees[i] == 0) 
                return i;
        }

        return -1;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[0,1],[0,3],[1,3],[2,0],[2,3]]\n
// @lcpr case=end

// @lcpr case=start
// [[0,3],[1,0],[1,3],[2,0],[3,0],[3,2]]\n
// @lcpr case=end

 */

