import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=209 lang=java
 *
 * [209] 长度最小的子数组
 * 
 * 20/20 cases passed (1 ms)
 * Your runtime beats 99.99 % of java submissions
 * Your memory usage beats 5.02 % of java submissions (49.7 MB)
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int cur = 0;
        List<Integer> ans = new ArrayList<>();
        while(right < nums.length) {
            cur += nums[right++];
            while(cur >= target && left < nums.length) {
                cur -= nums[left++];
                ans.add(right - left + 1);
            }
        }
        if (ans.size() == 0) return 0;
        int min = Integer.MAX_VALUE;
        for(var i : ans) if (i < min) min = i;
        return min;
    }
}
// @lc code=end

