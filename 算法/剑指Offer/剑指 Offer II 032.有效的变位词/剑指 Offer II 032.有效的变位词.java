/*
 * @lc app=leetcode.cn id=剑指 Offer II 032 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 032] 有效的变位词
 * 
 * 36/36 cases passed (3 ms)
 * Your runtime beats 74.49 % of java submissions
 * Your memory usage beats 96.94 % of java submissions (40.9 MB)
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.equals(t)) return false;

        int[] map1 = new int[128];
        int[] map2 = new int[128];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map1[c] = map1[c] + 1;
        }
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            map2[c] = map2[c] + 1;
        }

        for(int i=0;i<map1.length;i++){
            if (map1[i] != map2[i]) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "anagram"\n"nagaram"\n
// @lcpr case=end

// @lcpr case=start
// "rat"\n"car"\n
// @lcpr case=end

// @lcpr case=start
// "a"\n"a"\n
// @lcpr case=end

 */

