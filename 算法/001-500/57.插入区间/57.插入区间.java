/*
 * @lc app=leetcode.cn id=57 lang=java
 * @lcpr version=21909
 *
 * [57] 插入区间
 * 
 * 156/156 cases passed (3 ms)
 * Your runtime beats 13.16 % of java submissions
 * Your memory usage beats 49.79 % of java submissions (43 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        for(var i : intervals) list.add(i);
        list.add(newInterval);

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



/*
// @lcpr case=start
// [[1,3],[6,9]]\n[2,5]\n
// @lcpr case=end

// @lcpr case=start
// [[1,2],[3,5],[6,7],[8,10],[12,16]]\n[4,8]\n
// @lcpr case=end

// @lcpr case=start
// []\n[5,7]\n
// @lcpr case=end

// @lcpr case=start
// [[1,5]]\n[2,3]\n
// @lcpr case=end

// @lcpr case=start
// [[1,5]]\n[2,7]\n
// @lcpr case=end

 */

