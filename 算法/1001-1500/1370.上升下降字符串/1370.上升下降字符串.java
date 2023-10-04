/*
 * @lc app=leetcode.cn id=1370 lang=java
 * @lcpr version=
 *
 * [1370] 上升下降字符串
 * 
 * 323/323 cases passed (2 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 34.76 % of java submissions (41.4 MB)
 */

// @lc code=start
class Solution {
    public String sortString(String s) {
        StringBuilder sb = new StringBuilder();
        int[] m = new int[26];
        for(var c : s.toCharArray()) m[c - 'a']++;
        int cnt = 0;
        while(true) {
            // 上升
            for(int i = 0; i < 26; i++) {
                if (m[i] > 0) {
                    m[i]--;
                    sb.append((char)(i + 'a'));
                    cnt++;
                }
            }
            // 下降
            for(int i = 25; i >= 0; i--) {
                if (m[i] > 0) {
                    m[i]--;
                    sb.append((char)(i + 'a'));
                    cnt++;
                }
            }
            if (cnt >= s.length()) break;
        }
        return sb.toString();
    }
}
// @lc code=end



/*
// @lcpr case=start
// "aaaabbbbcccc"\n
// @lcpr case=end

// @lcpr case=start
// "rat"\n
// @lcpr case=end

// @lcpr case=start
// "leetcode"\n
// @lcpr case=end

// @lcpr case=start
// "ggggggg"\n
// @lcpr case=end

// @lcpr case=start
// "spo"\n
// @lcpr case=end

 */

