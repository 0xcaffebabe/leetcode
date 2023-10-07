/*
 * @lc app=leetcode.cn id=2785 lang=java
 * @lcpr version=
 *
 * [2785] 将字符串中的元音字母排序
 * 
 * 2216/2216 cases passed (75 ms)
 * Your runtime beats 26.35 % of java submissions
 * Your memory usage beats 49.24 % of java submissions (44.9 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String sortVowels(String s) {
        List<Character> list = new ArrayList<>();
        for(var i : s.toCharArray()) {
            char c = i;
            if (c <= 90) c += 32;
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') 
                list.add(i);
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        int p = 0;
        for(var i : s.toCharArray()) {
            char c = i;
            if (c <= 90) c += 32;
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') 
                sb.append(list.get(p++));
            else sb.append(i);
        }
        return sb.toString();
    }
}
// @lc code=end



/*
// @lcpr case=start
// "lEetcOde"\n
// @lcpr case=end

// @lcpr case=start
// "lYmpH"\n
// @lcpr case=end

 */

