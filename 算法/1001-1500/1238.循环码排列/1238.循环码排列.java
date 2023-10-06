/*
 * @lc app=leetcode.cn id=1238 lang=java
 * @lcpr version=
 *
 * [1238] 循环码排列
 * 
 * 47/47 cases passed (18 ms)
 * Your runtime beats 6.9 % of java submissions
 * Your memory usage beats 22.42 % of java submissions (53.1 MB)
 */

// @lc code=start

import java.util.List;

class Solution {
    public List<Integer> circularPermutation(int n, int start) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < Math.pow(2, n); i++) 
            list.add(i ^ (i / 2));
        List<Integer> ans = new ArrayList<>();
        int cnt = 0;
        int i = 0;
        boolean finded = false;
        while(cnt < list.size()) {
            i = i % list.size();
            if (list.get(i) == start) 
                finded = true;
            if (finded) {
                ans.add(list.get(i));
                cnt++;
            }
            i++;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 2\n3\n
// @lcpr case=end

// @lcpr case=start
// 3\n2\n
// 10\n1023\n
// @lcpr case=end

 */

