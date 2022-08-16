/*
 * @lc app=leetcode.cn id=137 lang=java
 *
 * [137] 只出现一次的数字 II
 * 
 * 14/14 cases passed (5 ms)
 * Your runtime beats 33.06 % of java submissions
 * Your memory usage beats 83.25 % of java submissions (40.8 MB)
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(var i : nums) map.put(i, map.getOrDefault(i, 0) + 1);

        for(var enr: map.entrySet()) if (enr.getValue() == 1) return enr.getKey();
        return -1;
    }
}
// @lc code=end

