/*
 * @lc app=leetcode.cn id=1576 lang=java
 *
 * [1576] 替换所有的问号
 * 
 * 776/776 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 99.65 % of java submissions (40.9 MB)
 */

// @lc code=start
class Solution {
    public String modifyString(String s) {
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (c != '?') continue;
            for(char j = 'a'; j <= 'c'; j++) {
                if ((i > 0 && j == arr[i - 1]) || (i < arr.length - 1 && arr[i+1] == j)) continue;
                arr[i] = j;
                break;
            }
        }
        return new String(arr);
    }
}
// @lc code=end

