import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=645 lang=java
 *
 * [645] 错误的集合
 * 
 * 49/49 cases passed (18 ms)
 * Your runtime beats 7.62 % of java submissions
 * Your memory usage beats 16.93 % of java submissions (43.4 MB)
 */

// @lc code=start
class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int target = - 1;
        int miss =  -1;
        for(var i : nums) {
            var cnt = map.getOrDefault(i, 0);
            if (cnt == 1) target = i;
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(int i = 1; i <= n; i++) {
            if (!map.containsKey(i)) {
                miss = i;
                break;
            }
        }
        return new int[]{target, miss};
    }
}
// @lc code=end

