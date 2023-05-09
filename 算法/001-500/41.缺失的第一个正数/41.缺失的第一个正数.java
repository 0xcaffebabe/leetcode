/*
 * @lc app=leetcode.cn id=41 lang=java
 * @lcpr version=21907
 *
 * [41] 缺失的第一个正数
 * 
 * 175/175 cases passed (9 ms)
 * Your runtime beats 15.35 % of java submissions
 * Your memory usage beats 5 % of java submissions (60.9 MB)
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(var i : nums) set.add(i);

        for(int i = 1; i <= nums.length; i++) 
            if (!set.contains(i)) return i;
        
        return nums.length + 1;
    }
}
// @lc code=end



/*

// @lcpr case=start
// [1,2]\n
// @lcpr case=end

// @lcpr case=start
// [-1,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,0]\n
// @lcpr case=end

// @lcpr case=start
// [3,4,-1,1]\n
// @lcpr case=end

// @lcpr case=start
// [7,8,9,11,12]\n
// @lcpr case=end

 */

