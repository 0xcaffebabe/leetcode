/*
 * @lc app=leetcode.cn id=869 lang=java
 * @lcpr version=21909
 *
 * [869] 重新排序得到 2 的幂
 * 
 * 137/137 cases passed (2 ms)
 * Your runtime beats 70.99 % of java submissions
 * Your memory usage beats 29.77 % of java submissions (39 MB)
 */

// @lc code=start

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean reorderedPowerOf2(int n) {
        Set<String> set = new HashSet<>();
        for(int i = 0; i <= 32; i++) {
            var arr = String.valueOf((int) Math.pow(2, i)).toCharArray();
            Arrays.sort(arr);
            set.add(new String(arr));
        };
        var arr = String.valueOf(n).toCharArray();
        Arrays.sort(arr);
        // System.out.println(set);
        return set.contains(new String(arr));
    }
}
// @lc code=end



/*
// @lcpr case=start
// 1\n
// 61\n
// 16\n
// @lcpr case=end

// @lcpr case=start
// 10\n
// @lcpr case=end

 */

