/*
 * @lc app=leetcode.cn id=1170 lang=java
 * @lcpr version=
 *
 * [1170] 比较字符串最小字母出现频次
 * 
 * 37/37 cases passed (17 ms)
 * Your runtime beats 16.6 % of java submissions
 * Your memory usage beats 39.67 % of java submissions (43.9 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] fs = new int[words.length];
        for(int i = 0; i < words.length; i++) fs[i] = f(words[i]);
        Arrays.sort(fs);
        // System.out.println(Arrays.toString(fs));

        int[] ans = new int[queries.length];
        for(int i = 0; i < queries.length; i++) {
            int f = f(queries[i]);
            for(var j: fs) {
                if (j > f) ans[i] ++;
            }
        }
        return ans;
    }

    int f(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        int v = 0;
        for(var c: arr)
            if (c == arr[0]) v++;
        return v;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["cbd"]\n["zaaaz"]\n
// @lcpr case=end

// @lcpr case=start
// ["bbb","cc"]\n["a","aa","aaa","aaaa"]\n
// @lcpr case=end

 */

