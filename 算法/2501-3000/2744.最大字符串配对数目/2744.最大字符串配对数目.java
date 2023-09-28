/*
 * @lc app=leetcode.cn id=2744 lang=java
 * @lcpr version=
 *
 * [2744] 最大字符串配对数目
 * 
 * 659/659 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 82 % of java submissions (40 MB)
 */

// @lc code=start
class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        boolean[] has = new boolean[words.length];
        int ans = 0;
        for(int i = 0; i < words.length; i++) {
            if (has[i]) continue;
            for(int j = 0; j < words.length; j++) {
                if (i == j) continue;
                if (has[j]) continue;
                if (words[i].charAt(0) == words[j].charAt(1)
                    && words[i].charAt(1) == words[j].charAt(0)) {
                        ans++;
                        has[i] = true;
                        has[j] = true;
                    }
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["cd","ac","dc","ca","zz"]\n
// @lcpr case=end

// @lcpr case=start
// ["ab","ba","cc"]\n
// @lcpr case=end

// @lcpr case=start
// ["aa","ab"]\n
// @lcpr case=end

 */

