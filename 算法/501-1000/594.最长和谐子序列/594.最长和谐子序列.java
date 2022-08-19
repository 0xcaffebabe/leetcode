import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=594 lang=java
 *
 * [594] 最长和谐子序列
 * 
 * 206/206 cases passed (17 ms)
 * Your runtime beats 38.78 % of java submissions
 * Your memory usage beats 74.92 % of java submissions (42 MB)
 */

// @lc code=start
class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(var i : nums) map.put(i, map.getOrDefault(i, 0) +1);
        int ans = 0;
        // 这个最长子序列肯定由两个数字组成
        for(var i : nums) {
            if (map.containsKey(i + 1)) {
                ans = Math.max(ans, map.get(i) + map.get(i +1));
            }
        }
        return ans;
    }
}
// @lc code=end

