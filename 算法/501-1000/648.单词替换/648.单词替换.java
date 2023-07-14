/*
 * @lc app=leetcode.cn id=648 lang=java
 * @lcpr version=21909
 *
 * [648] 单词替换
 * 
 * 127/127 cases passed (125 ms)
 * Your runtime beats 47.22 % of java submissions
 * Your memory usage beats 78.98 % of java submissions (51.2 MB)
 */

// @lc code=start

import java.util.Collections;
import java.util.List;

class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Collections.sort(dictionary, (a, b) -> a.length() - b.length());
        String[] split = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for(var i : split) {
            var t = i;
            for(var j : dictionary) {
                if (i.startsWith(j)) {
                    t = j;
                    break;
                }
            }
            sb.append(t + " ");
        }
        return sb.toString().substring(0, sb.length() - 1);
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["cat","bat","rat"]\n"the cattle was rattled by the battery"\n
// @lcpr case=end

// @lcpr case=start
// ["a","b","c"]\n"aadsfasf absbs bbab cadsfafs"\n
// ["aa", "a","b","c"]\n"aadsfasf absbs bbab cadsfafs"\n
// @lcpr case=end

 */

