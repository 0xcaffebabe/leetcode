/*
 * @lc app=leetcode.cn id=890 lang=java
 * @lcpr version=
 *
 * [890] 查找和替换模式
 * 
 * 50/50 cases passed (1 ms)
 * Your runtime beats 90.77 % of java submissions
 * Your memory usage beats 71.54 % of java submissions (40.2 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        var sp = normalize(pattern);
        for(var i : words) {
            if (normalize(i).equals(sp)) 
                ans.add(i);
        }
        return ans;
    }
    String normalize(String s) {
        char[] map = new char[26];
        char p = 'a';
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map[c - 'a'] == 0) {
                map[c - 'a'] = p;
                p++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(var c: s.toCharArray())
            sb.append(map[c - 'a']);
        return sb.toString();
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["abc","deq","mee","aqq","dkd","ccc"]\n"abb"\n
// ["qwert"]\n"abcde"\n
// ["abcd"]\n"abcd"\n
// @lcpr case=end

 */

