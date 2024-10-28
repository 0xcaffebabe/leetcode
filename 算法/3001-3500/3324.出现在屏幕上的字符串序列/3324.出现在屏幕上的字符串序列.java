/*
 * @lc app=leetcode.cn id=3324 lang=java
 * @lcpr version=
 *
 * [3324] 出现在屏幕上的字符串序列
 * 
 * 742/742 cases passed (6 ms)
 * Your runtime beats 94.94 % of java submissions
 * Your memory usage beats 96.3 % of java submissions (54.2 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> stringSequence(String target) {
        StringBuilder sb = new StringBuilder();
        int p = 0;
        sb.append('a');
        List<String> ans = new ArrayList<>();
        while(p < target.length()) {
            char c = target.charAt(p);
            ans.add(sb.toString());
            if (c == sb.charAt(sb.length() - 1)) {
                p++;
                sb.append('a');
            } else {
                sb.setCharAt(sb.length() - 1, (char)(sb.charAt(sb.length() - 1) + 1));;
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abc"\n
// "zz"\n
// "z"\n
// "a"\n
// "b"\n
// @lcpr case=end

// @lcpr case=start
// "he"\n
// @lcpr case=end

 */

