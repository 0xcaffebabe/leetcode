/*
 * @lc app=leetcode.cn id=2224 lang=java
 *
 * [2224] 转化时间需要的最少操作数
 * 
 * 256/256 cases passed (1 ms)
 * Your runtime beats 68.02 % of java submissions
 * Your memory usage beats 12.55 % of java submissions (40.1 MB)
 */

// @lc code=start
class Solution {
    public int convertTime(String current, String correct) {
        int diff = toInt(correct) - toInt(current);
        int ans = 0;
        while(diff > 0) {
            if (diff >= 60) diff -= 60;
            else if (diff >= 15) diff -= 15;
            else if (diff >= 5) diff -= 5;
            else diff -= 1;
            ans++;
        }
        return ans;
    }

    private int toInt(String time) {
        var arr = time.split(":");
        return Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]);
    }
}
// @lc code=end

