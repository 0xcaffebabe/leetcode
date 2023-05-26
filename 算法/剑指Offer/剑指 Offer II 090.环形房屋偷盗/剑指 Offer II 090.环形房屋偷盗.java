/*
 * @lc app=leetcode.cn id=剑指 Offer II 090 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 090] 环形房屋偷盗
 * 
 * 74/74 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 79.06 % of java submissions (38.8 MB)
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        // dp[i] 代表 从 0-i间房 能偷到的最大价值
        // 从第一间开始偷
        int[] dp0 = new int[nums.length];
        // 从第二间开始偷
        int[] dp1 = new int[nums.length];
        if (nums.length == 1) return nums[0];
        else if (nums.length == 2) return Math.max(nums[0], nums[1]);

        dp0[0] = nums[0];
        dp0[1] = Math.max(nums[0], nums[1]);

        // 第一间不偷 最大价值为0
        dp1[0] = 0;
        dp1[1] = nums[1];

        // 从第一间开始偷 最后一间就不能偷了
        for(int i = 2; i < nums.length - 1; i++) {
            // 到当前房间能偷到的价值 要不就是上上个房间加上当前房间的价值
            // 要不就是单纯的上个房间的价值（因为偷过上个，当前这个就不能偷了）
            dp0[i] = Math.max(dp0[i - 2] + nums[i], dp0[i - 1]);
        }

        // 这个刚好跟上面相反
        for(int i = 2; i < nums.length; i++) {
            dp1[i] = Math.max(dp1[i - 2] + nums[i], dp1[i - 1]);
        }

        // System.out.println(Arrays.toString(dp0));
        // System.out.println(Arrays.toString(dp1));
        int max1 = 0;
        int max2 = 0;
        for(var i : dp0) max1 = Math.max(max1, i);
        for(var i : dp1) max2 = Math.max(max2, i);
        
        return Math.max(max1, max2);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,3,2]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,1]\n
// @lcpr case=end

// @lcpr case=start
// [0]\n
// @lcpr case=end

 */

