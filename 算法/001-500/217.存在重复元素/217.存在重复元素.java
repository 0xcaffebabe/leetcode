/*
 * @lc app=leetcode.cn id=217 lang=java
 *
 * [217] 存在重复元素
 * 
 * 70/70 cases passed (12 ms)
 * Your runtime beats 53.39 % of java submissions
 * Your memory usage beats 61.8 % of java submissions (53.3 MB)
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length <= 1) return false;
        
        Set<Integer> set = new HashSet<>(nums.length);
        for(int i: nums) set.add(i);
        return set.size() != nums.length;
    }
}
// @lc code=end

