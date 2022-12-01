/*
 * @lc app=leetcode.cn id=1041 lang=java
 *
 * [1041] 困于环中的机器人
 * 
 * 116/116 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 57.37 % of java submissions (39.4 MB)
 */

// @lc code=start
class Solution {
    public boolean isRobotBounded(String instructions) {
        int[][] directions = {{0,1}, {1,0}, {0, -1}, {-1, 0}};
        int x = 0;
        int y = 0;
        int dir = 0;
        var arr = instructions.toCharArray();
        for(int i = 0; i < 4; i++) {
            for(var s : arr) {
                if (s == 'L') dir = (dir + 3) % 4;
                else if (s == 'R') dir = (dir  + 1) % 4;
                else {
                    x += directions[dir][0];
                    y += directions[dir][1];
                }
                // System.out.println(x + "|" + y);
            }
        }
        if (x == 0 && y == 0)  return true;
        return false;
    }
}
// @lc code=end

