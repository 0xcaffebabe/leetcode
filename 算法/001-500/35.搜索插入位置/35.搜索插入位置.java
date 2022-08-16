/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 * 
 * 64/64 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 66.18 % of java submissions (40.9 MB)
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int l,h,m;
        l=0;
        h=nums.length-1;
        while (true){
            m = (l+h)/2;
            if (l>h){
                break;
            }
            
            if (nums[m] == target){
                return m;
            }
            
            if (nums[m]<target){
                l=m+1;
            }else{
                h=m-1;
            }
            
        }
        
        return l;
    }
}
// @lc code=end

