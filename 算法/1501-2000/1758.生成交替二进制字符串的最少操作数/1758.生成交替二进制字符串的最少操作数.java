/*
 * @lc app=leetcode.cn id=1758 lang=java
 * @lcpr version=21907
 *
 * [1758] 生成交替二进制字符串的最少操作数
 * 
 * 89/89 cases passed (4 ms)
 * Your runtime beats 48.33 % of java submissions
 * Your memory usage beats 97.5 % of java submissions (40.6 MB)
 */

// @lc code=start
class Solution {
    public int minOperations(String s) {
        int c1 = 0;
        int c2 = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i % 2 == 0) {
                if (c != '0') c1++;
                else c2++;
            } else {
                if (c != '0') c2++;
                else c1++;
            }
        }
        return Math.min(c1, c2);
    }
}
// @lc code=end



/*
// @lcpr case=start
// "0100"\n
// @lcpr case=end

// @lcpr case=start
// "10"\n
// @lcpr case=end

// @lcpr case=start
// "1111"\n
// @lcpr case=end

// @lcpr case=start
// "1"\n
// @lcpr case=end

// @lcpr case=start
// "10010100"\n
// @lcpr case=end

 */

