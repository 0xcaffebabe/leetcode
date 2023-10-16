/*
 * @lc app=leetcode.cn id=2442 lang=java
 * @lcpr version=
 *
 * [2442] 反转之后不同整数的数目
 * 
 * 44/44 cases passed (131 ms)
 * Your runtime beats 18.31 % of java submissions
 * Your memory usage beats 100 % of java submissions (54.8 MB)
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        for (int i : nums) {
            if (!set.contains(i)) {
                ans++;
                set.add(i);
            }
            var r = reverse(i);
            if (!set.contains(r)) {
                ans++;
                set.add(r);
            }
        }
        return ans;
    }

    int reverse(int a) {
        return Integer.parseInt(new StringBuilder(a + "").reverse().toString());
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,13,10,12,31]\n
// @lcpr case=end

// @lcpr case=start
// [2,2,2]\n
// @lcpr case=end

 */

