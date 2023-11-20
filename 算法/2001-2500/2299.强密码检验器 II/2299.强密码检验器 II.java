/*
 * @lc app=leetcode.cn id=2299 lang=java
 * @lcpr version=
 *
 * [2299] 强密码检验器 II
 * 
 * 148/148 cases passed (1 ms)
 * Your runtime beats 85.84 % of java submissions
 * Your memory usage beats 10.62 % of java submissions (39.9 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if (password.length() < 8) return false;
        boolean lower = false;
        for(var c: password.toCharArray()) if (c >= 'a' && c <= 'z') lower = true;
        boolean upper = false;
        for(var c: password.toCharArray()) if (c >= 'A' && c <= 'Z') upper = true;
        boolean digital = false;
        for(var c: password.toCharArray()) if (c >= '0' && c <= '9') digital = true;
        boolean special = false;
        char[] specialArr = "!@#$%^&*()-+".toCharArray();
        for(var c: password.toCharArray()) {
            for(var cc : specialArr) if (cc == c) special = true;
        }
        boolean duplicate = false;
        for(int i = 0; i < password.length() - 1; i++) {
            if (password.charAt(i) == password.charAt(i + 1)) duplicate = true;
        }
        // System.out.println(lower + "|" + upper + "|" + digital +"|"+ special +"|"+ !duplicate);
        return lower && upper && digital && special && !duplicate;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "0Aa!a!a!"
// @lcpr case=end

// @lcpr case=start
// "IloveLe3tcode!"\n
// @lcpr case=end

// @lcpr case=start
// "Me+You--IsMyDream"\n
// @lcpr case=end

// @lcpr case=start
// "1aB!"\n
// @lcpr case=end

 */

