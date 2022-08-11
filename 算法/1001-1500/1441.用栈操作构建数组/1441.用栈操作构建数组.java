/*
 * @lc app=leetcode.cn id=1441 lang=java
 *
 * [1441] 用栈操作构建数组
 * 
 * 49/49 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 43.38 % of java submissions (41.5 MB)
 */

// @lc code=start
class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> ans = new ArrayList<>();
        int p = 0;
        for(int i = 1; i <= n; i++) {
            if (p >= target.length) break;
            if (i == target[p]) {
                ans.add("Push");
                p++;
            }else {
                ans.add("Push");
                ans.add("Pop");
            }
        }
        return ans;
    }
}
// @lc code=end

