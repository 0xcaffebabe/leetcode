/*
 * @lc app=leetcode.cn id=剑指 Offer II 100 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 100] 三角形中最小路径之和
 * 
 * 43/43 cases passed (8 ms)
 * Your runtime beats 6.36 % of java submissions
 * Your memory usage beats 33.37 % of java submissions (41.7 MB)
 */

// @lc code=start
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int i = 1; i < triangle.size(); i++) {
            for(int j = 0; j < triangle.get(i).size(); j++) {
                if (j == 0) {
                    triangle.get(i).set(j, triangle.get(i).get(j) + triangle.get(i - 1).get(j));
                } else if (j == triangle.get(i).size() - 1) {
                    triangle.get(i).set(j, triangle.get(i).get(j) + triangle.get(i - 1).get(j - 1));
                } else {
                    triangle.get(i).set(j, triangle.get(i).get(j) + Math.min(triangle.get(i - 1).get(j), triangle.get(i - 1).get(j - 1)));
                }
            }
        }
        // for(var i : triangle) {
        //     for(var j : triangle) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }
        int ans = Integer.MAX_VALUE;
        for(var i : triangle.get(triangle.size() - 1)) ans = Math.min(ans, i);
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[2],[3,4],[6,5,7],[4,1,8,3]]\n
// @lcpr case=end

// @lcpr case=start
// [[-10]]\n
// @lcpr case=end

 */

