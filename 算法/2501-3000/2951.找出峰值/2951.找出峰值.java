/*
 * @lc app=leetcode.cn id=2951 lang=java
 * @lcpr version=
 *
 * [2951] 找出峰值
 * 
 * 648/648 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 52.29 % of java submissions (42.9 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 1; i < mountain.length - 1; i++) {
            if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1])
                ans.add(i);
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,4,4]\n
// @lcpr case=end

// @lcpr case=start
// [1,4,3,8,5]\n
// @lcpr case=end

 */

