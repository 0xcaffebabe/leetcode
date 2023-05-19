/*
 * @lc app=leetcode.cn id=2090 lang=java
 * @lcpr version=21907
 *
 * [2090] 半径为 k 的子数组平均值
 * 
 * 39/39 cases passed (4 ms)
 * Your runtime beats 96.77 % of java submissions
 * Your memory usage beats 70.97 % of java submissions (59.3 MB)
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int[] getAverages(int[] nums, int k) {
        if (k == 0) return nums;
        int[] ans = new int[nums.length];
        Arrays.fill(ans, -1);
        if (k > (nums.length / 2 + 1)) return ans;
        if (2 * k >= nums.length) return ans;

        long sum = 0;
        for(int i = 0; i <= 2 * k; i++) sum += nums[i];
        ans[k] = (int) (sum / (2 * k + 1));
        for(int i = k + 1; i < nums.length - k; i++) {
            sum += nums[i + k];
            sum -= nums[i - k - 1];
            // System.out.println(nums[i - k] + "|" + nums[i + k]);
            ans[i] = (int) (sum / (2 * k + 1));
        }

        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [7,4,3,9,1,8,5,2,6]\n3\n
// @lcpr case=end

// @lcpr case=start
// [7,4,3,9,1,8,5,2,6,6,5,4,3,23,5,54,543,34,23]\n3\n
// @lcpr case=end

// @lcpr case=start
// [7,4,3,9,1,8,5,2,6,6,5,4,3,23,5,54,543,34,23]\n8\n
// @lcpr case=end

// @lcpr case=start
// [7,4,3,9,1,8,5,2,6,6,5,4,3,23,5,54,543,34,23]\n8\n
// @lcpr case=end

// @lcpr case=start
// [100000]\n0\n
// @lcpr case=end

// @lcpr case=start
// [8]\n100000\n
// @lcpr case=end

// @lcpr case=start
// [2,1,2]\n1\n
// @lcpr case=end

// @lcpr case=start
// [2,1]\n1\n
// @lcpr case=end

// @lcpr case=start
// [2,1,2,3,4]\n2\n
// @lcpr case=end

 */

