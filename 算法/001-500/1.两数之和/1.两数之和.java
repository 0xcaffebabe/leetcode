/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 * 
 * 57/57 cases passed (3 ms)
 * Your runtime beats 55.62 % of java submissions
 * Your memory usage beats 7.3 % of java submissions (42.2 MB)
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            map.put(target-nums[i],i);
        }
        for (int i=0;i<nums.length;i++){
            Integer i1 = map.get(nums[i]);
            if (i1 == null || i == i1) {
                continue;
            }
            if (nums[i] + nums[i1] == target){
                return new int[]{i,i1};
            }
        }
        return result;
    }
}
// @lc code=end

