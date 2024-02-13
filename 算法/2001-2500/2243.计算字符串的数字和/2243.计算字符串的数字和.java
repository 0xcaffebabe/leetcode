/*
 * @lc app=leetcode.cn id=2243 lang=java
 * @lcpr version=
 *
 * [2243] 计算字符串的数字和
 * 
 * 121/121 cases passed (1 ms)
 * Your runtime beats 67.23 % of java submissions
 * Your memory usage beats 27.73 % of java submissions (40.6 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String digitSum(String s, int k) {
        while(s.length() > k) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < s.length(); i += k) {
                int sum = 0;
                for(int j = i; j < i + k && j < s.length(); j++) {
                    sum += s.charAt(j) - '0';
                }
                sb.append(sum);
            }
            s = sb.toString();
        }
        return s;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "11111222223"\n3\n
// @lcpr case=end

// @lcpr case=start
// "00000000"\n3\n
// "11"\n2\n
// "1"\n2\n
// @lcpr case=end

 */

