import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1005 lang=java
 *
 * [1005] K 次取反后最大化的数组和
 * 
 * 80/80 cases passed (5 ms)
 * Your runtime beats 35.53 % of java submissions
 * Your memory usage beats 16.49 % of java submissions (41.3 MB)
 */

// @lc code=start
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(var i : nums) map.put(i, map.getOrDefault(i, 0) + 1);

        for(int i = -100; i < 0; i++) {
            if (map.containsKey(i)) {
                int ops = Math.min(k, map.get(i));
                // 当前数变正数
                map.put(i, map.get(i) - ops);
                map.put(-i, map.getOrDefault(-i, 0) + ops);
                k -= ops;
                if (k == 0) break;
            }
        }

        // 如果负数消为完 不存在0 并且k还不是偶数 那就必须消掉一个最小的整数作为负数
        if (k > 0 && k % 2 != 0 && !map.containsKey(0)) {
            for(int i = 1; i <= 100; i++) {
                if (map.containsKey(i)) {
                    // 变负数
                    map.put(i, map.get(i) - 1);
                    map.put(-i, map.getOrDefault(-i, 0) + 1);
                    break;
                }
            }
        }
        // System.out.println(map);
        int sum = 0;
        for(var enr: map.entrySet()) sum += enr.getKey() * enr.getValue();
        
        return sum;
    }
}
// @lc code=end

