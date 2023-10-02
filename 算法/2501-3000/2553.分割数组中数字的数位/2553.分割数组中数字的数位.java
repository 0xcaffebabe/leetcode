/*
 * @lc app=leetcode.cn id=2553 lang=java
 * @lcpr version=
 *
 * [2553] 分割数组中数字的数位
 * 
 * 52/52 cases passed (7 ms)
 * Your runtime beats 30.17 % of java submissions
 * Your memory usage beats 30.99 % of java submissions (43.2 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(var i : nums) list.addAll(split(i));
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++) ans[i] = list.get(i);
        return ans;
    }
    List<Integer> split(int i) {
        List<Integer> list = new ArrayList<>();
        while(i > 0) {
            list.add(i % 10);
            i /= 10;
        }
        Collections.reverse(list);
        return list;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [13,25,83,77]\n
// @lcpr case=end

// @lcpr case=start
// [7,1,3,9]\n
// [100000,1,3,9]\n
// [1]\n
// @lcpr case=end

 */

