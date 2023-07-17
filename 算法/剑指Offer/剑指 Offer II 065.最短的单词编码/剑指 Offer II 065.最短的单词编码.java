/*
 * @lc app=leetcode.cn id=剑指 Offer II 065 lang=java
 * @lcpr version=21909
 *
 * [剑指 Offer II 065] 最短的单词编码
 * 
 * 36/36 cases passed (311 ms)
 * Your runtime beats 5.12 % of java submissions
 * Your memory usage beats 84.19 % of java submissions (42.7 MB)
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
}
// @lc code=end



/*
// @lcpr case=start
// ["time", "me", "bell"]\n
// @lcpr case=end

// @lcpr case=start
// ["t"]\n
// @lcpr case=end

 */

