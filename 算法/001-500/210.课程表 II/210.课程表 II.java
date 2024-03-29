/*
 * @lc app=leetcode.cn id=210 lang=java
 * @lcpr version=
 *
 * [210] 课程表 II
 * 
 * 45/45 cases passed (5 ms)
 * Your runtime beats 55.67 % of java submissions
 * Your memory usage beats 89.63 % of java submissions (44.3 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    List<List<Integer>> g = new ArrayList<>();
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        for(int i = 0; i < numCourses; i++) g.add(new ArrayList<>());
        int[] indegress = new int[numCourses];
        for(var p : prerequisites) {
            g.get(p[1]).add(p[0]);
            indegress[p[0]]++;
        }

        // 入度为0的节点
        LinkedList<Integer> queue = new LinkedList<>();
        for(int i = 0; i < numCourses; i++) 
            if (indegress[i] == 0) queue.offer(i);
        // System.out.println(queue);
        int[] ans = new int[numCourses];
        int i = 0;
        while(!queue.isEmpty()) {
            var v = queue.poll();
            var neighbor = g.get(v);
            for(var nei : neighbor) {
                indegress[nei]--;
                if (indegress[nei] == 0) queue.offer(nei);
            }
            ans[i++] = v;
        }
        if (i != numCourses) return new int[]{};
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 2\n[[1,0]]\n
// @lcpr case=end

// @lcpr case=start
// 4\n[[1,0],[2,0],[3,1],[3,2]]\n
// 4\n[[1,0],[2,0],[3,1],[3,2],[2,3]]\n
// @lcpr case=end

// @lcpr case=start
// 1\n[]\n
// 4\n[[0,1]]\n
// @lcpr case=end

 */

