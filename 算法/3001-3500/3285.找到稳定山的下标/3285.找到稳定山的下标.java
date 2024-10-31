/*
 * @lc app=leetcode.cn id=3285 lang=java
 * @lcpr version=
 *
 * [3285] 找到稳定山的下标
 * 
 * 805/805 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
* Your memory usage beats 68.16 % of java submissions (43.6 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 1; i < height.length; i++)
            if (height[i - 1] > threshold) ans.add(i);
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4,5]\n2\n
// @lcpr case=end

// @lcpr case=start
// [10,1,10,1,10]\n3\n
// @lcpr case=end

// @lcpr case=start
// [10,1,10,1,10]\n10\n
// @lcpr case=end

 */

