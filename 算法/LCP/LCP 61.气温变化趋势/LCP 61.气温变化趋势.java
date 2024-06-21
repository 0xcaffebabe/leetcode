/*
 * @lc app=leetcode.cn id=LCP 61 lang=java
 * @lcpr version=
 *
 * [LCP 61] 气温变化趋势
 * 
 * 62/62 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 45.2 % of java submissions (43.2 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int temperatureTrend(int[] a, int[] b) {
        int ans = 0;
        int cnt = 0;
        for(int i = 1; i < a.length; i++) {
            if (a[i] - a[i - 1] < 0 && b[i] - b[i - 1] < 0)
                cnt++;
            else if (a[i] - a[i - 1] == 0 && b[i] - b[i - 1] == 0)
                cnt++;
            else if (a[i] - a[i - 1] > 0 && b[i] - b[i - 1] > 0)
                cnt++;
            else 
                cnt = 0;
            ans = Math.max(cnt, ans);
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [21,18,18,18]\n[34,32,16,16,17]\n
// [5,10,16,-6,15,11]\n[16,22,23,23,25,3,-16]\n
// @lcpr case=end

// @lcpr case=start
// @lcpr case=end

 */

