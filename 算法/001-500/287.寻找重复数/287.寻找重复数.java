import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=287 lang=java
 *
 * [287] 寻找重复数
 * 
 * 58/58 cases passed (23 ms)
 * Your runtime beats 33.96 % of java submissions
 * Your memory usage beats 97.95 % of java submissions (57.3 MB)
 */

// @lc code=start
class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(var i : nums) {
            if (set.contains(i)) return i;
            set.add(i);
        }
        return -1;
    }
}
// @lc code=end

