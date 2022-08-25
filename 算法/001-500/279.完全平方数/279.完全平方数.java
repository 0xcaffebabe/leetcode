import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=279 lang=java
 *
 * [279] 完全平方数
 * 
 * 588/588 cases passed (12 ms)
 * Your runtime beats 96.37 % of java submissions
 * Your memory usage beats 14.75 % of java submissions (41.1 MB)
 */

// @lc code=start
class Solution {
    Set<Integer> set = new HashSet<>();
    public int numSquares(int n) {
        generate(n);
        for(int i = 1; i <= n; i++) {
            if (check(n, i)) return i;
        }
        return -1;
    }

    // n 是 数量为 count 的平方数和吗
    boolean check(int n, int count) {
        if (count == 1) return set.contains(n);
        for(var k : set) {
            // 减去某个平方数 剩余的数进行递归检查
            if (check(n - k, count - 1)) return true;
        }
        return false;
    }

    void generate(int n) {
        n = (int) Math.sqrt(n);
        for(int i = 1; i <= n; i++) set.add(i * i);
    }
}
// @lc code=end

