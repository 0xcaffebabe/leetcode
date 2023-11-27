/*
 * @lc app=leetcode.cn id=973 lang=java
 * @lcpr version=
 *
 * [973] 最接近原点的 K 个点
 * 
 * 87/87 cases passed (34 ms)
 * Your runtime beats 33.87 % of java submissions
 * Your memory usage beats 79.41 % of java submissions (46.3 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points, (a,b) -> {
            return Double.compare(Math.sqrt(a[0] * a[0] + a[1] * a[1])
                , Math.sqrt(b[0] * b[0] + b[1] * b[1]));
        });
        int[][] ans = new int[k][2];
        for(int i = 0; i < k; i++)
            ans[i] = points[i];
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,3],[-2,2]]\n1\n
// @lcpr case=end

// @lcpr case=start
// [[3,3],[5,-1],[-2,4]]\n2\n
// @lcpr case=end

 */

