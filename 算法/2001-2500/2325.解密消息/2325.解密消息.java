/*
 * @lc app=leetcode.cn id=2325 lang=java
 *
 * [2325] 解密消息
 * 
 * 69/69 cases passed (3 ms)
 * Your runtime beats 87.2 % of java submissions
 * Your memory usage beats 45.19 % of java submissions (41.4 MB)
 */

// @lc code=start
class Solution {
    public String decodeMessage(String key, String message) {
        char[] map = new char[26];
        char pos = 97;
        for(int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            if (c == ' ') continue;
            if (map[c - 97] != 0) continue;
            map[c - 97] = pos++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c == ' ') sb.append(c);
            else sb.append(map[c - 97]);
        }
        return sb.toString();
    }
}
// @lc code=end

