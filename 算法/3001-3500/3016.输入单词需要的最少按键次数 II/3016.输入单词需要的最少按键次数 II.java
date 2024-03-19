/*
 * @lc app=leetcode.cn id=3016 lang=java
 * @lcpr version=
 *
 * [3016] 输入单词需要的最少按键次数 II
 * 
 * 877/877 cases passed (9 ms)
 * Your runtime beats 76.77 % of java submissions
 * Your memory usage beats 92.66 % of java submissions (44.5 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public int minimumPushes(String word) {
        int[] m = new int[26];
        for(var c: word.toCharArray()) m[c - 'a']++;
        Arrays.sort(m);
        // System.out.println(Arrays.toString(m));
        int ans = 0;
        for(int i = 0; i < 26; i++) {
            if (i < 8) ans += m[25 - i];
            else if (i >= 8 && i < 16) ans += m[25 - i] * 2;
            else if (i >= 16 && i < 24) ans += m[25 - i] * 3;
            else ans += m[25 - i] * 4;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abcde"\n
// @lcpr case=end

// @lcpr case=start
// "xyzxyzxyzxyz"\n
// @lcpr case=end

// @lcpr case=start
// "aabbccddeeffgghhiiiiii"\n
// "abcdefghijklmnopqrstuvwyxyz"\n
// "alporfmdqsbhncwyu"\n
// @lcpr case=end

 */

