/*
 * @lc app=leetcode.cn id=2657 lang=java
 * @lcpr version=
 *
 * [2657] 找到两个数组的前缀公共数组
 * 
 * 1773/1773 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 50 % of java submissions (43.4 MB)
 */

// @lc code=start
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        boolean[] m1 = new boolean[51];
        boolean[] m2 = new boolean[51];
        int n = A.length;
        int[] ans = new int[n];
        m1[A[0]] = true;
        m2[B[0]] = true;
        if (A[0] == B[0]) ans[0] = 1;
        for(int i = 1; i < n; i++) {
            ans[i] += ans[i - 1];
            if (A[i] == B[i]) {
                ans[i] += 1;
            } else {
                if (m2[A[i]]) ans[i] += 1;
                if (m1[B[i]]) ans[i] += 1;
            }
            m1[A[i]] = true;
            m2[B[i]] = true;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,3,2,4]\n[3,1,2,4]\n
// @lcpr case=end

// @lcpr case=start
// [2,3,1]\n[3,1,2]\n
// [1]\n[1]\n
// [1,2]\n[1,2]\n
// [1,2]\n[2,1]\n
// @lcpr case=end

 */

