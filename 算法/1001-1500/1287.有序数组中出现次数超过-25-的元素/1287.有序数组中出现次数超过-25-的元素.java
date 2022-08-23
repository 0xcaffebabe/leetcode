/*
 * @lc app=leetcode.cn id=1287 lang=java
 *
 * [1287] 有序数组中出现次数超过25%的元素
 * 
 * 25/25 cases passed (1 ms)
 * Your runtime beats 45.96 % of java submissions
 * Your memory usage beats 41.73 % of java submissions (41.8 MB)
 */

// @lc code=start
class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length / 4;
        System.out.println(n);
        for(int i = 0; i < arr.length; i++) {
            if (i + n >= arr.length) break;
            if (arr[i] == arr[i + n]) return arr[i];
        }
        return -1;
    }
}
// @lc code=end

