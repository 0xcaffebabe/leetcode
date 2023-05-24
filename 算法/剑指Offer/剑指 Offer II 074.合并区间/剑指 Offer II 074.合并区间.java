/*
 * @lc app=leetcode.cn id=剑指 Offer II 074 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 074] 合并区间
 * 
 * 168/168 cases passed (8 ms)
 * Your runtime beats 6.76 % of java submissions
 * Your memory usage beats 89.94 % of java submissions (43 MB)
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        for(var i : intervals) list.add(i);

        Collections.sort(list, (a, b) -> a[0] - b[0]);

        LinkedList<int[]> ans = new LinkedList<>();
        for(var i: list) {
            int left = i[0]; int right = i[1];
            // 如果之前的右区间小于当前的左区间 那就代表现在开启了一个新区间
            // 否则证明当前区间可以跟上一个区间合并 合并的规则就是左区间取最小 右区间取最大
            // 以上都建立在已根据左区间排序的情况下
            if (ans.size() == 0 || ans.getLast()[1] < left) {
                ans.add(new int[]{left, right});
            }else {
                ans.getLast()[1] = Math.max(ans.getLast()[1], right);
            }
        }
        return ans.toArray(new int[][]{});
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,3],[2,6],[8,10],[15,18]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,4],[4,5]]\n
// @lcpr case=end

 */

