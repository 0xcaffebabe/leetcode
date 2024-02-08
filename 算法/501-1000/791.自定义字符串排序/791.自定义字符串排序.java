/*
 * @lc app=leetcode.cn id=791 lang=java
 * @lcpr version=
 *
 * [791] 自定义字符串排序
 * 
 * 39/39 cases passed (3 ms)
 * Your runtime beats 60.58 % of java submissions
 * Your memory usage beats 7.37 % of java submissions (40.9 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {

    public String customSortString(String order, String s) {
        int[] m = new int[128];
        Arrays.fill(m, Integer.MAX_VALUE);
        for (int i = 0; i < order.length(); i++) 
            m[order.charAt(i)] = i;
        char[] charArray = s.toCharArray();
        Character[] arr = new Character[charArray.length];
        for (int i = 0; i < charArray.length; i++)
            arr[i] = charArray[i];
        Arrays.sort(arr, (a, b) -> m[a] - m[b]);
        StringBuilder sb = new StringBuilder();
        for (Character c : arr)
            sb.append(c);
        return sb.toString();
    }
}
// @lc code=end



/*
// @lcpr case=start
// "cba"\n"abcd"\n
// @lcpr case=end

// @lcpr case=start
// "cbafg"\n"abcd"\n
// "a"\n"s"\n
// "a"\n"a"\n
// @lcpr case=end

 */

