/*
 * @lc app=leetcode.cn id=2363 lang=java
 * @lcpr version=
 *
 * [2363] 合并相似的物品
 * 
 * 49/49 cases passed (3 ms)
 * Your runtime beats 95.57 % of java submissions
 * Your memory usage beats 64.53 % of java submissions (43.4 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        int[] m = new int[1001];
        for(var i : items1)
            m[i[0]] += i[1];
        for(var i : items2)
            m[i[0]] += i[1];
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < m.length; i++)
            if (m[i] != 0) ans.add(Arrays.asList(i, m[i]));
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,1],[4,5],[3,8]]\n[[3,1],[1,5]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,1],[3,2],[2,3]]\n[[2,1],[3,2],[1,3]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,3],[2,2]]\n[[7,1],[2,2],[1,4]]\n
// @lcpr case=end

 */

