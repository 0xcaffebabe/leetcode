import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=1323 lang=java
 *
 * [1323] 6 和 9 组成的最大数字
 * 
 * 153/153 cases passed (1 ms)
 * Your runtime beats 52.88 % of java submissions
 * Your memory usage beats 48.53 % of java submissions (38.5 MB)
 */

// @lc code=start
class Solution {
    public int maximum69Number (int num) {
        LinkedList<Integer> s = new LinkedList<>();
        while(num > 0) {
            s.push(num % 10);
            num /= 10;
        }
        boolean flag = false;
        int ans = 0;
        while(!s.isEmpty()) {
            int v = s.pop();
            if (!flag) {
                if (v == 6) {
                    v = 9;
                    flag = true;
                }
            }
            ans = ans * 10 + v;
        }
        return ans;
    }
}
// @lc code=end

