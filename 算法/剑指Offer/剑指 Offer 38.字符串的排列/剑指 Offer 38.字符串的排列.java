/*
 * @lc app=leetcode.cn id=剑指 Offer 38 lang=java
 * @lcpr version=21907
 *
 * [剑指 Offer 38] 字符串的排列
 * 
 * 52/52 cases passed (110 ms)
 * Your runtime beats 5.04 % of java submissions
 * Your memory usage beats 5.08 % of java submissions (48.6 MB)
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {
    Set<String> ans = new HashSet<>();
    char[] arr;
    Set<Integer> used = new HashSet<>();
    public String[] permutation(String s) {
        this.arr = s.toCharArray();
        dfs(new StringBuilder());
        return ans.toArray(new String[]{});
    }

    void dfs(StringBuilder sb) {
       if (sb.length() == arr.length) {
        ans.add(sb.toString());
        return;
       }
       for(int i = 0; i < arr.length; i++) {
        if (used.contains(i)) continue;
        used.add(i);
        dfs(new StringBuilder(sb).append(arr[i]));
        used.remove(i);
       }
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abc"\n
// @lcpr case=end

// @lcpr case=start
// "aaa"\n
// @lcpr case=end

// @lcpr case=start
// "a"\n
// @lcpr case=end

// @lcpr case=start
// "ab"\n
// @lcpr case=end

 */

