/*
 * @lc app=leetcode.cn id=1042 lang=java
 * @lcpr version=
 *
 * [1042] 不邻接植花
 * 
 * 51/51 cases passed (42 ms)
 * Your runtime beats 5.32 % of java submissions
 * Your memory usage beats 5.32 % of java submissions (55.1 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    int[] ans;
    Map<Integer, Set<Integer>> graph = new HashMap<>();
    boolean[] visted;
    public int[] gardenNoAdj(int n, int[][] paths) {
        ans = new int[n];
        visted = new boolean[n + 1];
        for(var path: paths) {
            graph.computeIfAbsent(path[0], k -> new HashSet<>())
                .add(path[1]);
            graph.computeIfAbsent(path[1], k -> new HashSet<>())
                .add(path[0]);
        }
        for(int i = 1; i <= n; i++) {
            if (!visted[i]) dfs(i);
        }
        return ans;
    }

    int computeFlowerType(int a, int b, int c) {
        if (a != 1 && b != 1 && c != 1) return 1;
        if (a != 2 && b != 2 && c != 2) return 2;
        if (a != 3 && b != 3 && c != 3) return 3;
        if (a != 4 && b != 4 && c != 4) return 4;
        return 0;
    }

    void dfs(int v) {
        if (visted[v]) return;
        Set<Integer> neighbors = graph.get(v);
        if (neighbors == null) {
            ans[v-1]=1;
            return;
        }
        Integer[] arr = neighbors.toArray(new Integer[]{});
        if (arr.length == 1) ans[v-1] = computeFlowerType(ans[arr[0]-1], 0, 0);
        if (arr.length == 2) ans[v-1] = computeFlowerType(ans[arr[0]-1], ans[arr[1]-1], 0);
        if (arr.length == 3) ans[v-1] = computeFlowerType(ans[arr[0]-1], ans[arr[1]-1], ans[arr[2]-1]);
        visted[v] = true;
        for(var a: arr)
            dfs(a);
    }
}
// @lc code=end



/*
// @lcpr case=start
// 3\n[[1,2],[2,3],[3,1]]\n
// @lcpr case=end

// @lcpr case=start
// 4\n[[1,2],[3,4]]\n
// @lcpr case=end

// @lcpr case=start
// 4\n[[1,2],[2,3],[3,4],[4,1],[1,3],[2,4]]\n
// 8\n[[1,8],[2,5],[3,6],[4,7],[5,8],[6,7],[7,8]]\n
// 2\n[[1,2]]\n
// 1\n[]\n
// @lcpr case=end

 */

