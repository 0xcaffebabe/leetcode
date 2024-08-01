/*
 * @lc app=leetcode.cn id=LCP 40 lang=java
 * @lcpr version=
 *
 * [LCP 40] 心算挑战
 * 
 * 104/104 cases passed (78 ms)
 * Your runtime beats 64.83 % of java submissions
 * Your memory usage beats 11.72 % of java submissions (59.8 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public int maxmiumScore(int[] cards, int cnt) {
        Arrays.sort(cards);
        int n = cards.length - 1;
        int ans = 0;
        int minOdd = Integer.MAX_VALUE;
        int minEven = Integer.MAX_VALUE;

        for(int i = n; i > n - cnt ; i--) {
            ans += cards[i];
            // System.out.println(cards[i]);
            if (cards[i] % 2 == 0) minEven = Math.min(minEven, cards[i]);
            else minOdd = Math.min(minOdd, cards[i]);
        }
        if (ans % 2 == 0) return ans;
        int ans1 = ans;
        int ans2 = ans;
        for(int i = n - cnt; i >= 0; i--) {
            if (cards[i] % 2 == 0) {
                ans1 -= minOdd;
                ans1 += cards[i];
                break;
            }
        }
        for(int i = n - cnt; i >= 0; i--) {
            if (cards[i] % 2 != 0) {
                ans2 -= minEven;
                ans2 += cards[i];
                break;
            }
        }
        if (ans1 < ans2) {
            int t = ans1;
            ans1 = ans2;
            ans2 = t;
        }
        // System.out.println(ans1 + "|" + ans2);
        if (ans1 >= ans2 && ans1 % 2 == 0) return ans1;
        if (ans2 % 2 == 0) return ans2;
        return 0;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,8,9]\n3\n
// [3,3,1]\n1\n
// [1]\n1\n
// [2]\n1\n
// @lcpr case=end

// @lcpr case=start
// [7,6,4,6]\n1\n
// @lcpr case=end

 */

