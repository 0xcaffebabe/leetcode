/*
 * @lc app=leetcode.cn id=2942 lang=java
 * @lcpr version=
 *
 * [2942] 查找包含给定字符的单词
 * 
 * 912/912 cases passed (2 ms)
 * Your runtime beats 46.3 % of java submissions
 * Your memory usage beats 5.17 % of java submissions (43.6 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < words.length; i++) {
            for(var c: words[i].toCharArray()) {
                if (c == x) {
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["leet","code"]\n"e"\n
// @lcpr case=end

// @lcpr case=start
// ["abc","bcd","aaaa","cbc"]\n"a"\n
// @lcpr case=end

// @lcpr case=start
// ["abc","bcd","aaaa","cbc"]\n"z"\n
// @lcpr case=end

 */

