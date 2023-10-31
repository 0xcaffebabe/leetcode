/*
 * @lc app=leetcode.cn id=2843 lang=java
 * @lcpr version=
 *
 * [2843] 统计对称整数的数目
 * 
 * 1967/1967 cases passed (11 ms)
 * Your runtime beats 81.22 % of java submissions
 * Your memory usage beats 97.36 % of java submissions (38.7 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int ans = 0;
        for(int i = low; i <= high; i++)
            if (check(i)) ans++;
        return ans;
    }

    boolean check(int n) {
        if (n < 10) return false;
        if (n >= 100 && n <=999) return false;
        if (n < 100) {
            int n1 = n % 10;
            n /= 10;
            int n2 = n;
            return n2 == n1;
        }
        int n1 = n % 10;
        n /= 10;
        int n2 = n % 10;
        n /= 10;
        int n3 = n % 10;
        n /= 10;
        int n4 = n;
        return n1 + n2 == n3 + n4;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 1\n100\n
// @lcpr case=end

// @lcpr case=start
// 1200\n1230\n
// 1\n10000\n
// @lcpr case=end

 */

