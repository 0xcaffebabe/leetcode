/*
 * @lc app=leetcode.cn id=2545 lang=java
 * @lcpr version=
 *
 * [2545] 根据第 K 场考试的分数排序
 * 
 * 33/33 cases passed (2 ms)
 * Your runtime beats 91.67 % of java submissions
 * Your memory usage beats 73.25 % of java submissions (48 MB)
 */

// @lc code=start


class Solution {
    int k;
    public int[][] sortTheStudents(int[][] score, int k) {
        this.k = k;
        for (int i = 0; i < score.length; i++) {
            int min = i;
            for(int j = i + 1; j < score.length; j++) {
                if (gte(score[j], score[min])) min = j;
            }
            var t = score[i];
            score[i] = score[min];
            score[min] = t;
        }
        return score;
    }
    boolean gte(int[] a, int[] b) {
        return a[k] >= b[k];
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[10,6,9,1],[7,5,11,2],[4,8,3,15]]\n2\n
// @lcpr case=end

// @lcpr case=start
// [[3,4],[5,6]]\n0\n
// [[3],[5]]\n0\n
// @lcpr case=end

 */

