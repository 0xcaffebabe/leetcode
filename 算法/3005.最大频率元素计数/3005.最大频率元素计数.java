/*
 * @lc app=leetcode.cn id=3005 lang=java
 * @lcpr version=
 *
 * [3005] 最大频率元素计数
 * 
 * 623/623 cases passed (3 ms)
 * Your runtime beats 17.11 % of java submissions
 * Your memory usage beats 20.53 % of java submissions (41.3 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] m = new int[101];
        for(var i : nums) m[i]++;
        var max = Arrays.stream(m).max().getAsInt();
        int ans = 0;
        for(int i = 1; i < m.length; i++) {
            if (m[i] == max) ans += max;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,2,3,1,4]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4,5]\n
// [1]\n
// [1,2]\n
// @lcpr case=end

 */

