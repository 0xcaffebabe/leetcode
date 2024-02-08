/*
 * @lc app=leetcode.cn id=1418 lang=java
 * @lcpr version=
 *
 * [1418] 点菜展示表
 * 
 * 53/53 cases passed (77 ms)
 * Your runtime beats 12.9 % of java submissions
 * Your memory usage beats 8.06 % of java submissions (67.3 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public List<List<String>> displayTable(List<List<String>> orders) {
        orders.sort((o1, o2) -> 
            Integer.parseInt(o1.get(1))
            - Integer.parseInt(o2.get(1))
        );
        Map<String, Integer> map = new HashMap<>();
        Set<String> items = new HashSet<>();
        for (List<String> order : orders) {
            var key = order.get(1) + "-" + order.get(2);
            map.put(key, map.getOrDefault(key, 0) + 1);
            items.add(order.get(2));
        }
        // System.out.println(map);

        var itemArr = items.toArray(new String[0]);
        Arrays.sort(itemArr);
        List<List<String>> ans = new ArrayList<>();
        List<String> header = new ArrayList<>();
        header.add("Table");
        for (String item : itemArr) 
            header.add(item);
        ans.add(header);

        for (List<String> order : orders) {
            // 桌号去重
            if (order.get(1).equals(ans.get(ans.size()-1).get(0))) continue;
            List<String> row = new ArrayList<>();
            row.add(order.get(1));
            for (String item : itemArr)
                row.add(String.valueOf(map.getOrDefault(order.get(1) + "-" + item, 0)));
            ans.add(row);
        }

        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [["David","3","Ceviche"],["Corina","10","Beef Burrito"],["David","3","FriedChicken"],["Carla","5","Water"],["Carla","5","Ceviche"],["Rous","3","Ceviche"]]\n
// @lcpr case=end

// @lcpr case=start
// [["James","12","Fried Chicken"],["Ratesh","12","Fried Chicken"],["Amadeus","12","FriedChicken"],["Adam","1","Canadian Waffles"],["Brianna","1","Canadian Waffles"]]\n
// @lcpr case=end

// @lcpr case=start
// [["Laura","2","Bean Burrito"],["Jhon","2","Beef Burrito"],["Melissa","2","Soda"]]\n
// @lcpr case=end

 */

