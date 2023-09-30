/*
 * @lc app=leetcode.cn id=面试题 08.09 lang=java
 * @lcpr version=
 *
 * [面试题 08.09] 括号
 * 
 * 8/8 cases passed (1 ms)
 * Your runtime beats 64.52 % of java submissions
 * Your memory usage beats 34.19 % of java submissions (41.1 MB)
 */

// @lc code=start
class Solution {
    List<String> ans = new ArrayList<>();
    int n;
    public List<String> generateParenthesis(int n) {
        this.n = n;
        travel("", n, n);
        return ans;
    }

    void travel(String path, int left, int right) {
        if (path.length() == 2 * n) {
            ans.add(path);
            return;
        }
        if (left == right) travel(path + "(", left - 1, right);
        
        if(left < right) {
            if (left > 0) travel(path + "(", left - 1, right);
            travel(path + ")", left, right - 1);
        }
    }
}
// @lc code=end

/*
// @lcpr case=start
// 1\n
// 8\n
// 10\n
// @lcpr case=end
*/
