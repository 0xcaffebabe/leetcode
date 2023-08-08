/*
 * @lc app=leetcode.cn id=385 lang=java
 * @lcpr version=21912
 *
 * [385] 迷你语法分析器
 * 
 * 58/58 cases passed (27 ms)
 * Your runtime beats 5.15 % of java submissions
 * Your memory usage beats 72.51 % of java submissions (43 MB)
 */

// @lc code=start

/*
// @lcpr case=start
// "324"\n
// @lcpr case=end

// @lcpr case=start
// "[123,[456,[789]]]"\n
// "[123,[456,444,[789]]]"\n
// "[123,[456,444,[789,555,88]]]"\n
// "[123,[456,444,[789,555,88],99]]"\n
// "[123,[456,444,[789,555,88],99,[123,456]]]"\n
// @lcpr case=end

 */


class Solution {


    public NestedInteger deserialize(String s) {
        if (s.startsWith("[") && s.length() == 2) return new NestedInteger();
        if (!s.startsWith("[")) {
            return new NestedInteger(Integer.parseInt(s));
        }
        var ni = new NestedInteger();
        int sn = 0;
        int start = 1;
        for(int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (sn == 0 && (c == ',' || i == s.length() - 1)) {
                System.out.println(s.substring(start, i));
                ni.add(deserialize(s.substring(start, i)));
                start = i + 1;
            }
            else if (c == '[') {
                sn++;
            } else if (c == ']') {
                sn--;
            }
        }
        return ni;
    }

   
}
// @lc code=end




