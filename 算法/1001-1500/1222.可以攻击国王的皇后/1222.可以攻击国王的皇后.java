/*
 * @lc app=leetcode.cn id=1222 lang=java
 * @lcpr version=
 *
 * [1222] 可以攻击国王的皇后
 * 
 * 100/100 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 18.42 % of java submissions (41.8 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        int[][] dirs = {{-1,-1}, {-1, 0},{-1,1},
                      {0,-1}, {0,1},
                      {1,-1}, {1,0}, {1,1}
                    };
        int[][] grid = new int[8][8];
        for(var q: queens) grid[q[0]][q[1]] = 1;
        List<List<Integer>> res = new ArrayList<>();
        for(var dir: dirs) {
            var x = king[0];
            var y = king[1];
            while(true) {
                x += dir[0];
                y += dir[1];
                if (x < 0 || x >= 8 || y < 0 || y >= 8) break;
                if (grid[x][y] == 1) {
                    res.add(List.of(x, y));
                    break;
                }
            }
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[0,1],[1,0],[4,0],[0,4],[3,3],[2,4]]\n[0,0]\n
// [[0,1],[1,0],[4,0],[0,4],[3,3],[2,4]]\n[7,7]\n
// [[0,1],[1,0],[4,0],[0,4],[3,3],[2,4]]\n[0,7]\n
// [[0,1],[1,0],[4,0],[0,4],[3,3],[2,4]]\n[7,0]\n
// @lcpr case=end

// @lcpr case=start
// [[0,0],[1,1],[2,2],[3,4],[3,5],[4,4],[4,5]]\n[3,3]\n
// @lcpr case=end

 */

