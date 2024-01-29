/*
 * @lc app=leetcode.cn id=2566 lang=java
 * @lcpr version=
 *
 * [2566] 替换一个数字后的最大差值
 * 214/214 cases passed (2 ms)
 * Your runtime beats 35.71 % of java submissions
 * Your memory usage beats 6.25 % of java submissions (39.9 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int minMaxDifference(int num) {
        String s = String.valueOf(num);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i <= 9; i++) {
            max = Math.max(max, Integer.parseInt(s.replace(i + "", "9")));
            min = Math.min(min, Integer.parseInt(s.replace(i + "", "0")));
        }
        return max - min;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 11891\n
// 1\n
// 999999\n
// 10000000\n
// 100000000\n
// @lcpr case=end

// @lcpr case=start
// 90\n
// @lcpr case=end

 */

