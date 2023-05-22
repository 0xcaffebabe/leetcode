/*
 * @lc app=leetcode.cn id=剑指 Offer II 004 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 004] 只出现一次的数字
 * 
 * 14/14 cases passed (5 ms)
 * Your runtime beats 35.01 % of java submissions
 * Your memory usage beats 5.65 % of java submissions (43 MB) 
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



/*
// @lcpr case=start
// [2,2,3,2]\n
// @lcpr case=end

// @lcpr case=start
// [0,1,0,1,0,1,100]\n
// @lcpr case=end

 */

