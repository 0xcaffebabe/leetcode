/*
 * @lc app=leetcode.cn id=2645 lang=java
 * @lcpr version=
 *
 * [2645] 构造有效字符串的最少插入数
 * 
 * 1523/1523 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 34.19 % of java submissions (41.4 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int addMinimum(String word) {
        String abc = "abc";
        int ans = 0;
        int p = 0;
        int q = 0;
        for(; p < word.length(); p++) {
            q = q % 3;
            while(word.charAt(p) != abc.charAt(q)) {
                ans++;
                q++;
                q = q % 3;
            }
            q++;
        }
        return ans + 3 - q;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "b"\n
// @lcpr case=end

// @lcpr case=start
// "aaa"\n
// @lcpr case=end

// @lcpr case=start
// "abc"\n
// "abcabcccc"\n
// "abcabcabc"\n
// @lcpr case=end

 */

