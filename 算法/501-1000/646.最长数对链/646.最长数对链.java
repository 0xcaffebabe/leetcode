import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=646 lang=java
 *
 * [646] 最长数对链
 * 
 * 205/205 cases passed (8 ms)
 * Your runtime beats 98.18 % of java submissions
 * Your memory usage beats 15.49 % of java submissions (41.9 MB)
 */

// @lc code=start
class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a,b) -> a[1] - b[1]);
        int ans = 1;
        int[] prev = pairs[0];
        // for(var i : pairs) for(var j : i) System.out.println(j);
        for(int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > prev[1]) {
                ans++;
                prev = pairs[i];
            }
        }
        return ans;
    }
}
// @lc code=end

