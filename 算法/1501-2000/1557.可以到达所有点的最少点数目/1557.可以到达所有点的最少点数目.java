/*
 * @lc app=leetcode.cn id=1557 lang=java
 * @lcpr version=
 *
 * [1557] 可以到达所有点的最少点数目
 * 
 * 66/66 cases passed (31 ms)
 * Your runtime beats 8.57 % of java submissions
 * Your memory usage beats 44.57 % of java submissions (81.7 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        Set<Integer> out = new HashSet<>(); // 有被人指

        Set<Integer> ans = new HashSet<>();
        for(var i : edges) out.add(i.get(1));
        for(var i : edges) 
            if (!out.contains(i.get(0))) ans.add(i.get(0));
        return new ArrayList<>(ans);
    }
}
// @lc code=end



/*
// @lcpr case=start
// 6\n[[0,1],[0,2],[2,5],[3,4],[4,2]]\n
// @lcpr case=end

// @lcpr case=start
// 5\n[[0,1],[2,1],[3,1],[1,4],[2,4]]\n
// @lcpr case=end

 */

