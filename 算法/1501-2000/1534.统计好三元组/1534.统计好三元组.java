/*
 * @lc app=leetcode.cn id=1534 lang=java
 *
 * [1534] 统计好三元组
 * 
 * 92/92 cases passed (14 ms)
 * Your runtime beats 39.53 % of java submissions
 * Your memory usage beats 82.6 % of java submissions (39 MB)
 */

// @lc code=start
class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n = arr.length;
        int ans = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < n; j++) {
                for(int k = j + 1; k < n; k++) {
                    if (Math.abs(arr[i] - arr[j]) <= a
                    && Math.abs(arr[k] - arr[j]) <= b
                    && Math.abs(arr[i]- arr[k]) <= c) ans++;
                }
            }
        }
        return ans;
    }
}
// @lc code=end

