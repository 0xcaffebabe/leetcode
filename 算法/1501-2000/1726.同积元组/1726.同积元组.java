/*
 * @lc app=leetcode.cn id=1726 lang=java
 * @lcpr version=
 *
 * [1726] 同积元组
 * 
 * 37/37 cases passed (218 ms)
 * Your runtime beats 41.33 % of java submissions
 * Your memory usage beats 33.33 % of java submissions (66.8 MB)
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                var f = nums[i]*nums[j];
                var val = map.computeIfAbsent(f, k -> 0);
                map.put(f, val + 1);
            }
        }
        int ans = 0;
        for(int v: map.values())
            if (v > 1) 
                ans += (v * (v - 1)) / 2;
        return ans * 8;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,3,4,6]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,4,5,10]\n
// @lcpr case=end

 */

