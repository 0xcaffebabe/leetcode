/*
 * @lc app=leetcode.cn id=922 lang=java
 *
 * [922] 按奇偶排序数组 II
 * 
 * 61/61 cases passed (3 ms)
 * Your runtime beats 19.85 % of java submissions
 * Your memory usage beats 86.5 % of java submissions (42.9 MB)
 */

// @lc code=start
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] ans = new int[nums.length];
        int p = 0;
        int q = 0;
        for(int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                while(nums[p] % 2 != 0) p++;
                ans[i] = nums[p++];
            }else {
                while(nums[q] % 2 == 0) q++;
                ans[i] = nums[q++];
            }
        }
        return ans;
    }
}
// @lc code=end

