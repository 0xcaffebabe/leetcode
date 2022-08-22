import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1624 lang=java
 *
 * [1624] 两个相同字符之间的最长子字符串
 * 
 * 54/54 cases passed (2 ms)
 * Your runtime beats 40.71 % of java submissions
 * Your memory usage beats 31.73 % of java submissions (39.5 MB)
 */

// @lc code=start
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int ans = -1;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.putIfAbsent(c, i);
            ans = Math.max(ans, i - map.get(c) - 1);
        }
        return ans;
    }
}
// @lc code=end

