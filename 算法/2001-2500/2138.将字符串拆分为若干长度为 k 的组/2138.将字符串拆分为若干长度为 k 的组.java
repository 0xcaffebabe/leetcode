/*
 * @lc app=leetcode.cn id=2138 lang=java
 * @lcpr version=
 *
 * [2138] 将字符串拆分为若干长度为 k 的组
 * 
 * 157/157 cases passed (1 ms)
 * Your runtime beats 83.72 % of java submissions
 * Your memory usage beats 50.39 % of java submissions (40.3 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length() / k;
        if (s.length() % k != 0) n++;
        String[] ans = new String[n];
        for(int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < k; j++) {
                var index = i * k + j;
                if (index >= s.length()) break;
                sb.append(s.charAt(i * k + j));
            }
            if (i == n - 1 && sb.length() < k) {
                var l = k - sb.length();
                for(int j = 0; j < l; j++) 
                    sb.append(fill);
            }
            ans[i] = sb.toString();

        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abcdefghi"\n3\n"x"\n
// @lcpr case=end

// @lcpr case=start
// "a"\n100\n"x"\n
// @lcpr case=end

// @lcpr case=start
// "abcdefghij"\n3\n"x"\n
// "abcdefghijd"\n3\n"x"\n
// "a"\n1\n"x"\n
// "a"\n2\n"x"\n
// "a"\n3\n"x"\n
// @lcpr case=end

 */

