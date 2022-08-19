import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/*
 * @lc app=leetcode.cn id=2248 lang=java
 *
 * [2248] 多个数组求交集
 * 
 * 151/151 cases passed (7 ms)
 * Your runtime beats 12.06 % of java submissions
 * Your memory usage beats 66.53 % of java submissions (41.7 MB)
 */

// @lc code=start
class Solution {
    public List<Integer> intersection(int[][] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(var arr: nums) {
            for(var i: arr) map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer> ans = new ArrayList<>();
        for(var enr : map.entrySet()) {
            if (enr.getValue() >= nums.length) ans.add(enr.getKey());
        }
        return ans;
    }
}
// @lc code=end

