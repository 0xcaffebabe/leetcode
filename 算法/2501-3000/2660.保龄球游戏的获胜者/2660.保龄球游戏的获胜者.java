/*
 * @lc app=leetcode.cn id=2660 lang=java
 * @lcpr version=
 *
 * [2660] 保龄球游戏的获胜者
 * 
 * 1205/1205 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 5 % of java submissions (43.7 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int a = 0;
        int b = 0;
        for(int i = 0; i < player1.length; i++) {
            if ((i > 0 && player1[i-1] == 10) || (i > 1 &&player1[i-2] == 10))
                a += 2 * player1[i];
            else a += player1[i];

            if ((i > 0 && player2[i-1] == 10) || (i > 1 && player2[i-2] == 10))
                b += 2 * player2[i];
            else b += player2[i];
        }
        // System.out.println(a + "|" + b);
        if (a > b) return 1;
        if (b > a) return 2;
        return 0;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,10,7,9]\n[6,5,2,3]\n
// @lcpr case=end

// @lcpr case=start
// [10,2,2,3]\n[3,8,4,5]\n
// @lcpr case=end

// @lcpr case=start
// [3,5,7,6]\n[8,10,10,2]\n
// [10,2,2,3]\n[3,8,4,5]\n
// @lcpr case=end

// @lcpr case=start
// [2,3]\n[4,1]\n
// @lcpr case=end

 */

