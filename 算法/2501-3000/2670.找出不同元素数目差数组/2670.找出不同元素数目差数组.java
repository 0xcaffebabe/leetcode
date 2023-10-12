/*
 * @lc app=leetcode.cn id=2670 lang=java
 * @lcpr version=
 *
 * [2670] 找出不同元素数目差数组
 * 
 * 4512/4512 cases passed (3 ms)
 * Your runtime beats 99.38 % of java submissions
 * Your memory usage beats 28.39 % of java submissions (43.5 MB)
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] l = new int[n];
        int[] r = new int[n];
        l[0] = 1;
        
        boolean[] lm = new boolean[51];
        boolean[] rm = new boolean[51];
        lm[nums[0]] = true;

        for(int i = 1; i < n; i++) {
            l[i] = l[i - 1];
            if (!lm[nums[i]]) l[i]++;
            lm[nums[i]] = true;
        }
        for(int i = n - 2; i >= 0; i--) {
            r[i] = r[i + 1];
            if (!rm[nums[i + 1]]) r[i]++;
            rm[nums[i + 1]] = true;
        }
        // System.out.println(Arrays.toString(l));
        // System.out.println(Arrays.toString(r));
        int[] ans = new int[n];
        for(int i = 0; i < n; i++)
            ans[i] = l[i] - r[i];
        return ans;

    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4,5]\n
// @lcpr case=end

// @lcpr case=start
// [3,2,3,4,2]\n
// @lcpr case=end

 */

