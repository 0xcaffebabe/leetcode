/*
 * @lc app=leetcode.cn id=401 lang=java
 *
 * [401] 二进制手表
 * 
 * 11/11 cases passed (10 ms)
 * Your runtime beats 52.91 % of java submissions
 * Your memory usage beats 30.08 % of java submissions (40.5 MB)
 */

// @lc code=start
class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList<>();
        for(int i = 0; i < 12; i++) {
            for(int j = 0; j < 60; j++) {
                if (Integer.bitCount(i) + Integer.bitCount(j) == turnedOn) {
                    ans.add(i + ":" + (j < 10 ? "0"+j : j+""));
                }
            }
        }
        return ans;
    }
}
// @lc code=end

