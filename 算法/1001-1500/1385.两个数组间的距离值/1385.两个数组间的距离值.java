/*
 * @lc app=leetcode.cn id=1385 lang=java
 *
 * [1385] 两个数组间的距离值
 * 
 * 103/103 cases passed (17 ms)
 * Your runtime beats 11.72 % of java submissions
 * Your memory usage beats 57.7 % of java submissions (41 MB)
 */

// @lc code=start
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans = 0;
        for(var i : arr1) {
            boolean matched = true;
            for(var j : arr2) {
                matched &= Math.abs(i-j) > d;
            }
            if (matched) ans++;
        }
        return ans;
    }
}
// @lc code=end

