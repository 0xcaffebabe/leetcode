/*
 * @lc app=leetcode.cn id=820 lang=java
 * @lcpr version=21909
 *
 * [820] 单词的压缩编码
 * 
 * 38/38 cases passed (321 ms)
 * Your runtime beats 10.46 % of java submissions
 * Your memory usage beats 80.68 % of java submissions (42.7 MB)
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int minimumLengthEncoding(String[] words) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(words, (a, b) -> b.length() - a.length());
        for(var w: words) {
            if (endsWith(sb, w) || sb.indexOf(w + "#") != -1) continue;
            sb.append("#" + w);
        }
        sb.append("#");
        // System.out.println(sb);
        // System.out.println(endsWith(sb, "321"));
        // System.out.println(startsWith(sb, "123"));
        return sb.length() - 1;
    }

    boolean endsWith(StringBuilder sb, String word) {
        if (sb.length() < word.length()) return false;
        int cnt = 0;
        for(int i = sb.length() - word.length(); i < sb.length(); i++) {
            if (sb.charAt(i) != word.charAt(cnt++)) return false;
        }
        return true;
    }

    boolean startsWith(StringBuilder sb, String word) {
        if (sb.length() < word.length()) return false;
        for(int i = 0; i < word.length(); i++) {
            if (sb.charAt(i) != word.charAt(i)) return false;
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["time", "me", "bell"]\n
// @lcpr case=end

// @lcpr case=start
// ["t"]\n
// ["t","tt", "abc"]\n
// ["t","a", "b"]\n
// ["me" ,"mean"]\n
// @lcpr case=end

 */

