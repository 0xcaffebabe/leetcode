import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=986 lang=java
 *
 * [986] 区间列表的交集
 * 
 * 85/85 cases passed (3 ms)
 * Your runtime beats 91.38 % of java submissions
 * Your memory usage beats 53.81 % of java submissions (42.2 MB)
 */

// @lc code=start
class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {

        int p = 0;
        int q = 0;
        List<int[]> list = new ArrayList<>();
        while(p < firstList.length && q < secondList.length) {
            var a = firstList[p];
            var b = secondList[q];
            if (a[0] > b[1]) q++;
            else if (b[0] > a[1]) p++;
            else {
                list.add(new int[]{Math.max(a[0], b[0]) ,Math.min(a[1], b[1])});
                // System.out.println(Math.max(a[0], b[0]) + "|" + Math.min(a[1], b[1]));
                if (a[1] < b[1]) p++;
                else q++;
            }
        }
        int[][] ans = new int[list.size()][2];
        for(int i = 0; i < list.size(); i++) ans[i] = list.get(i);
        return ans;
    }
}
// @lc code=end

