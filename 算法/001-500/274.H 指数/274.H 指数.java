/*
 * @lc app=leetcode.cn id=274 lang=java
 * @lcpr version=
 *
 * [274] H 指数
 * 
 * 81/81 cases passed (1 ms)
 * Your runtime beats 87.52 % of java submissions
 * Your memory usage beats 66.05 % of java submissions (39.2 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int ans = 0;
        int l = 0;
        int r = citations.length - 1;
        int n = citations.length;
        while(l <= r) {
            int mid = (l + r) / 2;
            if (citations[mid] >= n - mid ) {
                r = mid - 1;
                ans = Math.max(ans, n - mid);
            }
            else if (citations[mid] < n - mid) l = mid + 1;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,0,6,1,5]\n
// @lcpr case=end

// @lcpr case=start
// [1,3,1]\n
// @lcpr case=end

 */

