/*
 * @lc app=leetcode.cn id=1539 lang=java
 *
 * [1539] 第 k 个缺失的正整数
 * 
 * 84/84 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 50.61 % of java submissions (40.9 MB)
 */

// @lc code=start
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int p = 0;
        int i = 1;
        int max = arr[arr.length - 1];
        while(true) {
            if (i > max || i != arr[p]) k--;
            else if (i == arr[p]) p++;
            if (k == 0) return i;
            i++;
        }
    }
}
// @lc code=end

