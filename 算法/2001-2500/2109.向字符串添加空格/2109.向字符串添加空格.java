/*
 * @lc app=leetcode.cn id=2109 lang=java
 * @lcpr version=21907
 *
 * [2109] 向字符串添加空格
 * 
 * 66/66 cases passed (24 ms)
 * Your runtime beats 65.98 % of java submissions
 * Your memory usage beats 96.91 % of java submissions (71.4 MB)
 */

// @lc code=start
class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        int cnt = 0;
        for(int i = 0; i < arr.length; i++) {
            if (cnt < spaces.length && spaces[cnt] == i) {
                sb.append(" ");
                cnt++;
            }
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}
// @lc code=end



/*
// @lcpr case=start
// "LeetcodeHelpsMeLearn"\n[8,13,15]\n
// @lcpr case=end

// @lcpr case=start
// "icodeinpython"\n[1,5,7,9]\n
// @lcpr case=end

// @lcpr case=start
// "spacing"\n[0,1,2,3,4,5,6]\n
// @lcpr case=end

// @lcpr case=start
// "a"\n[0]\n
// @lcpr case=end

 */

