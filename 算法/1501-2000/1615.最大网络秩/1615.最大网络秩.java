/*
 * @lc app=leetcode.cn id=1615 lang=java
 * @lcpr version=
 *
 * [1615] 最大网络秩
 * 
 * 83/83 cases passed (30 ms)
 * Your runtime beats 6.36 % of java submissions
 * Your memory usage beats 14.54 % of java submissions (44.2 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for(var i : roads) {
            graph.computeIfAbsent(i[0], k -> new HashSet<>()).add(i[1]);
            graph.computeIfAbsent(i[1], k -> new HashSet<>()).add(i[0]);
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if (j == i) continue;
                var s1 = graph.get(i);
                var s2 = graph.get(j);
                if (s1 == null || s2 == null) continue;

                int rank = s1.size() + s2.size();
                if (s1.contains(j) || s2.contains(i))
                    rank--;
                ans = Math.max(ans, rank);
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 4\n[[0,1],[0,3],[1,2],[1,3]]\n
// @lcpr case=end

// @lcpr case=start
// 5\n[[0,1],[0,3],[1,2],[1,3],[2,3],[2,4]]\n
// @lcpr case=end

// @lcpr case=start
// 8\n[[0,1],[1,2],[2,3],[2,4],[5,6],[5,7]]\n
// 2\n[]\n
// 3\n[[0,1]]\n
// 3\n[[0,1],[1,2]]\n
// @lcpr case=end

 */

