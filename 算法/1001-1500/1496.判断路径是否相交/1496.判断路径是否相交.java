import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=1496 lang=java
 *
 * [1496] 判断路径是否相交
 * 
 * 81/81 cases passed (1 ms)
 * Your runtime beats 72.5 % of java submissions
 * Your memory usage beats 41.25 % of java submissions (40.1 MB)
 */

// @lc code=start
class Solution {
    public boolean isPathCrossing(String path) {
        Set<Integer> set = new HashSet<>();
        int x = 0;
        int y = 0;
        set.add(hash(x, y));

        for(var c: path.toCharArray()) {
            if (c == 'N') y++;
            if (c == 'S') y--;
            if (c == 'E') x++;
            if (c == 'W') x--;
            if (set.contains(hash(x, y))) return true;
            else set.add(hash(x, y));
        }
        return false;
    }

    int hash(int x, int y) {
        return x * 20001 + y;
    }
}
// @lc code=end

