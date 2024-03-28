/*
 * @lc app=leetcode.cn id=1334 lang=java
 * @lcpr version=
 *
 * [1334] 阈值距离内邻居最少的城市
 * 
 * 54/54 cases passed (8 ms)
 * Your runtime beats 65.72 % of java submissions
 * Your memory usage beats 47.17 % of java submissions (43.4 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        // 每个点之间的最短路径
        int[][] d = new int[n][n];
        for(int i = 0; i < n; i++) {
            Arrays.fill(d[i], Integer.MAX_VALUE);
            d[i][i] = 0;
        }

        for(var e: edges) {
            d[e[0]][e[1]] = e[2];
            d[e[1]][e[0]] = e[2];
        }
        for(int k=0;k<n;k++)//中转站0~k
            for(int i=0;i<n;i++) //i为起点
                for(int j=0;j<n;j++) //j为终点
                    if(d[i][k] != Integer.MAX_VALUE && d[k][j] != Integer.MAX_VALUE)
                        d[i][j]=Math.min(d[i][j], d[i][k]+d[k][j]); 
        int ans = -1;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            int cnt = 0; // 可到达的城市数量
            for(int j = 0; j < n; j++) {
                if (d[i][j] <= distanceThreshold) cnt++;
            }
            if (cnt <= min) {
                ans = i;
                min = cnt;
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 4\n[[0,1,3],[1,2,1],[1,3,4],[2,3,1]]\n4\n
// 2\n[[0,1,1]]\n1\n
// 3\n[[0,1,1],[1,2,1]]\n1\n
// @lcpr case=end

// @lcpr case=start
// 5\n[[0,1,2],[0,4,8],[1,2,3],[1,4,2],[2,3,1],[3,4,1]]\n2\n
// @lcpr case=end

 */

