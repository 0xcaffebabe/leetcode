import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1608 lang=java
 *
 * [1608] 特殊数组的特征值
 * 
 * 98/98 cases passed (1 ms)
 * Your runtime beats 80 % of java submissions
 * Your memory usage beats 93.03 % of java submissions (38.9 MB)
 */

// @lc code=start
class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;
        for(int i = 0; i <= n; i++) {
            int ans = 0;
            for(int j = 0; j < n; j++){
                if (nums[j] >= i) ans++;
            }
            if (ans == i) return ans;
        }
        return -1;
    }
}
// @lc code=end

