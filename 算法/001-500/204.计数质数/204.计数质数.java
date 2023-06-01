/*
 * @lc app=leetcode.cn id=204 lang=java
 * @lcpr version=21908
 *
 * [204] 计数质数
 * 
 * 66/66 cases passed (127 ms)
 * Your runtime beats 59.36 % of java submissions
 * Your memory usage beats 48.24 % of java submissions (46.7 MB)
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        int ans = 0;
        for(int i = 2; i < n ;i++) {
            if (isPrime[i]) {
                ans++;
                if (((long)i * i) >= n) continue;
                for(int j = i * i; j < n; j += i) isPrime[j] = false;
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 10\n
// 10000\n
// 499979\n
// 999983\n
// 1500000\n
// 5000000\n
// @lcpr case=end

// @lcpr case=start
// 0\n
// @lcpr case=end

// @lcpr case=start
// 1\n
// @lcpr case=end

 */

