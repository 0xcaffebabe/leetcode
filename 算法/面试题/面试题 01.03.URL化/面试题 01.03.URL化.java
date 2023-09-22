/*
 * @lc app=leetcode.cn id=面试题 01.03 lang=java
 * @lcpr version=
 *
 * [面试题 01.03] URL化
 * 
 * 32/32 cases passed (8 ms)
 * Your runtime beats 91.77 % of java submissions
 * Your memory usage beats 56.15 % of java submissions (52.1 MB)
 */

// @lc code=start
class Solution {
    public String replaceSpaces(String s, int length) {
        char[] arr = s.toCharArray();
        int p = length - 1;
        int q = s.length() - 1;
        int cnt = 0;
        while(p >= 0) {
            if (arr[p] == ' ') {
                arr[q--] = '0';
                arr[q--] = '2';
                arr[q--] = '%';
                cnt += 3;
            } else {
                arr[q--] = arr[p];
                cnt++;
            }
            p--;
        }
        return new String(arr, q + 1, cnt);
    }
}
// @lc code=end



/*
// @lcpr case=start
// "Mr John Smith    "\n 13\n
// @lcpr case=end

// @lcpr case=start
// "               "\n 5\n
// @lcpr case=end

 */

