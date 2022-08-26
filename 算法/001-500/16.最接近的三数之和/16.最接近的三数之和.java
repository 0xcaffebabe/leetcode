import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=16 lang=java
 *
 * [16] 最接近的三数之和
 * 
 * 161/161 cases passed (73 ms)
 * Your runtime beats 39.2 % of java submissions
 * Your memory usage beats 5.08 % of java submissions (42.1 MB)
 */

// @lc code=start
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Integer ans = 10000000;
        Arrays.sort(nums);
        int n = nums.length;
        // 三指针
        for(int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = n - 1;
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) return target;
                if (Math.abs(sum - target) < Math.abs(ans - target)) {
                    ans = sum;
                }
                
                if (sum > target) {
                    // 如果和大于 target，移动 c 对应的指针
                    int right0 = right - 1;
                    // 移动到下一个不相等的元素
                    while (left < right0 && nums[right0] == nums[right]) right0--;
                    right = right0;
                } else {
                    // 如果和小于 target，移动 b 对应的指针
                    int left0 = left + 1;
                    // 移动到下一个不相等的元素
                    while (left0 < right && nums[left0] == nums[left]) left0++;
                    left = left0;
                }
            }
        }
        return ans;
    }
}
// @lc code=end

