/*
 * @lc app=leetcode.cn id=1309 lang=java
 * @lcpr version=
 *
 * [1309] 解码字母到整数映射
 * 
 * 40/40 cases passed (9 ms)
 * Your runtime beats 5.47 % of java submissions
 * Your memory usage beats 5.47 % of java submissions (41.3 MB)
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    static Map<String, String> first = new HashMap<>();
    static Map<String, String> second = new HashMap<>();
    static {
        for(int i = 0; i <= 16; i++) 
            first.put((i + 10) + "#", (char)('j' + i) + "");
        for(int i = 1; i <= 9; i++) 
            second.put(i + "", (char)('a' + i - 1) + "");
    }
    public String freqAlphabets(String s) {
        for(var enr: first.entrySet())
            s = s.replaceAll(enr.getKey(), enr.getValue());
        for(var enr: second.entrySet())
            s = s.replaceAll(enr.getKey(), enr.getValue());
        return s;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "10#11#12"\n
// @lcpr case=end

// @lcpr case=start
// "1326#"\n
// @lcpr case=end

 */

