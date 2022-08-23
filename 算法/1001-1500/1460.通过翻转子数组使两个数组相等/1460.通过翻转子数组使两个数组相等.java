import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1460 lang=java
 *
 * [1460] 通过翻转子数组使两个数组相等
 * 
 * 106/106 cases passed (3 ms)
 * Your runtime beats 77.12 % of java submissions
 * Your memory usage beats 96.93 % of java submissions (40.8 MB)
 */

// @lc code=start
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.equals(target, arr);
    }
}
// @lc code=end

