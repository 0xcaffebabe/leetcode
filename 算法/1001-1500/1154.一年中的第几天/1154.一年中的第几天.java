/*
 * @lc app=leetcode.cn id=1154 lang=java
 * @lcpr version=21912
 *
 * [1154] 一年中的第几天
 * 
 * 10958/10958 cases passed (11 ms)
 * Your runtime beats 21.83 % of java submissions
 * Your memory usage beats 40.1 % of java submissions (43.1 MB)
 */

// @lc code=start
class Solution {
    public int dayOfYear(String date) {
        int[] m = {31,28,31,30,31,30,31,31,30,31,30,31};
        var split = date.split("-");
        var year = Integer.parseInt(split[0]);
        var month = Integer.parseInt(split[1]);
        var day = Integer.parseInt(split[2]);
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) m[1] = 29;
        if (month == 1) return day;
        int sum = 0;
        for(int i = 0; i <= month - 2; i++) {
            sum += m[i];
        }
        return sum + day;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "2019-01-09"\n
// "2000-12-04"\n
// @lcpr case=end

// @lcpr case=start
// "2019-02-10"\n
// "1900-01-01"\n
// "2019-12-31"\n
// "2004-12-31"\n
// @lcpr case=end

 */

