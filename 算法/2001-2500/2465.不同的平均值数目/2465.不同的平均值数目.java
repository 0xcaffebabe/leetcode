/*
 * @lc app=leetcode.cn id=2465 lang=java
 * @lcpr version=
 *
 * [2465] 不同的平均值数目
 * 
 * 36/36 cases passed (1 ms)
 * Your runtime beats 94.89 % of java submissions
 * Your memory usage beats 52.85 % of java submissions (38.9 MB)
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int distinctAverages(int[] nums) {
        boolean[] m = new boolean[201];
        Arrays.sort(nums);
        int p = 0;
        int q = nums.length - 1;
        while(p < q) {
            m[nums[p] + nums[q]] = true;
            p++;
            q--;
        }
        int ans = 0;
        for(var i : m) if (i) ans++;
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,1,4,0,3,5]\n
// [4,4]\n
// [4,4,4,4]\n
// @lcpr case=end

// @lcpr case=start
// [1,100]\n
// @lcpr case=end

 */

