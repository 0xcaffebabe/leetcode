/*
 * @lc app=leetcode.cn id=2367 lang=java
 *
 * [2367] 算术三元组的数目
 * 
 * 104/104 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 100 % of java submissions (39.5 MB)
 */

// @lc code=start
class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> set = new HashSet<>();
        for(var i : nums) set.add(i);
        int ans = 0;
        for(var i : nums) if (set.contains(i - diff) && set.contains(i + diff)) ans++;
        return ans;
    }
}
// @lc code=end

