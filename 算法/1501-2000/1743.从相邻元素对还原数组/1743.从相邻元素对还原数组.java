/*
 * @lc app=leetcode.cn id=1743 lang=java
 * @lcpr version=
 *
 * [1743] 从相邻元素对还原数组
 * 
 * 46/46 cases passed (97 ms)
 * Your runtime beats 63.73 % of java submissions
 * Your memory usage beats 29.41 % of java submissions (93 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    int[] ans;
    int index = 0;
    Map<Integer, List<Integer>> graph = new HashMap<>();
    int start = Integer.MAX_VALUE;
    int end = Integer.MAX_VALUE;
    public int[] restoreArray(int[][] adjacentPairs) {
        int n = adjacentPairs.length + 1;
        ans = new int[n];
        for(var i : adjacentPairs) {
            graph.computeIfAbsent(i[0], k -> new ArrayList<>())
                .add(i[1]);
            graph.computeIfAbsent(i[1], k -> new ArrayList<>())
                .add(i[0]);
        }
        for(var enr: graph.entrySet()) {
            if (enr.getValue().size() == 1) {
                if (start == Integer.MAX_VALUE) start = enr.getKey();
                else end = enr.getKey();
            }
        }
        // System.out.println(start + "|" + end);
        dfs(start, Integer.MAX_VALUE);
        return ans;
    }

    void dfs(int v, int p) {
        // System.out.println(index + "|" + v);
        ans[index++] = v;
        if (v == end) return;
        for (var n: graph.get(v)) {
            if (n == p) continue;
            dfs(n, v);
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[2,1],[3,4],[3,2]]\n
// @lcpr case=end

// @lcpr case=start
// [[4,-2],[1,4],[-3,1]]\n
// @lcpr case=end

// @lcpr case=start
// [[100000,-100000]]\n

// @lcpr case=end

 */

