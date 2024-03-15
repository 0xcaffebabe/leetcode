/*
 * @lc app=leetcode.cn id=3034 lang=java
 * @lcpr version=
 *
 * [3034] 匹配模式数组的子数组数目 I
 * 
 * 789/789 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 96.32 % of java submissions (43.2 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int ans = 0;
        int m = pattern.length;
        for(int i = 0; i < nums.length - m; i++) {
            int success = 0;
            for(int j = 0; j < m; j++) {
                if (pattern[j] == 1 && nums[i+j] < nums[i+j+1]) success++;
                if (pattern[j] == -1 && nums[i+j] > nums[i+j+1]) success++;
                if (pattern[j] == 0 && nums[i+j] == nums[i+j+1]) success++;
            }
            // System.out.println(i + "," + success);
            if (success == m) ans++;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4,5,6]\n[1,1]\n
// [6,5,4,3,2,1]\n[-1,-1]\n
// [1,1]\n[0]\n
// @lcpr case=end

// @lcpr case=start
// [1,4,4,1,3,5,5,3]\n[1,0,-1]\n
// @lcpr case=end

 */

