/*
 * @lc app=leetcode.cn id=860 lang=java
 *
 * [860] 柠檬水找零
 * 
 * 60/60 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 91.9 % of java submissions (52.1 MB)
 */

// @lc code=start
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for(var i : bills) {
            if (i == 5) {
                five++;
            }else if (i == 10) {
                if (five < 1)  return false;
                five--;
                ten++;
            }else if (i == 20) {
                if (ten >= 1 && five >= 1) {
                    ten--;
                    five--;
                }else if (five >= 3) {
                    five -=3;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
// @lc code=end

