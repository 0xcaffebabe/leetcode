/*
 * @lc app=leetcode.cn id=1450 lang=java
 *
 * [1450] 在既定时间做作业的学生人数
 * 
 * 111/111 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 92.92 % of java submissions (39.2 MB)
 */

// @lc code=start
class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int cnt = 0;
        for(int i = 0;i<startTime.length;i++){
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) cnt++;
        }
        return cnt;
    }
}
// @lc code=end

