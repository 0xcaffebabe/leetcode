/*
 * @lc app=leetcode.cn id=1281 lang=java
 *
 * [1281] 整数的各位积和之差
 * 
 * 123/123 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 34.07 % of java submissions (38.4 MB)
 */

// @lc code=start
class Solution {
    public int subtractProductAndSum(int n) {
        List<Integer> tmp = new ArrayList<>();
        while(n >= 10) {
            tmp.add(n % 10);
            n /= 10;
        }
        tmp.add(n);
        int sum = 0;
        int fac = 1;
        for(var i : tmp) {
            fac *= i;
            sum += i;
        }
        return fac - sum;
    }
}
// @lc code=end

