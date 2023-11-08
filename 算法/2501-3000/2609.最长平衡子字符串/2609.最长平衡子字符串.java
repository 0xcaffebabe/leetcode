/*
 * @lc app=leetcode.cn id=2609 lang=java
 * @lcpr version=
 *
 * [2609] 最长平衡子字符串
 * 
 * 1848/1848 cases passed (4 ms)
 * Your runtime beats 8.72 % of java submissions
 * Your memory usage beats 73.84 % of java submissions (40.8 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int ans = 0;
        for(int i = 0; i < s.length(); i++) {
            int one = 0;
            int zero = 0;
            for(int j = i; j < s.length(); j++) {
                if (s.charAt(j) == '0') {
                    one = 0;
                    if (j > 0 && s.charAt(j - 1) == '1') zero = 0;
                    zero++;
                }
                else one++;
                // System.out.print(s.charAt(j) + "," + one + "," + zero + "  ");
                if (one == zero) ans = Math.max(ans , one + zero);
            }
            // System.out.println();
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "01011"\n
// @lcpr case=end

// @lcpr case=start
// "01000111"\n
// "11110000"\n
// "10"\n
// "01"\n
// "0"\n
// "1"\n
// @lcpr case=end


// @lcpr case=start
// "00111"\n
// @lcpr case=end

// @lcpr case=start
// "111"\n
// @lcpr case=end

 */

