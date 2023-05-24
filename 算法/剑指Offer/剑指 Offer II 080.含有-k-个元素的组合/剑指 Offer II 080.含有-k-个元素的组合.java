/*
 * @lc app=leetcode.cn id=剑指 Offer II 080 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 080] 含有 k 个元素的组合
 * 
 * 27/27 cases passed (8 ms)
 * Your runtime beats 64.57 % of java submissions
 * Your memory usage beats 28.56 % of java submissions (43.9 MB)
 */

// @lc code=start
class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    int k;
    int n;
    public List<List<Integer>> combine(int n, int k) {
        this.k = k;
        this.n = n;
        travel(1, new ArrayList<>());
        return ans;
    }

    void travel(int cur, List<Integer> origin) {
        // 剪枝：少了92ms
        if (origin.size() + (n - cur + 1) < k) return;
        if (origin.size() == k) {
            ans.add(origin);
            return;
        }
        for(int i = cur; i <= n; i++) {
            var list = new ArrayList<Integer>();
            for(var o : origin) list.add(o);
            list.add(i);
            travel(i + 1, list);
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// 4\n2\n
// @lcpr case=end

// @lcpr case=start
// 1\n1\n
// @lcpr case=end

 */

