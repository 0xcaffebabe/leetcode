/*
 * @lc app=leetcode.cn id=1807 lang=java
 * @lcpr version=
 *
 * [1807] 替换字符串中的括号内容
 * 
 * 105/105 cases passed (34 ms)
 * Your runtime beats 69.64 % of java submissions
 * Your memory usage beats 91.07 % of java submissions (81 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> kmap = new HashMap<>();
        for(var i: knowledge) kmap.put(i.get(0), i.get(1));
        StringBuilder sb = new StringBuilder();
        StringBuilder key = new StringBuilder();
        boolean start = false;
        for(var c: s.toCharArray()) {
            if (start && c == ')') {
                sb.append(kmap.getOrDefault(key.toString(), "?"));
                start = false;
                key = new StringBuilder();
            } else if (c == '(') {
                start = true;
            } else {
                if (start) key.append(c);
                else sb.append(c);
            }
        }
        return sb.toString();
    }
}
// @lc code=end



/*
// @lcpr case=start
// "(name)is(age)yearsold"\n[["name","bob"],["age","two"]]\n
// "abcd"\n[]\n
// @lcpr case=end

// @lcpr case=start
// "hi(name)"\n[["a","b"]]\n
// @lcpr case=end

// @lcpr case=start
// "(a)(a)(a)aaa"\n[["a","yes"]]\n
// @lcpr case=end

 */

