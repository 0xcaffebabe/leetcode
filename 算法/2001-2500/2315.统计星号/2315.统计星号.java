/*
 * @lc app=leetcode.cn id=2315 lang=java
 *
 * [2315] 统计星号
 * 
 * 69/69 cases passed (2 ms)
 * Your runtime beats 55.94 % of java submissions
 * Your memory usage beats 58.15 % of java submissions (39.6 MB)
 */

// @lc code=start
class Solution {
    public int countAsterisks(String s) {
        var arr = s.split("\\|");
        int ans = 0;
        for(int i = 0; i < arr.length; i += 2) {
            var str = arr[i];
            for(int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '*') ans++;
            }
        }
        return ans;
    }
}
// @lc code=end

