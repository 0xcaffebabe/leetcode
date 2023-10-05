/*
 * @lc app=leetcode.cn id=1237 lang=java
 * @lcpr version=
 *
 * [1237] 找出给定方程的正整数解
 * 
 * 45/45 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 68.35 % of java submissions (39.2 MB)
 */

// @lc code=start
/*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 * class CustomFunction {
 *     // Returns f(x, y) for any given positive integers x and y.
 *     // Note that f(x, y) is increasing with respect to both x and y.
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
 *     public int f(int x, int y);
 * };
 */

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public List<List<Integer>> findSolution(CustomFunction func, int z) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1; i <= z; i++) {
            for(int j = 1; j <= z; j++) {
                var ret = func.f(i,j);
                if (ret == z)
                    ans.add(Arrays.asList(i, j));
                if (ret > z) break;
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 1\n5\n
// 2\n5\n
// 3\n5\n
// 4\n5\n
// 5\n5\n
// 6\n5\n
// 7\n5\n
// 8\n5\n
// 9\n5\n
// @lcpr case=end

// @lcpr case=start
// 2\n5\n
// @lcpr case=end

 */

