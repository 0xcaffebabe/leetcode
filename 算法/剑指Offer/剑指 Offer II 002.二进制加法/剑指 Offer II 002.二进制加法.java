/*
 * @lc app=leetcode.cn id=剑指 Offer II 002 lang=java
 * @lcpr version=21909
 *
 * [剑指 Offer II 002] 二进制加法
 * 
 * 294/294 cases passed (1 ms)
 * Your runtime beats 99.64 % of java submissions
 * Your memory usage beats 61.67 % of java submissions (40.2 MB)
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int p = a.length() - 1;
        int q = b.length() - 1;
        int adi = 0;
        while(p >= 0 && q >= 0) {
            int i1 = a.charAt(p) - '0';
            int i2 = b.charAt(q) - '0';
            if (i1 + i2 + adi >= 2) {
                sb.append(i1 + i2 + adi - 2);
                adi = 1;
            } else {
                sb.append(i1 + i2 + adi);
                adi = 0;
            }


            p--;
            q--;
        }
        while(p >= 0) {
            int i = a.charAt(p) - '0';
            if (i + adi >= 2) {
                sb.append(i + adi - 2);
                adi = 1;
            } else {
                sb.append(i + adi);
                adi = 0;
            }
            p--;
        }
        while(q >= 0) {
            int i = b.charAt(q) - '0';
            if (i + adi >= 2) {
                sb.append(i + adi - 2);
                adi = 1;
            } else {
                sb.append(i + adi);
                adi = 0;
            }
            q--;
        }
        if (adi == 1) sb.append("1");
        // System.out.println(sb);
        return sb.reverse().toString();
    }
}
// @lc code=end



/*
// @lcpr case=start
// "11"\n"10"\n
// @lcpr case=end

// @lcpr case=start
// "1010"\n"1011"\n
// @lcpr case=end

 */

