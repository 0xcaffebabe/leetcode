/*
 * @lc app=leetcode.cn id=2283 lang=java
 *
 * [2283] 判断一个数的数字计数是否等于数位的值
 * 
 * 433/433 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 82.01 % of java submissions (39.5 MB)
 */

// @lc code=start
class Solution {
    public boolean digitCount(String num) {
        for(int i = 0; i < num.length(); i++) {
            // 数字i在num出现的次数
            int tmp = 0;
            for(int j = 0; j < num.length(); j++) {
                if (num.charAt(j) - 48 == i) tmp++;
            }
            if (num.charAt(i) - 48 != tmp) return false;
        }
        return true;
    }
}
// @lc code=end

