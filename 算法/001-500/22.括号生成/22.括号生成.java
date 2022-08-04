/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成
 * 
 * 8/8 cases passed (1 ms)
 * Your runtime beats 75.28 % of java submissions
 * Your memory usage beats 66.4 % of java submissions (41.3 MB)
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

