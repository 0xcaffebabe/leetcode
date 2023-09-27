/*
 * @lc app=leetcode.cn id=2037 lang=java
 * @lcpr version=
 *
 * [2037] 使每位学生都有座位的最少移动次数
 * 
 * 262/262 cases passed (2 ms)
 * Your runtime beats 98.13 % of java submissions
 * Your memory usage beats 5.14 % of java submissions (42.2 MB)
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int ans = 0;
        for(int i = 0; i < seats.length; i++)
            ans += Math.abs(seats[i] - students[i]);
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,1,5]\n[2,7,4]\n
// @lcpr case=end

// @lcpr case=start
// [4,1,5,9]\n[1,3,2,6]\n
// @lcpr case=end

// @lcpr case=start
// [2,2,6,6]\n[1,3,2,6]\n
// [2]\n[1]\n
// [2]\n[2]\n
// [1]\n[2]\n
// @lcpr case=end

 */

