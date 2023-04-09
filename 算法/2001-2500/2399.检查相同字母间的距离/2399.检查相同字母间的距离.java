import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=2399 lang=java
 *
 * [2399] 检查相同字母间的距离
 * 
 * 335/335 cases passed (1 ms)
 * Your runtime beats 54.39 % of java submissions
 * Your memory usage beats 48.54 % of java submissions (41.5 MB)
 */

// @lc code=start
class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int[] map = new int[26];
        Arrays.fill(map, -1);
        for(int i = 0; i < s.length(); i++) {
            char c = (char) (s.charAt(i) - 97);
            if (map[c] != -1)  map[c] = i - map[c] - 1;
            else map[c] = i;
        }
        for(int i = 0; i < 26; i++) {
            if (map[i] == -1) continue;
            if (map[i] != distance[i]) return false;
        }
        return true;
    }
}
// @lc code=end

