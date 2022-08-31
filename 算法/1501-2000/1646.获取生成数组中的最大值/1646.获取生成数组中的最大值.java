import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1646 lang=java
 *
 * [1646] 获取生成数组中的最大值
 * 
 * 101/101 cases passed (1 ms)
 * Your runtime beats 27 % of java submissions
 * Your memory usage beats 15.86 % of java submissions (38.6 MB)
 */

// @lc code=start
class Solution {
    public int getMaximumGenerated(int n) {
        if (n == 0) return 0;
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i <= n; i++) {
            arr[i] = arr[i / 2] + i % 2 * arr[i / 2 + 1];
        }
        // System.out.println(Arrays.toString(arr));
        return Arrays.stream(arr).max().getAsInt();
    }
}
// @lc code=end

