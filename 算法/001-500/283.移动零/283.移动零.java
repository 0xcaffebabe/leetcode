/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 * 
 * 74/74 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 91.41 % of java submissions (42.5 MB)
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int numOf0 = 0;
        int passOf0 =0;
        for(int i=0;i<nums.length;i++){
            if (nums[i] == 0) numOf0++;
        }
        for(int i=0;i<nums.length;i++){
            if (nums[i]==0){
                passOf0++;
            }else{
                // 如果当前数不为0并且已经过的0个数不为0
                if (passOf0 != 0){
                    // 当前数向左移动passOf0
                    nums[i-passOf0] = nums[i];
                }
            }
        }
        for(int i=nums.length-1;i>=nums.length-numOf0;i--){
            nums[i]=0;
        }
    }
}
// @lc code=end

