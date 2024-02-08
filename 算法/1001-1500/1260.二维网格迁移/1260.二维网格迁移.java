/*
 * @lc app=leetcode.cn id=1260 lang=java
 * @lcpr version=
 *
 * [1260] 二维网格迁移
 * 
 * 107/107 cases passed (5 ms)
 * Your runtime beats 75 % of java submissions
 * Your memory usage beats 5.39 % of java submissions (43.6 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[] arr = new int[m * n];
        int cnt = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                arr[(cnt + k) % (m * n)]= grid[i][j];
                cnt++;
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < m * n; i++) {
            if (i % n == 0) ans.add(new ArrayList<>());
            ans.get(ans.size() - 1).add(arr[i]);
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,2,3],[4,5,6],[7,8,9]]\n1\n
// @lcpr case=end

// @lcpr case=start
// [[1],[2],[3],[4],[7],[6],[5]]\n23\n
// @lcpr case=end

// @lcpr case=start
// [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]]\n4\n
// @lcpr case=end

// @lcpr case=start
// [[1,2,3],[4,5,6],[7,8,9]]\n9\n
// [[1]]\n9\n
// [[1]]\n1\n
// @lcpr case=end

 */

