import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=599 lang=java
 *
 * [599] 两个列表的最小索引总和
 * 
 * 136/136 cases passed (16 ms)
 * Your runtime beats 22.9 % of java submissions
 * Your memory usage beats 6.6 % of java submissions (42.4 MB)
 */

// @lc code=start
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for(int i = 0; i < list1.length; i++) map1.put(list1[i], i);
        for(int i = 0; i < list2.length; i++) map2.put(list2[i], i);

        int min = Integer.MAX_VALUE;
        for(var enr: map1.entrySet()) {
            var key = enr.getKey();
            if (map2.containsKey(key)) min = Math.min(min, enr.getValue() + map2.get(key));
        }
        List<String> ans = new ArrayList<>();
        for(var enr: map1.entrySet()) {
            var key = enr.getKey();
            if (map2.containsKey(key) && enr.getValue() + map2.get(key) == min) ans.add(key);
        }
        return ans.toArray(new String[]{});
    }
}
// @lc code=end

