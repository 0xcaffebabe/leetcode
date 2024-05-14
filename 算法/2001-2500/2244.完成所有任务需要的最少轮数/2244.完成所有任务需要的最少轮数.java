/*
 * @lc app=leetcode.cn id=2244 lang=java
 * @lcpr version=
 *
 * [2244] 完成所有任务需要的最少轮数
 * 
 * 79/79 cases passed (31 ms)
 * Your runtime beats 50 % of java submissions
 * Your memory usage beats 56.25 % of java submissions (56.4 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> map = new HashMap<>();
        for(var i: tasks) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int ans = 0;
        for(var enr: map.entrySet()) {
            var v = enr.getValue();
            if (v == 1) return -1;
            ans += (v + 2) / 3;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,2,3,3,2,4,4,4,4,4]\n
// [1,1]\n
// [1]\n
// @lcpr case=end

// @lcpr case=start
// [2,3,3]\n
// @lcpr case=end

 */

