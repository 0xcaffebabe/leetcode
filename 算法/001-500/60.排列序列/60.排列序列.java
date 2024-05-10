/*
 * @lc app=leetcode.cn id=60 lang=java
 * @lcpr version=
 *
 * [60] 排列序列
 * 
 * 200/200 cases passed (1696 ms)
 * Your runtime beats 5.03 % of java submissions
 * Your memory usage beats 11.93 % of java submissions (43.8 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    List<Integer> ans;
    int[] nums;
    boolean[] visted;
    int k;
    public String getPermutation(int n, int k) {
        nums = new int[n];
        visted = new boolean[n + 1];
        this.k = k;
        for(int i = 1; i <= n; i++) nums[i - 1] = i;
        recursive(new ArrayList<>());
        // System.out.println(ans);
        StringBuilder sb = new StringBuilder();
        for(var i: ans) sb.append(i);
        return sb.toString();
    }

    void recursive(List<Integer> origin) {
        if (origin.size() == nums.length) {
            ans = origin;
            k--;
            return;
        }
        if (k == 0) return;
        for(int i : nums) {
            if (visted[i]) continue;
            var list = new ArrayList<Integer>();
            for(int o : origin) list.add(o);

            list.add(i);
            visted[i] = true;
            recursive(list);
            visted[i] = false;
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// 3\n3\n
// @lcpr case=end

// @lcpr case=start
// 4\n9\n
// @lcpr case=end

// @lcpr case=start
// 3\n1\n
// 1\n1\n
// 9\n362879\n
// 9\n362879\n
// 9\n362879\n
// 9\n116907\n
// @lcpr case=end

 */

