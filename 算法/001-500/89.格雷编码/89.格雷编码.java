/*
 * @lc app=leetcode.cn id=89 lang=java
 * @lcpr version=
 *
 * [89] 格雷编码
 * 
 * 16/16 cases passed (6 ms)
 * Your runtime beats 69.74 % of java submissions
 * Your memory usage beats 52.53 % of java submissions (48 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < Math.pow(2, n); i++) 
            ans.add(i ^ (i / 2));
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 2\n
// 16\n
// 15\n
// @lcpr case=end

// @lcpr case=start
// 1\n
// @lcpr case=end

 */

