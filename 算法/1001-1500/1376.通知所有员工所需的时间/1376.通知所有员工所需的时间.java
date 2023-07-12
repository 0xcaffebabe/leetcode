/*
 * @lc app=leetcode.cn id=1376 lang=java
 * @lcpr version=21909
 *
 * [1376] 通知所有员工所需的时间
 * 
 * 39/39 cases passed (94 ms)
 * Your runtime beats 30.82 % of java submissions
 * Your memory usage beats 45.98 % of java submissions (59 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    Map<Integer, List<Integer>> employeeMap = new HashMap<>();
    int[] costMap;
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        if (manager.length == 1) return 0;
        this.costMap = informTime;
        for(int i = 0; i < manager.length; i++) {
            if (manager[i] == -1) continue;
            employeeMap.computeIfAbsent(manager[i], k -> new ArrayList<>());
            employeeMap.get(manager[i]).add(i);
        }
        // System.out.println(root);
        // System.out.println(employeeMap);
        return dfs(headID);
    }

    int dfs(int node) {
        var list = employeeMap.get(node);
        if (list == null) return 0;
        int max = 0;
        for(var i : list) {
            max = Math.max(max, dfs(i));
        }
        return max + costMap[node];
    }
}
// @lc code=end



/*
// @lcpr case=start
// 1\n0\n[-1]\n[0]\n
// @lcpr case=end

// @lcpr case=start
// 6\n2\n[2,2,-1,2,2,2]\n[0,0,1,0,0,0]\n
// 6\n0\n[-1,0,1,2,3,4]\n[1,2,1,3,4,0]\n
// @lcpr case=end

 */

