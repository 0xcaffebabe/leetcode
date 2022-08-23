import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=1925 lang=java
 *
 * [1925] 统计平方和三元组的数目
 * 
 * 91/91 cases passed (17 ms)
 * Your runtime beats 68.35 % of java submissions
 * Your memory usage beats 61.28 % of java submissions (38.4 MB)
 */

// @lc code=start
class Solution {
    public int countTriples(int n) {
        int ans = 0;
        for(int a = 1; a <= n; a++) {
            for(int b = 1; b <= n; b++) {
                int c = (int) Math.sqrt(a*a + b*b + 1.0);
                if (c > n) continue;
                if (c <= n && c * c == a*a + b*b) ans++;
            }
        }
        return ans;
    }
}
// @lc code=end

