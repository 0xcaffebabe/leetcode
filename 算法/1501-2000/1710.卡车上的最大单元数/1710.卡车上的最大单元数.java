/*
 * @lc app=leetcode.cn id=1710 lang=java
 * @lcpr version=
 *
 * [1710] 卡车上的最大单元数
 * 
 * 76/76 cases passed (8 ms)
 * Your runtime beats 64.52 % of java submissions
 * Your memory usage beats 57.26 % of java submissions (42.6 MB)
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int maximumUnits(int[][] box, int n) {
        Arrays.sort(box, (a, b) -> b[1] - a[1]);
        int ans = 0;
        int i = 0;
        while(n > 0) {
            if (i >= box.length) break;
            var size = Math.min(box[i][0], n);
            ans += size * box[i][1];
            n -= size;
            i++;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,3],[2,2],[3,1]]\n4\n
// @lcpr case=end

// @lcpr case=start
// [[5,10],[2,5],[4,7],[3,9]]\n10\n
// [[1,10],[2,5],[4,7],[3,9]]\n10\n
// [[1,3],[5,5],[2,5],[4,2],[4,1],[3,1],[2,2],[1,3],[2,5],[3,2]]\n35\n
// @lcpr case=end

 */

