/*
 * @lc app=leetcode.cn id=682 lang=java
 *
 * [682] 棒球比赛
 * 
 * 39/39 cases passed (2 ms)
 * Your runtime beats 84.3 % of java submissions
 * Your memory usage beats 15.33 % of java submissions (40.8 MB)
 */

// @lc code=start
class Solution {
    LinkedList<Integer> s = new LinkedList<>();
    public int calPoints(String[] ops) {
        for(var op: ops) {
            switch(op) {
                case "C":
                    s.pop();
                    break;
                case "D":
                    s.push(s.peek() * 2);
                    break;
                case "+":
                    s.push(s.get(0) + s.get(1));
                    break;
                default:
                    s.push(Integer.parseInt(op));
            }
        }
        int ans = 0;
        for(var i : s) ans += i;
        
        return ans;
    }
}
// @lc code=end

