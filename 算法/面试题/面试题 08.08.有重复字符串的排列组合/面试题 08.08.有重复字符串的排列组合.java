/*
 * @lc app=leetcode.cn id=面试题 08.08 lang=java
 * @lcpr version=
 *
 * [面试题 08.08] 有重复字符串的排列组合
 * 
 * 29/29 cases passed (1 ms)
 * Your runtime beats 99.63 % of java submissions
 * Your memory usage beats 94.11 % of java submissions (42.4 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    char[] arr;
    List<String> ans = new ArrayList<>();
    boolean[] visted;
    public String[] permutation(String S) {
        arr = S.toCharArray();
        visted = new boolean[arr.length];
        Arrays.sort(arr);
        dfs(new StringBuilder());
        return ans.toArray(new String[]{});
    }

    void dfs(StringBuilder sb) {
        if (sb.length() == arr.length) {
            ans.add(sb.toString());
            return;
        }
        for(int i = 0; i < arr.length; i++) {
            if (visted[i]) continue;
            if (i > 0 && arr[i] == arr[i - 1] && !visted[i-1]) continue;
            visted[i] = true;
            sb.append(arr[i]);
            dfs(sb);
            sb.deleteCharAt(sb.length() - 1);
            visted[i] = false;
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// "qqe"\n
// "abcde"\n
// @lcpr case=end

// @lcpr case=start
// "ab"\n
// @lcpr case=end

 */

