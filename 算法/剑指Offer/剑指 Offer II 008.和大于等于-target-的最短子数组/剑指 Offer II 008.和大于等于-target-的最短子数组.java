/*
 * @lc app=leetcode.cn id=剑指 Offer II 008 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 008] 和大于等于 target 的最短子数组
 * 
 * 19/19 cases passed (2 ms)
 * Your runtime beats 38.72 % of java submissions
 * Your memory usage beats 14.5 % of java submissions (43 MB)
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int cur = 0;
        List<Integer> ans = new ArrayList<>();
        while(right < nums.length) {
            cur += nums[right++];
            while(cur >= target && left < nums.length) {
                cur -= nums[left++];
                ans.add(right - left + 1);
            }
        }
        if (ans.size() == 0) return 0;
        int min = Integer.MAX_VALUE;
        for(var i : ans) if (i < min) min = i;
        return min;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 7\n[2,3,1,2,4,3]\n
// @lcpr case=end

// @lcpr case=start
// 4\n[1,4,4]\n
// @lcpr case=end

// @lcpr case=start
// 11\n[1,1,1,1,1,1,1,1]\n
// @lcpr case=end

 */

