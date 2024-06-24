/*
 * @lc app=leetcode.cn id=982 lang=java
 * @lcpr version=
 *
 * [982] 按位与为零的三元组
 * 
 * 25/25 cases passed (213 ms)
 * Your runtime beats 8.89 % of java submissions
 * Your memory usage beats 5.55 % of java submissions (47.8 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countTriplets(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(32);
        for(var i : nums) {
            for(var j: nums) {
                int and = i & j;
                map.put(and, map.getOrDefault(and, 0) + 1);
            }
        }
        int ans = 0;
        for(var enr: map.entrySet()) {
            int j = enr.getKey();
            for(int i: nums) {
                if ((i & j) == 0) ans += enr.getValue();
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,1,3]\n
// @lcpr case=end

// @lcpr case=start
// [0,0,0]\n
// [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]\n
// @lcpr case=end

 */

