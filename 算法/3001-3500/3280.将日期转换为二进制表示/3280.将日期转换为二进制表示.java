/*
 * @lc app=leetcode.cn id=3280 lang=java
 * @lcpr version=
 *
 * [3280] 将日期转换为二进制表示
 * 
 * 503/503 cases passed (8 ms)
 * Your runtime beats 20.01 % of java submissions
 * Your memory usage beats 15.16 % of java submissions (42.2 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String convertDateToBinary(String date) {
        var arr = date.split("-");
        arr[0] = Integer.toBinaryString(Integer.parseInt(arr[0]));
        arr[1] = Integer.toBinaryString(Integer.parseInt(arr[1]));
        arr[2] = Integer.toBinaryString(Integer.parseInt(arr[2]));
        return arr[0] + "-" + arr[1] + "-" + arr[2];
    }
}
// @lc code=end



/*
// @lcpr case=start
// "2080-02-29"\n
// "1999-02-17"\n
// @lcpr case=end

// @lcpr case=start
// "1900-01-01"\n
// @lcpr case=end

 */

