/*
 * @lc app=leetcode.cn id=179 lang=java
 * @lcpr version=21909
 *
 * [179] 最大数
 * 
 * 231/231 cases passed (9 ms)
 * Your runtime beats 10.13 % of java submissions
 * Your memory usage beats 15.33 % of java submissions (42.2 MB)
 */

// @lc code=start

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String largestNumber(int[] nums) {
        var ans = Arrays.stream(nums)
            .mapToObj(v -> v + "")
            .sorted((b, a) -> (a+b).compareTo(b+a))
            .collect(Collectors.joining());
        if (ans.charAt(0) == '0') return "0";
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [10,2]\n
// [0,0]\n
// [10,2,999,63456,321,564,34543213,53445,453432346,23423]\n
// @lcpr case=end

// @lcpr case=start
// [3,30,34,5,9]\n
// @lcpr case=end

 */

