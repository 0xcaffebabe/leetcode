/*
 * @lc app=leetcode.cn id=1329 lang=java
 * @lcpr version=
 *
 * [1329] 将矩阵按对角线排序
 * 
 * 15/15 cases passed (8 ms)
 * Your runtime beats 12.75 % of java submissions
 * Your memory usage beats 23.53 % of java submissions (43 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    int[][] mat;
    public int[][] diagonalSort(int[][] mat) {
        this.mat = mat;
        int[][] ret = new int[mat.length][mat[0].length];
        // 左侧
        for(int i = mat[0].length - 1; i >= 0; i--) {
            int x = 0;
            int y = i;
            List<Integer> list = new ArrayList<>();
            while(in(x, y)) {
                list.add(mat[x][y]);
                x++;
                y++;
            }
            Collections.sort(list);
            x = 0; y = i;
            int cnt = 0;
            while(in(x, y)) {
                ret[x][y] = list.get(cnt++);
                x++;
                y++;
            }
        }
        // 下侧
        for(int i = 1; i < mat.length; i++) {
            int x = i;
            int y = 0;
            List<Integer> list = new ArrayList<>();
            while(in(x, y)) {
                list.add(mat[x][y]);
                x++;
                y++;
            }
            Collections.sort(list);
            x = i; y = 0;
            int cnt = 0;
            while(in(x, y)) {
                ret[x][y] = list.get(cnt++);
                x++;
                y++;
            }
        }
        return ret;
    }

    boolean in(int x, int y) {
        if (x < 0 || y < 0) return false;
        if (x >= mat.length || y >= mat[0].length) return false;
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[3,3,1,1],[2,2,1,2],[1,1,1,2]]\n
// [[2,1],[4,1]]\n
// [[3,97,72,77,16,76,51,22,80,76,84,35,20,68,97,25,86,80,39,22,79,20,15,78,35,68,10,97,5,44,9,49,19,9,70,63,89,84,66,31,29,33,51,24,60,66,69,9,80,15],[3,97,72,77,16,76,51,22,80,76,84,35,20,68,97,25,86,80,39,22,79,20,15,78,35,68,10,97,5,44,9,49,19,9,70,63,89,84,66,31,29,33,51,24,60,66,69,9,80,15]]\n
// @lcpr case=end

// @lcpr case=start
// [[11,25,66,1,69,7],[23,55,17,45,15,52],[75,31,36,44,58,8],[22,27,33,25,68,4],[84,28,14,11,5,50]]\n
// @lcpr case=end

 */

