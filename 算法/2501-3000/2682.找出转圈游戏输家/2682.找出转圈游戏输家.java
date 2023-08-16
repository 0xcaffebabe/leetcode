/*
 * @lc app=leetcode.cn id=2682 lang=java
 * @lcpr version=21913
 *
 * [2682] 找出转圈游戏输家
 * 
 * 1277/1277 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 70.19 % of java submissions (42.6 MB)
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int[] circularGameLosers(int n, int k) {
        boolean[] processed = new boolean[n];
        int cnt = 1;
        processed[0] = true;
        int processedNum = 1;
        int previous = 0;
        while(true) {
            int next = (previous + k * cnt) % n;
            // if (next == 0) next = 1;
            // System.out.println(next);
            if (processed[next]) break;
            previous = next;
            processed[next] = true;
            processedNum++;
            cnt++;
            
        }
        // System.out.println(Arrays.toString(processed));
        int[] ans = new int[n - processedNum];
        cnt = 0;
        for(int i = 0; i < n; i++) {
            if (!processed[i]) ans[cnt++] = i + 1;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 5\n2\n
// 50\n2\n
// 5\n4\n
// 50\n49\n
// @lcpr case=end

// @lcpr case=start
// 4\n4\n
// @lcpr case=end

 */

