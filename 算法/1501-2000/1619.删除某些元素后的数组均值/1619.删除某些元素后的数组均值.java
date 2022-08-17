/*
 * @lc app=leetcode.cn id=1619 lang=java
 *
 * [1619] 删除某些元素后的数组均值
 * 
 * 50/50 cases passed (2 ms)
 * Your runtime beats 99.71 % of java submissions
 * Your memory usage beats 70.4 % of java submissions (41 MB)
 */

// @lc code=start
class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int start = n / 20;
        int end = n - n / 20 - 1;
        long sum = 0;
        for(int i = start; i <= end; i++) sum += arr[i];
        
        return (double)sum / (n - n / 10);
    }
}
// @lc code=end

