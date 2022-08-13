/*
 * @lc app=leetcode.cn id=2125 lang=java
 *
 * [2125] 银行中的激光束数量
 * 
 * 146/146 cases passed (17 ms)
 * Your runtime beats 25.71 % of java submissions
 * Your memory usage beats 89.14 % of java submissions (41.6 MB)
 */

// @lc code=start
class Solution {
    int[] cache;
    String[] bank;
    public int numberOfBeams(String[] bank) {
        this.bank = bank;
        this.cache = new int[bank.length];
        for(int i = 0; i < bank.length; i++) cache[i] = count(bank[i]);
        
        int p = 0;
        int q = 1;
        int ans = 0;
        while(p < bank.length && q < bank.length) {
            int c1 = cache[p];
            int c2 = cache[q];
            if (c1 != 0 && c2 != 0) {
                ans += c1 * c2;
                p++;q++;
                continue;
            }
            if (c1 == 0) {
                p++;
                q = p + 1;
                continue;
            }
            if (c2 == 0) q++;
        }
        return ans;
    }
    int count(String s) {
        int cnt = 0;
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') cnt++;
        }
        return cnt;
    }
}
// @lc code=end

