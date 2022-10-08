import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1399 lang=java
 *
 * [1399] 统计最大组的数目
 * 
 * 75/75 cases passed (3 ms)
 * Your runtime beats 87.85 % of java submissions
 * Your memory usage beats 86.92 % of java submissions (38.3 MB)
 */

// @lc code=start
class Solution {
    public int countLargestGroup(int n) {
        int[] map = new int[40];
        int max = 0;
        for(int i = 1; i <= n; i++) {
            int sum = 0;
            int fi = i;
            while(fi > 0) {
                sum += fi % 10;
                fi /= 10;
            }
            map[sum]++;
            max = Math.max(max,map[sum]);
        }
        // System.out.println(Arrays.toString(map));
        int ans = 0;
        for(var i: map) if (i == max) ans++;
        return ans;
    }
}
// @lc code=end

