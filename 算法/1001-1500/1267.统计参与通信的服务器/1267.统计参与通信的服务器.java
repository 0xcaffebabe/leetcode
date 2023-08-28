/*
 * @lc app=leetcode.cn id=1267 lang=java
 * @lcpr version=21913
 *
 * [1267] 统计参与通信的服务器
 * 
 * 55/55 cases passed (6 ms)
 * Your runtime beats 13.15 % of java submissions
 * Your memory usage beats 77.47 % of java submissions (47.4 MB)
 */

// @lc code=start

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {
    public int countServers(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        Map<Integer, Integer> rowMap = new HashMap<>();
        Map<Integer, Integer> colMap = new HashMap<>();
        
        for(int r = 0; r < m; r++) {
            for(int c = 0; c < n; c++) {
                if (grid[r][c] == 0) continue;
                rowMap.putIfAbsent(r, 0);
                colMap.putIfAbsent(c, 0);
                rowMap.put(r, rowMap.get(r) + 1);
                colMap.put(c, colMap.get(c) + 1);
            }
        }
        // System.out.println(rowMap);
        // System.out.println(colMap);
        int ans = 0;
        for(int r = 0; r < m; r++) {
            for(int c = 0; c < n; c++) {
                if (grid[r][c] == 0) continue;
                if (rowMap.get(r) > 1) ans++;
                else if (colMap.get(c) > 1) ans++;
                
            }
        }
        return ans;
        
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,0],[0,1]]\n
// [[1,1],[1,1]]\n
// [[1],[1]]\n
// [[1]]\n
// [[0]]\n
// [[0,0],[0,0]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,0],[1,1]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,1,0,0],[0,0,1,0],[0,0,1,0],[0,0,0,1]]\n
// @lcpr case=end

 */

