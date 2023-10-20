/*
 * @lc app=leetcode.cn id=2042 lang=java
 * @lcpr version=
 *
 * [2042] 检查句子中的数字是否递增
 * 
 * 98/98 cases passed (1 ms)
 * Your runtime beats 91.55 % of java submissions
 * Your memory usage beats 28.87 % of java submissions (39.8 MB)
 */

// @lc code=start
class Solution {
    public boolean areNumbersAscending(String s) {
        int pre = -1;
        for(var w: s.split(" ")) {
            if (w.charAt(0) >= '0' && w.charAt(0) <= '9') {
                var i = Integer.parseInt(w);
                if (i <= pre) return false;
                pre = i;
            }
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "1 box has 3 blue 4 red 6 green and 12 yellow marbles"\n
// @lcpr case=end

// @lcpr case=start
// "hello world 5 x 5"\n
// @lcpr case=end

// @lcpr case=start
// "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s"\n
// @lcpr case=end

// @lcpr case=start
// "4 5 11 26"\n
// @lcpr case=end

 */

