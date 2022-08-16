import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=56 lang=java
 *
 * [56] 合并区间
 * 
 * 170/170 cases passed (7 ms)
 * Your runtime beats 66.84 % of java submissions
 * Your memory usage beats 75.9 % of java submissions (46.1 MB)
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        for(var i : intervals) list.add(i);

        Collections.sort(list, (a, b) -> a[0] - b[0]);

        LinkedList<int[]> ans = new LinkedList<>();
        for(var i: list) {
            int left = i[0]; int right = i[1];
            // 如果之前的右区间小于当前的左区间 那就代表现在开启了一个新区间
            // 否则证明当前区间可以跟上一个区间合并 合并的规则就是左区间取最小 右区间取最大
            // 以上都建立在已根据左区间排序的情况下
            if (ans.size() == 0 || ans.getLast()[1] < left) {
                ans.add(new int[]{left, right});
            }else {
                ans.getLast()[1] = Math.max(ans.getLast()[1], right);
            }
        }
        return ans.toArray(new int[][]{});
    }
}
// @lc code=end

