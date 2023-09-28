/*
 * @lc app=leetcode.cn id=2251 lang=java
 * @lcpr version=
 *
 * [2251] 花期内花的数目
 * 
 * 52/52 cases passed (27 ms)
 * Your runtime beats 92 % of java submissions
 * Your memory usage beats 72.8 % of java submissions (69.4 MB)
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int n = flowers.length;
        int[] start = new int[n];
        int[] end = new int[n];
        for(int i = 0; i < n; i++) {
            start[i] = flowers[i][0];
            end[i] = flowers[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int[] ans = new int[people.length];

        for(int i = 0; i < people.length; i++) {
            int l = 0, r = n - 1;
            int x = 0, y = 0;
            while(l <= r) {
                int mid = (l + r) >> 1;
                if (start[mid] <= people[i]) {
                    l = mid + 1;
                    x = mid + 1;
                } else r = mid - 1;
            }
            l = 0; r = n - 1;
            while(l <= r) {
                int mid = (l + r) >> 1;
                if (end[mid] < people[i]) {
                    l = mid + 1;
                    y = mid + 1;
                } else r = mid - 1;
            }
            ans[i] = x - y;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,6],[3,7],[9,12],[4,13]]\n[2,3,7,11]\n
// [[1,10]]\n[1]\n
// [[1,10]]\n[11]\n
// @lcpr case=end

// @lcpr case=start
// [[1,10],[3,3]]\n[3,3,2]\n
//[[3, 12], [5, 10], [1, 8], [4, 15]]\n
//[2, 7, 11, 9]\n
// [[2, 11], [4, 13], [7, 16], [1, 9]]\n
// [3, 6, 10, 14]\n
// [[1, 8], [3, 12], [5, 15], [2, 9]]\n
// [4, 7, 11, 10]\n
// [[4, 14], [6, 16], [3, 12], [2, 10]]\n
// [5, 8, 9, 15]\n
// [[3, 11], [5, 13], [1, 9], [6, 14]]\n
// [2, 4, 7, 12]\n

// @lcpr case=end

 */

