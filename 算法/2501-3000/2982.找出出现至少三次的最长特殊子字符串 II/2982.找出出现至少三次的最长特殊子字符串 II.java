/*
 * @lc app=leetcode.cn id=2982 lang=java
 * @lcpr version=
 *
 * [2982] 找出出现至少三次的最长特殊子字符串 II
 * 
 * 906/906 cases passed (88 ms)
 * Your runtime beats 37.04 % of java submissions
 * Your memory usage beats 37.04 % of java submissions (47.8 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maximumLength(String s) {
        Map<Character, int[]> map = new HashMap<>();
        map.computeIfAbsent(s.charAt(0), v -> new int[3])
            [0] = 1;
        int cont = 1;
        for(int i = 1; i < s.length(); i++) {
            var arr = map.computeIfAbsent(s.charAt(i), v -> new int[3]);
            if (s.charAt(i) == s.charAt(i - 1)) cont++;
            else cont = 1;
            insert(arr, cont);
            // System.out.println(Arrays.toString(arr));
        }
        int ans = -1;
        for(var enr: map.entrySet()) {
            int v = enr.getValue()[2];
            if (v == 0) continue;
            ans = Math.max(ans, v);
        }
        return ans;
    }

    void insert(int[] arr, int v) {
        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        if (v > a) {
            c = b;
            b = a;
            a = v;
        } else if (v > b) {
            c = b;
            b = v;
        } else if (v > c) {
            c = v;
        }
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "aaaa"\n
// "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"\n
// "abababababa"\n
// "aacaacaac"\n
// @lcpr case=end

// @lcpr case=start
// "abcdef"\n
// @lcpr case=end

// @lcpr case=start
// "abcaba"\n
// @lcpr case=end

 */

