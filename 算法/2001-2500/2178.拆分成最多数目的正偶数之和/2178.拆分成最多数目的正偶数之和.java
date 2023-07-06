/*
 * @lc app=leetcode.cn id=2178 lang=java
 * @lcpr version=21909
 *
 * [2178] 拆分成最多数目的正偶数之和
 * 
 * 56/56 cases passed (13 ms)
 * Your runtime beats 18.37 % of java submissions
 * Your memory usage beats 24.49 % of java submissions (59.1 MB)
 */

// @lc code=start

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        if (finalSum % 2 == 1) return Collections.emptyList();

        LinkedList<Long> ans = new LinkedList<>();
        for(long i = 2; i <= finalSum; i += 2) {
            ans.add(i);
            finalSum -= i;
        }
        if (finalSum != 0) 
            ans.add(ans.removeLast() + finalSum);
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 12\n
// 1\n
// 2\n
// 10000000000\n
// @lcpr case=end

// @lcpr case=start
// 7\n
// @lcpr case=end

// @lcpr case=start
// 28\n
// @lcpr case=end

 */

