/*
 * @lc app=leetcode.cn id=1806 lang=java
 * @lcpr version=
 *
 * [1806] 还原排列的最少操作步数
 * 
 * 66/66 cases passed (20 ms)
 * Your runtime beats 30.61 % of java submissions
 * Your memory usage beats 30.61 % of java submissions (42 MB)
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int reinitializePermutation(int n) {
        int[] perm = new int[n];
        for(int i = 0; i < perm.length; i++) perm[i] = i;
        int[] target = new int[n];
        System.arraycopy(perm, 0, target, 0, n);
        int ans = 0;
        while(true) {
            ans++;
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                if (i % 2 == 0) arr[i] = perm[i / 2];
                else arr[i] = perm[n / 2 + (i - 1) / 2];
            }
            perm = arr;
            // System.out.println(Arrays.toString(perm));
            if (Arrays.equals(target, perm)) return ans;
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// 2\n
// @lcpr case=end

// @lcpr case=start
// 4\n
// @lcpr case=end

// @lcpr case=start
// 6\n
// 1000\n
// 500\n
// @lcpr case=end

 */

