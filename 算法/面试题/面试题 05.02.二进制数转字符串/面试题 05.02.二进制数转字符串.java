/*
 * @lc app=leetcode.cn id=面试题 05.02 lang=java
 * @lcpr version=
 *
 * [面试题 05.02] 二进制数转字符串
 * 
 * 33/33 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 31.8 % of java submissions (38.8 MB)
 */

// @lc code=start
class Solution {
    public String printBin(double num) {
        StringBuilder sb = new StringBuilder("0.");
        while(num > 0d) {
            num *= 2;
            if (num >= 1) {
                sb.append("1");
                num -= 1d;
            }
            else sb.append("0");
            if (sb.length() > 34) return "ERROR";
        }
        return sb.toString();
    }
}
// @lc code=end



/*
// @lcpr case=start
// 0.625\n
// 0.5\n 0.25\n 0.125\n 0.0625\n 0.03125\n 0.015625\n 0.0078125\n
// 0.2868311060592532
// @lcpr case=end

// @lcpr case=start
// 0.1\n
// @lcpr case=end

 */

