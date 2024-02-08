/*
 * @lc app=leetcode.cn id=1638 lang=java
 * @lcpr version=
 *
 * [1638] 统计只差一个字符的子串数目
 * 
 * 63/63 cases passed (178 ms)
 * Your runtime beats 7.69 % of java submissions
 * Your memory usage beats 5.77 % of java submissions (44 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int countSubstrings(String s, String t) {
        Map<Integer, List<String>> m1 = new HashMap<>();
        Map<Integer, List<String>> m2 = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            for(int j = i + 1; j <= s.length(); j++) {
                m1.computeIfAbsent(j - i, k -> new ArrayList<>())
                    .add(s.substring(i, j));
            }
        }
        for(int i = 0; i < t.length(); i++) {
            for(int j = i + 1; j <= t.length(); j++) {
                m2.computeIfAbsent(j - i, k -> new ArrayList<>())
                    .add(t.substring(i, j));
            }
        }
        // System.out.println(m1);
        // System.out.println(m2);
        int ans = 0;
        for(int i = 1; i <= s.length(); i++) {
            for(var a: m1.get(i)) {
                for(var b: m2.get(i)) {
                    // System.out.println(a + "," + b);
                    if (comp(a, b)) ans++;
                }
            }
        }
        return ans;
    }

    private boolean comp(String a, String b) {
        int diff = 0;
        for(int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) diff++;
        }
        return diff == 1;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "aba"\n"baba"\n
// @lcpr case=end

// @lcpr case=start
// "ab"\n"bb"\n
// @lcpr case=end

// @lcpr case=start
// "a"\n"a"\n
// @lcpr case=end

// @lcpr case=start
// "abe"\n"bbc"\n
// "b"\n"a"\n
// "a"\n"a"\n
// "aa"\n"bb"\n
// @lcpr case=end

 */

