/*
 * @lc app=leetcode.cn id=2869 lang=java
 * @lcpr version=
 *
 * [2869] 收集元素的最少操作次数
 * 
 * 619/619 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 41.06 % of java submissions (41 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.List;

class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int ans = 0;
        boolean[] m = new boolean[51];
        int cnt = 0;
        for(int index = nums.size() - 1; index >= 0; index--) {
            if (cnt == k) break;
            int i = nums.get(index);
            if (!m[i]) {
                m[i] = true;
                if (i <= k) cnt++;
            }
            ans++;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,1,5,4,2]\n2\n
// @lcpr case=end

// @lcpr case=start
// [3,1,5,4,2]\n5\n
// [3,1,5,4,2]\n1\n
// [3,1,5,1,2]\n2\n
// [3,1,5,1,2]\n1\n
// @lcpr case=end

// @lcpr case=start
// [3,2,5,3,1]\n3\n
// @lcpr case=end

 */

