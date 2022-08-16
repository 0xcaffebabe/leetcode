/*
 * @lc app=leetcode.cn id=120 lang=java
 *
 * [120] 三角形最小路径和
 * 
 * 44/44 cases passed (10 ms)
 * Your runtime beats 7.51 % of java submissions
 * Your memory usage beats 26.91 % of java submissions (41.3 MB)
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

