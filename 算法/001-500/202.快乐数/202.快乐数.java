/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 * 
 * 404/404 cases passed (1 ms)
 * Your runtime beats 78.9 % of java submissions
 * Your memory usage beats 41.91 % of java submissions (38.8 MB)
 */

// @lc code=start
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n != 1) {
            n = cv(n);
            // System.out.println(n);
            if (set.contains(n)) return false;
            set.add(n);
        }
        return true;
    }

    int cv(int n) {
        int sum = 0;
        while(n >= 10) {
            sum += Math.pow(n % 10, 2);
            n /= 10;
        }
        sum += Math.pow(n % 10, 2);
        return sum;
    }
}
// @lc code=end

