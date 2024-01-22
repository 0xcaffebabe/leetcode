/*
 * @lc app=leetcode.cn id=670 lang=java
 * @lcpr version=
 *
 * [670] 最大交换
 * 
 * 112/112 cases passed (1 ms)
 * Your runtime beats 43.93 % of java submissions
 * Your memory usage beats 5.2 % of java submissions (39.6 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int maximumSwap(int num) {
        int ans = num;
        String s = String.valueOf(num);
        for(int i = 0; i < s.length(); i++) {
            for(int j = 1; j < s.length(); j++) {
                if (i == j) continue;
                StringBuilder sb = new StringBuilder(s);
                var c = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, c);
                ans = Math.max(ans, Integer.parseInt(sb.toString()));
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 2736\n
// 1234567\n
// 0\n
// 1\n
// 2\n
// 100\n
// 10\n
// 99\n
// @lcpr case=end

// @lcpr case=start
// 9973\n
// @lcpr case=end

 */

