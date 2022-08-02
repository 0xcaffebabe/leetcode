/*
 * @lc app=leetcode.cn id=1588 lang=java
 *
 * [1588] 所有奇数长度子数组的和
 * 
 * 96/96 cases passed (2 ms)
 * Your runtime beats 41.71 % of java submissions
 * Your memory usage beats 9.53 % of java submissions (39.5 MB)
 */

// @lc code=start
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int size = 1; i + size <= arr.length; size += 2) {
                for(int k = i; k < i + size; k++) sum += arr[k];
            }
        }
        return sum;
    }
}
// @lc code=end

