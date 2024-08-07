/*
 * @lc app=leetcode.cn id=2870 lang=java
 * @lcpr version=
 *
 * [2870] 使数组为空的最少操作次数
 * 
 * 748/748 cases passed (21 ms)
 * Your runtime beats 35.29 % of java submissions
 * Your memory usage beats 46.08 % of java submissions (61.4 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(var i: nums) 
            map.put(i, map.getOrDefault(i, 0) + 1);
        
        int ans = 0;
        for(var enr: map.entrySet()) {
            int v = enr.getValue();
            if (v == 1) return -1;
            ans += v / 3;
            if (v % 3 != 0) ans++;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,3,3,2,2,4,2,3,4]\n
// [1,1]\n
// [1,1,1]\n
// [1,1,2]\n
// @lcpr case=end

// @lcpr case=start
// [2,1,2,2,3,3]\n
// @lcpr case=end

 */

