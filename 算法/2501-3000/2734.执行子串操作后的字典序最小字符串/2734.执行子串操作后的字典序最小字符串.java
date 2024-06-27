/*
 * @lc app=leetcode.cn id=2734 lang=java
 * @lcpr version=
 *
 * [2734] 执行子串操作后的字典序最小字符串
 * 
 * 2241/2241 cases passed (39 ms)
 * Your runtime beats 5.8 % of java submissions
 * Your memory usage beats 11.59 % of java submissions (48.9 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String smallestString(String s) {
        int start = -1;
        int end = -1;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' && end == -1) continue;
            if (c == 'a' && end != -1) break;

            if (start == -1) start = i;
            end = i;
        }
        if (start == -1) {
            start = s.length() - 1;
            end = start + 1;
        }
        // System.out.println(start + "|" + end);
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if (i >= start && i <= end) {
                char c = s.charAt(i);
                if (c == 'a') ans.append('z');
                else ans.append((char)(c - 1));
            }
            else ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}
// @lc code=end



/*
// @lcpr case=start
// "cbabc"\n
// "aa" \n
// "aaaaa" \n
// "baa" \n
// "ba" \n
// "ab" \n
// "abb" \n
// @lcpr case=end

// @lcpr case=start
// "acbbc"\n
// @lcpr case=end

// @lcpr case=start
// "leetcode"\n
// @lcpr case=end

 */

