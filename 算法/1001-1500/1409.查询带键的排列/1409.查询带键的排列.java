/*
 * @lc app=leetcode.cn id=1409 lang=java
 * @lcpr version=
 *
 * [1409] 查询带键的排列
 * 
 * 53/53 cases passed (8 ms)
 * Your runtime beats 36.27 % of java submissions
 * Your memory usage beats 42.16 % of java submissions (40.7 MB)
 */

// @lc code=start

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] processQueries(int[] queries, int m) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= m; i++) 
            list.add(i);
        int[] ans = new int[queries.length];
        for(int i = 0; i < queries.length; i++) {
            ans[i] = list.indexOf(queries[i]);
            list.remove(ans[i]);
            list.add(0, queries[i]);
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,1,2,1]\n5\n
// @lcpr case=end

// @lcpr case=start
// [4,1,2,2]\n4\n
// @lcpr case=end

// @lcpr case=start
// [7,5,5,8,3]\n8\n
// [1]\n1\n
// @lcpr case=end

 */

