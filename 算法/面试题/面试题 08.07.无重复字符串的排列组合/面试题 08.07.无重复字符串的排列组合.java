/*
 * @lc app=leetcode.cn id=面试题 08.07 lang=java
 * @lcpr version=
 *
 * [面试题 08.07] 无重复字符串的排列组合
 * 
 * 30/30 cases passed (18 ms)
 * Your runtime beats 36.84 % of java submissions
 * Your memory usage beats 43.86 % of java submissions (52.3 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    char[] arr;
    boolean[] visted;
    List<String> ans = new ArrayList<>();
    public String[] permutation(String S) {
        arr = S.toCharArray();
        visted = new boolean[arr.length];
        bt(0, "");
        return ans.toArray(new String[]{});
    }
    void bt(int n, String s) {
        if (s.length() == arr.length) {
            ans.add(s);
            return;
        }

        for(int i = 0; i < arr.length; i++) {
            if (visted[i]) continue;
            visted[i] = true;
            bt(n + 1, s + arr[i]);
            visted[i] = false;
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// "qwe"\n
// "q"\n
// @lcpr case=end

// @lcpr case=start
// "ab"\n
// @lcpr case=end

 */

