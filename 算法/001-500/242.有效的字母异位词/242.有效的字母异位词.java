/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
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

