import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=696 lang=java
 *
 * [696] 计数二进制子串
 * 
 * 91/91 cases passed (10 ms)
 * Your runtime beats 65.25 % of java submissions
 * Your memory usage beats 89.56 % of java submissions (41.6 MB)
 */

// @lc code=start
class Solution {
    public int countBinarySubstrings(String s) {
        int[] map = new int[s.length()];
        Arrays.fill(map, -1);
        int pos = 0;
        int prev = s.charAt(0);
        map[pos] = 1;
        for(int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != prev) {
                prev = s.charAt(i);
                map[++pos] = 0;
            }
            map[pos]++;
        }
        int ans = 0;
        // System.out.println(Arrays.toString(map));
        for(int i = 0; i < map.length - 1; i++) {
            if (map[i + 1] == -1) break;
            ans += Math.min(map[i], map[i+1]);
        }
        return ans;
    }
}
// @lc code=end

