/*
 * @lc app=leetcode.cn id=378 lang=java
 *
 * [378] 有序矩阵中第 K 小的元素
 * 
 * 86/86 cases passed (16 ms)
 * Your runtime beats 30.71 % of java submissions
 * Your memory usage beats 88.26 % of java submissions (46.3 MB)
 */

// @lc code=start
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> que = new PriorityQueue<Integer>((a,b) -> b-a);
        for(var i : matrix) {
            for(var j : i) {
                que.offer(j);
                if (que.size() > k) que.remove();
            }
        }
        return que.peek();
    }
}
// @lc code=end

