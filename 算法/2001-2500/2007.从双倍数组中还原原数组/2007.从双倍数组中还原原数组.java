/*
 * @lc app=leetcode.cn id=2007 lang=java
 * @lcpr version=
 *
 * [2007] 从双倍数组中还原原数组
 * 
 * 179/179 cases passed (107 ms)
 * Your runtime beats 27.72 % of java submissions
 * Your memory usage beats 61.39 % of java submissions (60.3 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0) return new int[]{};
        Map<Integer, Integer> m = new HashMap<>();
        for(var i: changed) m.put(i, m.getOrDefault(i, 0) + 1);
        Arrays.sort(changed);
        
        int[] ans = new int[changed.length / 2];
        int index = 0;
        for(int i = 0; i < changed.length; i++) {
            int a = changed[i];
            int b = a * 2;
            if (m.get(a) > 0) {
                if (!m.containsKey(b) || m.get(b) == 0) return new int[]{};
                ans[index++] = a;
                m.put(a, m.get(a) - 1);
                m.put(b, m.get(b) - 1);
            }
        }

        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,3,4,2,6,8]\n
// [0]\n
// [0,0]\n
// [1,1]\n
// [50000, 100000]\n
// [0,100000]
// @lcpr case=end

// @lcpr case=start
// [6,3,0,1]\n
// @lcpr case=end

// @lcpr case=start
// [1]\n
// @lcpr case=end

 */

