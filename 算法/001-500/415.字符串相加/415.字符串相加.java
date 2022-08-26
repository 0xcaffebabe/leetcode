/*
 * @lc app=leetcode.cn id=415 lang=java
 *
 * [415] 字符串相加
 * 
 * 317/317 cases passed (3 ms)
 * Your runtime beats 15.41 % of java submissions
 * Your memory usage beats 26.98 % of java submissions (41.7 MB)
 */

// @lc code=start
class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int p = 1;
        int q = 1;
        int adi = 0;
        while(p <= num1.length() && q <= num2.length()) {
            int c1 = num1.charAt(num1.length() - p) - '0';
            int c2 = num2.charAt(num2.length() - q) - '0';
            if (c1 + c2 + adi >= 10) {
                sb.insert(0, c1 + c2 + adi - 10);
                adi = 1;
            } else {
                sb.insert(0, c1 + c2 + adi);
                adi = 0;
            }
            p++;
            q++;
        }
        // System.out.println(adi);
        while(p <= num1.length()) {
            int c1 = num1.charAt(num1.length() - p) - '0';
            if (c1 + adi >= 10) {
                sb.insert(0, c1 + adi - 10);
                adi = 1;
            } else {
                sb.insert(0, c1 + adi);
                adi = 0;
            }
            p++;
        }
        while(q <= num2.length()) {
            int c2 = num2.charAt(num2.length() - q) - '0';
            if (c2 + adi >= 10) {
                sb.insert(0, c2 + adi - 10);
                adi = 1;
            } else {
                sb.insert(0, c2 + adi);
                adi = 0;
            }
            q++;
        }
        if (adi == 1) sb.insert(0, '1');
        return sb.toString();
    }
}
// @lc code=end

