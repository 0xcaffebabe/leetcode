import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=229 lang=java
 *
 * [229] 多数元素 II
 * 
 * 83/83 cases passed (11 ms)
 * Your runtime beats 30.12 % of java submissions
 * Your memory usage beats 83.81 % of java submissions (44.6 MB)
 */

// @lc code=start
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length / 3;
        Map<Integer, Integer> map = new HashMap<>();
        for(var i : nums) map.put(i, map.getOrDefault(i, 0) + 1);
        List<Integer> ans = new ArrayList<>();
        for(var enr: map.entrySet()) if (enr.getValue() > n) ans.add(enr.getKey());
        return ans;
    }
}
// @lc code=end

