import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=2357 lang=java
 *
 * [2357] 使数组中所有元素都等于零
 * 
 * 95/95 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 27.14 % of java submissions (39.3 MB)
 */

// @lc code=start
class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(var i : nums) if (i != 0) set.add(i);
        return set.size();
    }
}
// @lc code=end

