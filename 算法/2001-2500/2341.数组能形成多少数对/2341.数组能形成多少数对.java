import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=2341 lang=java
 *
 * [2341] 数组能形成多少数对
 * 
 * 128/128 cases passed (1 ms)
 * Your runtime beats 68.09 % of java submissions
 * Your memory usage beats 84.06 % of java submissions (39.9 MB)
 */

// @lc code=start
class Solution {
    public int[] numberOfPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(var i: nums) map.put(i, map.getOrDefault(i, 0) + 1);
        int used = 0;
        int remained = 0;
        for(var enr: map.entrySet()) {
            used += enr.getValue() / 2;
            remained += enr.getValue() % 2;
        }
        return new int[]{used, remained};
    }
}
// @lc code=end

