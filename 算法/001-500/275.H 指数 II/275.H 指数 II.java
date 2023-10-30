/*
 * @lc app=leetcode.cn id=275 lang=java
 * @lcpr version=
 *
 * [275] H 指数 II
 * 
 * 83/83 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 33.85 % of java submissions (49.5 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int hIndex(int[] citations) {
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
// [0,1,3,5,6]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,100]\n
// [1,2,3,4,5,6,7,8,9]\n
// [0, 1, 5, 6]\n
// [0, 0, 0, 0]\n
// [0]\n
// [1]\n
// [0,1]\n
// @lcpr case=end

 */

