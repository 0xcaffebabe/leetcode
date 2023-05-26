/*
 * @lc app=leetcode.cn id=剑指 Offer 48 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer 48] 最长不含重复字符的子字符串
 * 
 * 987/987 cases passed (5 ms)
 * Your runtime beats 58.12 % of java submissions
 * Your memory usage beats 7.46 % of java submissions (42.6 MB)
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        Set<Character> set = new HashSet<>(32);
        int p = 0, q = 0;
        int ans = 0;
        while(q < s.length()) {
            // 窗口第一个值
            char left = s.charAt(p);
            // 窗口最后一个值
            char right = s.charAt(q);
            
            // 如果发现最后一个值重复了 不断移动左窗口边界 直至不重复
            while (set.contains(right)) {
                left = s.charAt(p++);
                set.remove(left);
            }
            // 将窗口最后一个值计入
            set.add(right);
            // System.out.println(set);
            ans = Math.max(ans, set.size());
            q++;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abcabcbb"\n
// @lcpr case=end

// @lcpr case=start
// "bbbbb"\n
// @lcpr case=end

// @lcpr case=start
// "pwwkew"\n
// @lcpr case=end

// @lcpr case=start
// "p"\n
// @lcpr case=end

// @lcpr case=start
// ""\n
// @lcpr case=end

 */

