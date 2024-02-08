/*
 * @lc app=leetcode.cn id=241 lang=java
 * @lcpr version=
 *
 * [241] 为运算表达式设计优先级
 * 
 * 25/25 cases passed (5 ms)
 * Your runtime beats 6.65 % of java submissions
 * Your memory usage beats 5.13 % of java submissions (43.4 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    Map<String, List<Integer>> memo = new HashMap<>();
    public List<Integer> diffWaysToCompute(String exp) {
        if (isNumber(exp)) return Arrays.asList(Integer.parseInt(exp));
        if (memo.containsKey(exp)) return memo.get(exp);

        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < exp.length(); i++) {
            var c = exp.charAt(i);
            if (c != '-' && c != '+' && c != '*') continue;
            var left = diffWaysToCompute(exp.substring(0, i));
            var right = diffWaysToCompute(exp.substring(i + 1, exp.length()));
            for(var l: left) {
                for(var r: right) {
                    if (c == '-') res.add(l - r);
                    if (c == '+') res.add(l + r);
                    if (c == '*') res.add(l * r);
                }
            }
        }
        return res;
    }

    private boolean isNumber(String exp) {
        try {
            Integer.parseInt(exp);
            return true;
        }catch(Exception e) {
            return false;
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// "2-1-1"\n
// @lcpr case=end

// @lcpr case=start
// "2*3-4*5"\n
// "2*1"\n
// "2*1*2*3*4*5*6"\n
// "2"\n
// @lcpr case=end

 */

