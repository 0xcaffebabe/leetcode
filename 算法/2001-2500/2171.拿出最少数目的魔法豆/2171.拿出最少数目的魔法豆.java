/*
 * @lc app=leetcode.cn id=2171 lang=java
 * @lcpr version=
 *
 * [2171] 拿出最少数目的魔法豆
 * 
 * 64/64 cases passed (38 ms)
 * Your runtime beats 54.22 % of java submissions
 * Your memory usage beats 9.64 % of java submissions (62.8 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public long minimumRemoval(int[] beans) {
        Arrays.sort(beans);
        long s = 0;
        long left = 0;
        int n = beans.length;
        for(var i : beans) s += i;
        for(int i = 0; i < n; i++)
            left = Math.max(left, beans[i] * 1L * (n - i));
        return s - left;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,1,6,5]\n
// @lcpr case=end

// @lcpr case=start
// [2,10,3,2]\n
// @lcpr case=end

 */

