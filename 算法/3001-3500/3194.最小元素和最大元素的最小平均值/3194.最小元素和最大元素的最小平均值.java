/*
 * @lc app=leetcode.cn id=3194 lang=java
 * @lcpr version=
 *
 * [3194] 最小元素和最大元素的最小平均值
 * 
 * 720/720 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 64.48 % of java submissions (42.7 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int p = 0;
        int q = nums.length - 1;
        double ans = Double.MAX_VALUE;
        while(p < q) {
            // System.out.println(p + "|" + q);
            ans = Math.min(ans, (nums[p] + nums[q]) / 2d);
            p++;
            q--;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [7,8,3,4,15,13,4,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,9,8,3,10,5]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,7,8,9]\n
// @lcpr case=end

 */

