/*
 * @lc app=leetcode.cn id=1318 lang=java
 * @lcpr version=
 *
 * [1318] 或运算的最小翻转次数
 * 
 * 64/64 cases passed (1 ms)
 * Your runtime beats 4.17 % of java submissions
 * Your memory usage beats 71.76 % of java submissions (39.3 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int minFlips(int a, int b, int c) {
        var aa = toBin(a);
        var bb = toBin(b);
        var cc = toBin(c);
        int ans = 0;
        for(int i = 0; i < 32; i++) {
            if (cc[i] == '0' && aa[i] == '1' && bb[i] == '1') {
                ans += 2;
                continue;
            }
            if (cc[i] == '0' && (aa[i] == '1' || bb[i] == '1')) {
                ans++;
                continue;
            }
            if (cc[i] == '1' && aa[i] == '0' && bb[i] == '0') {
                ans++;
                continue;
            }
        }
        return ans;
    }

    char[] toBin(int a) {
        var sb = new StringBuilder(Integer.toBinaryString(a));
        for(int i = sb.length(); i < 32; i++) 
            sb.insert(0, '0');
        return sb.toString().toCharArray();
    }
}
// @lc code=end



/*
// @lcpr case=start
// 2\n6\n5\n
// 1000000000\n1\n100000000\n
// @lcpr case=end

// @lcpr case=start
// 4\n2\n7\n
// @lcpr case=end

// @lcpr case=start
// 1\n2\n3\n
// @lcpr case=end

 */

