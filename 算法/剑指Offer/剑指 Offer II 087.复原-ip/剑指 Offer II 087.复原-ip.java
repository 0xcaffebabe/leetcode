/*
 * @lc app=leetcode.cn id=剑指 Offer II 087 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 087] 复原 IP 
 * 
 * 147/147 cases passed (7 ms)
 * Your runtime beats 14.54 % of java submissions
 * Your memory usage beats 68.26 % of java submissions (40.7 MB)
 */

// @lc code=start
class Solution {
    List<String> ans = new ArrayList<>();
    int[] cand;
    int[] seg = new int[4];
    public List<String> restoreIpAddresses(String s) {
        cand = new int[s.length()];
        for(int i = 0; i < s.length(); i++) cand[i] = s.charAt(i) - '0';

        travel(0, 0);
        return ans;
    }

    void travel(int index, int start) {
        if (index == 4) {
            if (start == cand.length) {
                ans.add(seg[0] + "." + seg[1] + "." + seg[2] + "." + seg[3]);
            }
            return;
        }
        if (start == cand.length) return;

        if (cand[start] == 0) {
            seg[index] = 0;
            travel(index + 1, start + 1);
        }

        int addr = 0;
        for(int i = start; i < cand.length; i++) {
            addr = addr * 10 + cand[i];
            if (addr == 0 || addr > 255) break;
            seg[index] = addr;
            travel(index + 1, i + 1);
        }
    }

}
// @lc code=end



/*
// @lcpr case=start
// "25525511135"\n
// @lcpr case=end

// @lcpr case=start
// "0000"\n
// @lcpr case=end

// @lcpr case=start
// "1111"\n
// @lcpr case=end

// @lcpr case=start
// "010010"\n
// @lcpr case=end

// @lcpr case=start
// "10203040"\n
// @lcpr case=end

 */

