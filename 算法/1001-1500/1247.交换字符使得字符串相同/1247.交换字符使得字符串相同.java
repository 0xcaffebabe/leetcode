/*
 * @lc app=leetcode.cn id=1247 lang=java
 * @lcpr version=
 *
 * [1247] 交换字符使得字符串相同
 * 
 * 70/70 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 77.27 % of java submissions (39.3 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int minimumSwap(String s1, String s2) {
        int xy = 0;
        int yx = 0;
        for(int i = 0; i < s1.length(); i++) {
            char a = s1.charAt(i);
            char b = s2.charAt(i);
            if (a == 'x' && b == 'y') xy++;
            if (b == 'x' && a == 'y') yx++;
        }
        if ((xy + yx) % 2 == 1) return -1;
        return xy / 2 + yx / 2 + xy % 2 + yx % 2;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "xx"\n"yy"\n
// @lcpr case=end

// @lcpr case=start
// "xy"\n"yx"\n
// @lcpr case=end

// @lcpr case=start
// "xx"\n"xy"\n
// @lcpr case=end

 */

