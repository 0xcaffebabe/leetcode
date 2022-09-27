/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 * 
 * 14/14 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 44.93 % of java submissions (39.3 MB)
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> seq = new ArrayList<>();
            for(int j = 0;j<=i;j++){
                if (j == 0 || j == i) {
                    seq.add(1);
                    continue;
                }
                seq.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
            }
            list.add(seq);
        }
        return list;
    }
}
// @lc code=end

