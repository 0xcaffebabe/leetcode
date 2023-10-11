/*
 * @lc app=leetcode.cn id=2895 lang=java
 * @lcpr version=
 *
 * [2895] 最小处理时间
 * 
 * 716/716 cases passed (75 ms)
 * Your runtime beats 49.94 % of java submissions
 * Your memory usage beats 36.26 % of java submissions (56.2 MB)
 */

// @lc code=start

import java.util.Collections;
import java.util.List;

class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(processorTime);
        Collections.sort(tasks);
        int ans = 0;
        for(int i = 0; i < processorTime.size(); i ++) 
            ans = Math.max(processorTime.get(i) + tasks.get(tasks.size() - 1 - (i * 4)), ans);
        
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [8,10]\n[2,2,3,1,8,7,4,5]\n
// @lcpr case=end

// @lcpr case=start
// [10,20]\n[2,3,1,2,5,8,4,3]\n
// @lcpr case=end

 */

