/*
 * @lc app=leetcode.cn id=506 lang=java
 *
 * [506] 相对名次
 * 
 * 17/17 cases passed (10 ms)
 * Your runtime beats 21.46 % of java submissions
 * Your memory usage beats 71.79 % of java submissions (42.3 MB)
 */

// @lc code=start
class Solution {
    public String[] findRelativeRanks(int[] score) {
        var scores = new ArrayList<Integer>();
        for(int i = 0; i < score.length; i++) scores.add(score[i]);
        Collections.sort(scores, (a,b) -> b-a);
        HashMap<Integer,Integer> map = new HashMap<>(32);
        for(int i = 0; i < scores.size(); i++) map.put(scores.get(i), i);
        String[] ans = new String[score.length];
        for(int i = 0; i < score.length; i++) {
            int v = map.get(score[i]);
            if (v == 0) ans[i] = "Gold Medal";
            else if (v == 1) ans[i] = "Silver Medal";
            else if (v == 2) ans[i] = "Bronze Medal";
            else ans[i] = v+1 + "";
        }
        return ans;
    }
}
// @lc code=end

