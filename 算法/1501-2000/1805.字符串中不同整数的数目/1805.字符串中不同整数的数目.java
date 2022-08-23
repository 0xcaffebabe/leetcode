import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=1805 lang=java
 *
 * [1805] 字符串中不同整数的数目
 * 
 * 85/85 cases passed (2 ms)
 * Your runtime beats 83.61 % of java submissions
 * Your memory usage beats 59.43 % of java submissions (39.7 MB)
 */

// @lc code=start
class Solution {
    public int numDifferentIntegers(String word) {
        Set<String> set = new HashSet();
        int ans = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c >= '0' && c <= '9') {
                sb.append(c);
            }else {
                if (sb.length() != 0) {
                    String num = toNum(sb.toString());
                    if (!set.contains(num)) {
                        ans++;
                        set.add(num);
                    }
                    sb = new StringBuilder();
                }
            }
            
        }
        if (sb.length() != 0) {
            String num = toNum(sb.toString());
            if (!set.contains(num)) {
                ans++;
                set.add(num);
            }
        }
        return ans;
    }

    String toNum(String num) {
        int p = 0;
        while(p < num.length() && num.charAt(p) == '0') p++;
        if (p >= num.length()) return "0";
        return num.substring(p, num.length());
    }
}
// @lc code=end
