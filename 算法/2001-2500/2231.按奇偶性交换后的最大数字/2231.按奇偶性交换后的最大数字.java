import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=2231 lang=java
 *
 * [2231] 按奇偶性交换后的最大数字
 * 
 * 238/238 cases passed (2 ms)
 * Your runtime beats 58.72 % of java submissions
 * Your memory usage beats 27.83 % of java submissions (38.7 MB)
 */

// @lc code=start
class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer> odd = new PriorityQueue<>((a,b) -> b-a);
        PriorityQueue<Integer> eve = new PriorityQueue<>((a,b) -> b-a);

        var str = String.valueOf(num);
        for(int i = 0; i < str.length(); i++) {
            int c = str.charAt(i) - '0';
            if (c % 2  == 0) eve.offer(c);
            else odd.offer(c);
        }

        int ans = 0;
        for(int i = 0; i < str.length(); i++) {
            int c = str.charAt(i) - '0';
            if (c % 2  == 0) ans = ans * 10 + eve.poll();
            else ans = ans * 10 + odd.poll();
        }
        return ans;

    }
}
// @lc code=end

