/*
 * @lc app=leetcode.cn id=187 lang=java
 * @lcpr version=21907
 *
 * [187] 重复的DNA序列
 * 
 * 31/31 cases passed (3 ms)
 * Your runtime beats 98.84 % of java submissions
 * Your memory usage beats 98.38 % of java submissions (42.7 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> ans = new HashSet<>();
        if (s.length() <= 10 || s.length() > 10000) return new ArrayList<>();

        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder(s.substring(0, 10));
        set.add(sb.toString());
        int n = s.length();
        for(int i = 1; i < n; i++) {
            if (i + 9 >= n) break;
            sb.delete(0, 1);
            sb.append(s.charAt(i + 9));

            var t = sb.toString();
            if (set.contains(t)) ans.add(t);
            set.add(t);
        }
        return new ArrayList<>(ans);
    }
}
// @lc code=end



/*
// @lcpr case=start
// "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"\n
// @lcpr case=end

// @lcpr case=start
// "AAAAAAAAAAAAA"\n
// @lcpr case=end

 */

