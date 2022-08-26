import java.util.Arrays;
import java.util.stream.Collectors;

/*
 * @lc app=leetcode.cn id=1816 lang=java
 *
 * [1816] 截断句子
 * 
 * 72/72 cases passed (3 ms)
 * Your runtime beats 13.29 % of java submissions
 * Your memory usage beats 62.97 % of java submissions (39.6 MB)
 */

// @lc code=start
class Solution {
    public String truncateSentence(String s, int k) {
        return Arrays.stream(s.split(" "))
            .limit(k)
            .collect(Collectors.joining(" "));
    }
}
// @lc code=end

