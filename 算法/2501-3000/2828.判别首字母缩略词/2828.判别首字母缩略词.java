/*
 * @lc app=leetcode.cn id=2828 lang=java
 * @lcpr version=
 *
 * [2828] 判别首字母缩略词
 * 
 * 1519/1519 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 81.91 % of java submissions (42.4 MB)
 */

// @lc code=start

import java.util.List;

class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb = new StringBuilder();
        for(var w: words) 
            sb.append(w.charAt(0));
        return sb.toString().equals(s);
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
// @lcpr case=end

 */

