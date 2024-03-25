/*
 * @lc app=leetcode.cn id=2050 lang=java
 * @lcpr version=
 *
 * [2050] 并行课程 III
 * 
 * 42/42 cases passed (28 ms)
 * Your runtime beats 11.71 % of java submissions
 * Your memory usage beats 43.24 % of java submissions (67.6 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Solution {
    public int minimumTime(int n, int[][] relations, int[] time) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        int[] indegress = new int[n + 1];
        for(var r: relations) {
            graph.computeIfAbsent(r[0], k -> new ArrayList<>()).add(r[1]);
            indegress[r[1]] ++;
        }
        LinkedList<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= n; i++) {
            if (indegress[i] == 0) queue.offer(i);
        }
        // 每门课最少完成的时间
        int[] ftime = new int[n + 1];

        while(!queue.isEmpty()) {
            var k = queue.poll();
            ftime[k] += time[k-1];

            var neighbors = graph.get(k);
            if (neighbors == null) continue;
            for(var neighbor: neighbors) {
                ftime[neighbor] = Math.max(ftime[neighbor], ftime[k]);
                indegress[neighbor] --;
                if (indegress[neighbor] == 0) queue.offer(neighbor);
            }
        }
        int ans = 0;
        for(var i: ftime) ans = Math.max(i, ans);
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 3\n[[1,3],[2,3]]\n[3,2,5]\n
// 2\n[[1,2]]\n[3,2]\n
// 1\n[]\n[2]\n
// @lcpr case=end

// @lcpr case=start
// 5\n[[1,5],[2,5],[3,5],[3,4],[4,5]]\n[1,2,3,4,5]\n
// @lcpr case=end

 */

