/*
 * @lc app=leetcode.cn id=2418 lang=java
 * @lcpr version=
 *
 * [2418] 按身高排序
 * 
 * 68/68 cases passed (27 ms)
 * Your runtime beats 9.48 % of java submissions
 * Your memory usage beats 9.79 % of java submissions (43.4 MB)
 */

// @lc code=start

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<String, Integer> heightMap = new HashMap<>();
        for(int i = 0; i < names.length; i++) 
            names[i] = names[i] + "-" + i;
        for(int i = 0; i < names.length; i++)
            heightMap.put(names[i], heights[i]);
        Arrays.sort(names, (b, a) -> heightMap.get(a) - heightMap.get(b));
        String[] ans = new String[names.length];
        for(int i = 0; i < names.length; i++) 
            ans[i] = names[i].split("-")[0];
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["Mary","John","Emma"]\n[180,165,170]\n
// @lcpr case=end

// @lcpr case=start
// ["Alice","Bob","Bob"]\n[155,185,150]\n
// @lcpr case=end

 */

