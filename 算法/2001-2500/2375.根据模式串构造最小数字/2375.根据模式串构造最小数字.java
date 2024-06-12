/*
 * @lc app=leetcode.cn id=2375 lang=java
 * @lcpr version=
 *
 * [2375] 根据模式串构造最小数字
 * 
 * 104/104 cases passed (1 ms)
 * Your runtime beats 43.33 % of java submissions
 * Your memory usage beats 85 % of java submissions (40.5 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.LinkedList;

class Solution {
    public String smallestNumber(String pattern) {
        pattern += "I";
        LinkedList<Integer> stack = new LinkedList<>();
        int i = 1;
        StringBuilder ans = new StringBuilder();
        for(var c: pattern.toCharArray()) {
            if (c == 'D') {
                stack.push(i);
            } else {
                ans.append(i);
                while(!stack.isEmpty())
                    ans.append(stack.pop());
            }
            i++;
        }
        return ans.toString();
    }
}
// @lc code=end



/*
// @lcpr case=start
// "IIIDIDDD"\n
// "DDDDDDDD"\n
// "IIIIIIII"\n
// "IIIIDDDD"\n
// "DDDDIIII"\n
// @lcpr case=end

// @lcpr case=start
// "DDD"\n
// @lcpr case=end

 */

