/*
 * @lc app=leetcode.cn id=2169 lang=java
 *
 * [2169] 得到 0 的操作数
 * 
 * 161/161 cases passed (1 ms)
 * Your runtime beats 87.1 % of java submissions
 * Your memory usage beats 94.65 % of java submissions (38.1 MB)
 */

// @lc code=start
class Solution {
    public int countOperations(int num1, int num2) {
        int ans = 0;
        while(num1 != 0 && num2 != 0) {
            if (num1 >= num2) num1-= num2;
            else num2-= num1;
            ans++;
        }
        return ans;
    }
}
// @lc code=end

