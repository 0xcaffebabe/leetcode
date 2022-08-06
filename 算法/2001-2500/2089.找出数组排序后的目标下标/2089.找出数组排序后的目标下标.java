/*
 * @lc app=leetcode.cn id=2089 lang=java
 *
 * [2089] 找出数组排序后的目标下标
 * 
 * 216/216 cases passed (2 ms)
 * Your runtime beats 71.09 % of java submissions
 * Your memory usage beats 77.14 % of java submissions (41.4 MB)
 */

// @lc code=start
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>(32);
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == target)  ans.add(i);
        }
        return ans;
    }
}
// @lc code=end

