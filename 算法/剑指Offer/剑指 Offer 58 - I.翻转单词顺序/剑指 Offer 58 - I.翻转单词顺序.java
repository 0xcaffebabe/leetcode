/*
 * @lc app=leetcode.cn id=剑指 Offer 58 - I lang=java
 * @lcpr version=21909
 *
 * [剑指 Offer 58 - I] 翻转单词顺序
 * 
 * 25/25 cases passed (2 ms)
 * Your runtime beats 75.64 % of java submissions
 * Your memory usage beats 54.11 % of java submissions (42.4 MB)
 */

// @lc code=start

import java.util.LinkedList;

class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        if (s.length() == 0) return "";
        LinkedList<String> stack = new LinkedList<>();
        for(var str: s.split(" ")) if (str.length() != 0) stack.push(str);
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            var str = stack.pop();
            if (str == null || str.length() == 0) continue;
            sb.append(str + " ");
        }
        sb.delete(sb.length() - 1, sb.length());
        return sb.toString();
    }
}
// @lc code=end



/*
// @lcpr case=start
// "the sky is blue"\n
// ""\n
// "  "\n
// "a"\n
// " a "\n
// " a   b "\n
// @lcpr case=end

// @lcpr case=start
// "  hello world!  "\n
// @lcpr case=end

// @lcpr case=start
// "a good   example"\n
// @lcpr case=end

 */

