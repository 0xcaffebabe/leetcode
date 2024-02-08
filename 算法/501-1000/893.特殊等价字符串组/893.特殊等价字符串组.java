/*
 * @lc app=leetcode.cn id=893 lang=java
 * @lcpr version=
 *
 * [893] 特殊等价字符串组
 * 
 * 36/36 cases passed (5 ms)
 * Your runtime beats 79.27 % of java submissions
 * Your memory usage beats 71.95 % of java submissions (42.3 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
import java.util.Arrays;
class Solution {
    public int numSpecialEquivGroups(String[] words) {
        return (int) Arrays.stream(words)
                .map(this::normalize).distinct().count();
    }

    private String normalize(String word) {
        char[] chars = word.toCharArray();
        int evenLength = chars.length / 2;
        if (chars.length % 2 == 1) {
            evenLength++;
        }
        char[] odd = new char[chars.length / 2];
        char[] even = new char[evenLength];
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                even[i / 2] = chars[i];
            } else {
                odd[i / 2] = chars[i];
            }
        }
        Arrays.sort(odd);
        Arrays.sort(even);
        return new String(odd) + new String(even);
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["abcd","cdab","cbad","xyzz","zzxy","zzyx"]\n
// ["abcd","cdab","adcb","cbad"]\n
// ["a"]\n
// @lcpr case=end

// @lcpr case=start
// ["abc","acb","bac","bca","cab","cba"]\n
// @lcpr case=end

 */

