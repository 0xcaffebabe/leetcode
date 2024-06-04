/*
 * @lc app=leetcode.cn id=1387 lang=java
 * @lcpr version=
 *
 * [1387] 将整数按权重排序
 * 
 * 333/333 cases passed (41 ms)
 * Your runtime beats 62.4 % of java submissions
 * Your memory usage beats 36 % of java submissions (43.5 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    Map<Integer, Integer> memo = new HashMap<>();
    public int getKth(int lo, int hi, int k) {
        int[][] nums = new int[hi - lo + 1][2];
        for(int i = lo; i <= hi; i++) {
            nums[i - lo][0] = i;
            nums[i - lo][1] = weight(i);
        }
        Arrays.sort(nums, (a, b) -> {
            if (a[1] == b[1]) return a[0] - b[0];
            return a[1] - b[1];
        });
        return nums[k - 1][0];
    }
    int weight(int v) {
        // System.out.println(v);
        if (memo.containsKey(v)) return memo.get(v);
        if (v == 1) return 0;
        
        int w = 1;
        if (v % 2 == 0) {
            w += weight(v / 2);
            memo.put(v, w);
        } else {
            w += weight(3 * v + 1);
            memo.put(v, w);
        }
        return w;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 12\n15\n2\n
// 1\n1000\n1000\n
// @lcpr case=end

// @lcpr case=start
// 7\n11\n4\n
// @lcpr case=end

 */

