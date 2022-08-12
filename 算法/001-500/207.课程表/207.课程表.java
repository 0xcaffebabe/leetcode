/*
 * @lc app=leetcode.cn id=207 lang=java
 *
 * [207] 课程表
 * 
 * 52/52 cases passed (3 ms)
 * Your runtime beats 93.48 % of java submissions
 * Your memory usage beats 89.63 % of java submissions (41.3 MB)
 */

// @lc code=start
class Solution {
    List<List<Integer>> list;
    int[] vis;
    boolean ans = true;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        list = new ArrayList<>(numCourses);
        vis = new int[numCourses];
        for(int i = 0; i < numCourses; i++) list.add(new ArrayList<>());
        for(var i : prerequisites) list.get(i[1]).add(i[0]);

        for(int i = 0; i < numCourses; i++) {
            if (vis[i] == 0) dfs(i);
            if (!ans) return false;
        }
        return ans;
    }

    void dfs(int v) {
        // 代表节点v搜索中
        vis[v] = 1;
        // 挨个对依赖本节点的节点进行搜索
        for(var i : list.get(v)) {
            // 当前节点还没搜索 进入搜索
            if (vis[i] == 0) {
                dfs(i);
                if (!ans) return;
            }else if (vis[i] == 1) {
                // 当前节点搜索中，代表出现环路
                ans = false;
                return;
            }
        }

        // 节点v搜索完成
        vis[v] = 2;
    }
}
// @lc code=end

