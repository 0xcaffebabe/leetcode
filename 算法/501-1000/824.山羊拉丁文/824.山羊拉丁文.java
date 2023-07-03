/*
 * @lc app=leetcode.cn id=824 lang=java
 * @lcpr version=21909
 *
 * [824] 山羊拉丁文
 * 
 * 99/99 cases passed (6 ms)
 * Your runtime beats 32.9 % of java submissions
 * Your memory usage beats 39.41 % of java submissions (40.1 MB)
 */

// @lc code=start
class Solution {
    public String toGoatLatin(String sentence) {
        String[] split = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int index = 0; index < split.length; index++) {
            var i = split[index];
            char c = i.charAt(0);
            char cc = i.charAt(0);
            if (c < 97) c += 32;

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') sb.append(i + "ma");
            else sb.append(i.substring(1) + cc + "ma");

            for(int j = 0; j <= index; j++) sb.append("a");
            if (index != split.length - 1) sb.append(" ");
        }
        return sb.toString();
    }
}
// @lc code=end



/*
// @lcpr case=start
// "I speak Goat Latin"\n
// "I"\n
// "s"\n
// @lcpr case=end

// @lcpr case=start
// "The quick brown fox jumped over the lazy dog"\n
// @lcpr case=end

 */

