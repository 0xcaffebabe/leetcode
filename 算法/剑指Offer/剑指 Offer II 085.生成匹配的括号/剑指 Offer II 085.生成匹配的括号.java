/*
 * @lc app=leetcode.cn id=剑指 Offer II 085 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 085] 生成匹配的括号
 * 
 * 8/8 cases passed (1 ms)
 * Your runtime beats 65.06 % of java submissions
 * Your memory usage beats 80.82 % of java submissions (41.2 MB)
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
// 3\n
// 8\n
// 7\n
// 6\n
// 5\n
// 4\n
// 2\n
// @lcpr case=end

// @lcpr case=start
// 1\n
// @lcpr case=end

 */

