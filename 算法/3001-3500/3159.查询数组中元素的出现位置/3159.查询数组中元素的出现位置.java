/*
 * @lc app=leetcode.cn id=3159 lang=java
 * @lcpr version=
 *
 * [3159] 查询数组中元素的出现位置
 * 
 * 527/527 cases passed (6 ms)
 * Your runtime beats 56.8 % of java submissions
 * Your memory usage beats 6.14 % of java submissions (64.4 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> indexs = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == x) indexs.add(i);
        }
        int[] ans = new int[queries.length];
        for(int i = 0; i < queries.length; i++) {
            if (queries[i] > indexs.size()) ans[i] = -1;
            else ans[i] = indexs.get(queries[i] - 1);
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,3,1,7]\n[1,3,2,4]\n1\n
// [1,1,1,1]\n[1,3,2,4]\n1\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3]\n[10]\n5\n
// @lcpr case=end

 */

