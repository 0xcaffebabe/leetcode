import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1502 lang=java
 *
 * [1502] 判断能否形成等差数列
 * 
 * 109/109 cases passed (1 ms)
 * Your runtime beats 97.78 % of java submissions
 * Your memory usage beats 63.18 % of java submissions (39.7 MB)
 */

// @lc code=start
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int d = arr[1] - arr[0];
        for(int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != d) return false;
        }
        return true;
    }
}
// @lc code=end

