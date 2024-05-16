/*
 * @lc app=leetcode.cn id=621 lang=java
 * @lcpr version=
 *
 * [621] 任务调度器
 * 
 * 71/71 cases passed (2 ms)
 * Your runtime beats 79.18 % of java submissions
 * Your memory usage beats 63.45 % of java submissions (44.6 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        for(var i: tasks) count[i - 'A']++;
        Arrays.sort(count);
        int maxCount = 0;
        for(int i = 25; i >= 0; i--) {
            if (count[i] != count[25]) break;
            maxCount++;
        }
        return Math.max((count[25] - 1) * (n + 1) + maxCount, tasks.length);
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["A","A","A","B","B","B"]\n2\n
// @lcpr case=end

// @lcpr case=start
// ["A","A","A","B","B","B"]\n0\n
// @lcpr case=end

// @lcpr case=start
// ["A","A","A","A","A","A","B","C","D","E","F","G"]\n2\n
// @lcpr case=end

 */

