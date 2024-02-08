/*
 * @lc app=leetcode.cn id=2913 lang=java
 * @lcpr version=
 *
 * [2913] 子数组不同元素数目的平方和 I
 * 
 * 707/707 cases passed (138 ms)
 * Your runtime beats 9.86 % of java submissions
 * Your memory usage beats 5.06 % of java submissions (44 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int sumCounts(List<Integer> nums) {
        long ans = 0;
        for(int i = 1; i <= nums.size(); i++) {
            for(int j = 0; j < nums.size(); j ++) {
                // System.out.println(i + "," + j);
                Collection<Integer> set = new HashSet<>();
                if (j + i > nums.size()) continue;
                for(int k = j; k < j + i; k++) set.add(nums.get(k));
                // System.out.println(set);
                ans += set.size() * set.size();
            }
        }
        return (int) (ans % (Math.pow(10, 9) + 7));
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,1]\n
// @lcpr case=end

// @lcpr case=start
// [2,2]\n
// [2]\n
// [1,2,3]\n
// [1,2,3,4,5,6,7,8,9]\n
// @lcpr case=end

 */

