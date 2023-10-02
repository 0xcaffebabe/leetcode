/*
 * @lc app=leetcode.cn id=2864 lang=java
 * @lcpr version=
 *
 * [2864] 最大二进制奇数
 * 
 * 985/985 cases passed (2 ms)
 * Your runtime beats 59.66 % of java submissions
 * Your memory usage beats 97.29 % of java submissions (40.9 MB)
 */

// @lc code=start
class Solution {
    public String maximumOddBinaryNumber(String s) {
        var arr = s.toCharArray();
        int cnt1 = 0;
        int cnt0 = 0;
        for(var c: arr) if (c == '1') cnt1++;
        cnt0 = arr.length - cnt1;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < cnt1 - 1; i++) 
            sb.append("1");
        
        for(int i = 0; i < cnt0; i++)
            sb.append("0");
        
        sb.append("1");
        return sb.toString();
    }
}
// @lc code=end



/*
// @lcpr case=start
// "010"\n
// @lcpr case=end

// @lcpr case=start
// "0101"\n
// "10000000000"\n
// "100000000001"\n
// "10000010000"\n
// "1"\n
// @lcpr case=end

 */

