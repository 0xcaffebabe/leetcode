import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1636 lang=java
 *
 * [1636] 按照频率将数组升序排序
 * 
 * 180/180 cases passed (8 ms)
 * Your runtime beats 23.32 % of java submissions
 * Your memory usage beats 73.57 % of java submissions (41.5 MB)
 */

// @lc code=start
class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(var i : nums) map.put(i, map.getOrDefault(i, 0) + 1);
        List<Integer> list = new ArrayList<>();
        for(var i : nums) list.add(i);
        Collections.sort(list, (a,b) -> {
            return map.get(a) != map.get(b)? map.get(a) - map.get(b) : b - a;
        });
        int[] ans = new int[list.size()];
        for(int i = 0; i < ans.length; i++) ans[i] = list.get(i);
        return ans;
    }
}
// @lc code=end

