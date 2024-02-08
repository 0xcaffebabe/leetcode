/*
 * @lc app=leetcode.cn id=2788 lang=java
 * @lcpr version=
 *
 * [2788] 按分隔符拆分字符串
 * 
 * 1036/1036 cases passed (5 ms)
 * Your runtime beats 79.41 % of java submissions
 * Your memory usage beats 85.38 % of java submissions (43.3 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> ans = new ArrayList<>();
        for(var i : words) {
            StringBuilder sb = new StringBuilder();
            for(var c: i.toCharArray()) {
                if (c == separator) {
                    if (sb.length() > 0) ans.add(sb.toString());
                    sb = new StringBuilder();
                } else {
                    sb.append(c);
                }
            }
            if (sb.length() > 0) ans.add(sb.toString());
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["one.two.three","four.five","six"]\n"."\n
// @lcpr case=end

// @lcpr case=start
// ["$easy$","$problem$"]\n"$"\n
// @lcpr case=end

// @lcpr case=start
// ["|||"]\n"|"\n
// ["abc"]\n"|"\n
// ["abc||a"]\n"|"\n
// @lcpr case=end

 */

