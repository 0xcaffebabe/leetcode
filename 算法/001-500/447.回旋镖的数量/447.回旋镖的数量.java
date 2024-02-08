/*
 * @lc app=leetcode.cn id=447 lang=java
 * @lcpr version=
 *
 * [447] 回旋镖的数量
 * 
 * 32/32 cases passed (117 ms)
 * Your runtime beats 90.42 % of java submissions
 * Your memory usage beats 9.96 % of java submissions (43.8 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numberOfBoomerangs(int[][] points) {
        Map<Double, Integer> m = new HashMap<>();
        int ans = 0;
        for(var i : points) {
            for(var j : points) {
                if (i == j) continue;
                double dis = Math.sqrt(Math.pow(i[0] - j[0], 2) + Math.pow(i[1] - j[1], 2));
                m.put(dis, m.getOrDefault(dis, 0) + 1);
            }
            for(var enr: m.entrySet()) {
                ans += enr.getValue() * (enr.getValue() - 1);
            }
            m.clear();
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[0,0],[1,0],[2,0]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,1],[2,2],[3,3]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,1]]\n
// [[1,1],[1,0]]\n
// @lcpr case=end

 */

