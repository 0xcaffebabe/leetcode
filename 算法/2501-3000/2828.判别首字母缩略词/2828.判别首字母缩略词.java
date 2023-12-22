/*
 * @lc app=leetcode.cn id=2828 lang=java
 * @lcpr version=
 *
 * [2828] 判别首字母缩略词
 * 
 * 1519/1519 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 19.57 % of java submissions (43.5 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.List;

class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length()) return false;
        for(int i = 0; i < words.size(); i++) {
            if (s.charAt(i) != words.get(i).charAt(0)) return false;
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["alice","bob","charlie"]\n"abc"\n
// @lcpr case=end

// @lcpr case=start
// ["an","apple"]\n"a"\n
// @lcpr case=end

// @lcpr case=start
// ["never","gonna","give","up","on","you"]\n"ngguoy"\n
// ["a"]\n"a"\n
// ["bpple"]\n"a"\n
// @lcpr case=end

 */

