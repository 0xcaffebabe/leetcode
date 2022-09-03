/*
 * @lc app=leetcode.cn id=1470 lang=java
 *
 * [1470] 重新排列数组
 * 
 * 53/53 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 61.45 % of java submissions (41.5 MB)
 */

// @lc code=start
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int p = 0,q = n;
        int[] ret = new int[nums.length];
        for(int i = 0;i<ret.length;i+=2){
            ret[i] = nums[p++];
            ret[i + 1] = nums[q++];
        }
        return ret;
    }
}
// @lc code=end

