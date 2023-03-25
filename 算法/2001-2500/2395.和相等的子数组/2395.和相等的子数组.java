import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=2395 lang=java
 *
 * [2395] 和相等的子数组
 * 
 * 42/42 cases passed (1 ms)
 * Your runtime beats 80.22 % of java submissions
 * Your memory usage beats 30.4 % of java submissions (39.6 MB)
 */

// @lc code=start
class Solution {
    public boolean findSubarrays(int[] nums) {
        int[] sums = new int[nums.length - 1];
        for(int i = 0; i < nums.length - 1; i++) 
            sums[i] = nums[i] + nums[i+1];
        Set<Integer> set = new HashSet<>();
        
        for(var i : sums) {
            if (set.contains(i)) return true;
            set.add(i);
        }
        return false;
    }
}
// @lc code=end

