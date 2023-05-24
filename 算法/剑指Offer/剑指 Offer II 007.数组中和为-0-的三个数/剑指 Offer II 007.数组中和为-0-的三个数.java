/*
 * @lc app=leetcode.cn id=剑指 Offer II 007 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 007] 数组中和为 0 的三个数
 * 
 * 318/318 cases passed (22 ms)
 * Your runtime beats 62.39 % of java submissions
 * Your memory usage beats 16.56 % of java submissions (46.2 MB)
 */

// @lc code=start
class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        // 三指针
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) return ans;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = n - 1;
            while(left < right) {
                // 三数之和等于结果
                if (nums[i] + nums[left] + nums[right] == 0) {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // 邻边数字相等，边界移动，去除重复结果
                    while(left < right && nums[left] == nums[left + 1]) left++;
                    while(left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                }else if(nums[i] + nums[left] + nums[right] > 0) right--;
                else left++;
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [-1,0,1,2,-1,-4]\n
// @lcpr case=end

// @lcpr case=start
// [0,1,1]\n
// @lcpr case=end

// @lcpr case=start
// [0,0,0]\n
// @lcpr case=end

 */

