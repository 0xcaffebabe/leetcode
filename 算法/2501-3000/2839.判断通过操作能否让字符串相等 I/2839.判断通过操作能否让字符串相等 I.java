/*
 * @lc app=leetcode.cn id=2839 lang=java
 * @lcpr version=
 *
 * [2839] 判断通过操作能否让字符串相等 I
 * 
 * 1003/1003 cases passed (1 ms)
 * Your runtime beats 78.39 % of java submissions
 * Your memory usage beats 21.02 % of java submissions (40.9 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        if (Arrays.equals(a, b)) return true;
        swap(a, 0, 2);
        if (Arrays.equals(a, b)) return true;
        swap(a, 0, 2);
        swap(a, 1, 3);
        if (Arrays.equals(a, b)) return true;
        swap(a, 0, 2);
        if (Arrays.equals(a, b)) return true;
        return false;
    }

    void swap(char[] arr, int a, int b) {
        var t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abcd"\n"cdab"\n
// @lcpr case=end

// @lcpr case=start
// "abcd"\n"dacb"\n
// "cdab"\n"abcd"\n
// "abcd"\n"cbad"\n
// "bnxw"\n"bwxn"\n
// @lcpr case=end

 */

