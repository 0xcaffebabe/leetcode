/*
 * @lc app=leetcode.cn id=1945 lang=java
 *
 * [1945] 字符串转化后的各位数字之和
 * 
 * 216/216 cases passed (2 ms)
 * Your runtime beats 46.9 % of java submissions
 * Your memory usage beats 81.4 % of java submissions (39.6 MB)
 */

// @lc code=start
class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(var i : s.toCharArray()) 
            sb.append(i - 'a' + 1);
        int ans = 0;
        for(int i = 0; i < k; i++) {
            ans = 0;
            for(int j = 0; j < sb.length(); j++) 
                ans += sb.charAt(j) - '0';
            sb = new StringBuilder(ans + "");
        }
        return ans;
    }
}
// @lc code=end

