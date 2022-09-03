/*
 * @lc app=leetcode.cn id=1394 lang=java
 *
 * [1394] 找出数组中的幸运数
 * 
 * 101/101 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 97.57 % of java submissions (40.6 MB)
 */

// @lc code=start
class Solution {
    public int findLucky(int[] arr) {
        int[] map = new int[501];
        for(var i : arr) map[i]++;
        for(int i = 500; i >= 1; i--) if (map[i] == i) return i;
        return -1;
    }
}
// @lc code=end

