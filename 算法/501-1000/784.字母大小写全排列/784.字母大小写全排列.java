/*
 * @lc app=leetcode.cn id=784 lang=java
 *
 * [784] 字母大小写全排列
 * 
 * 63/63 cases passed (6 ms)
 * Your runtime beats 31.96 % of java submissions
 * Your memory usage beats 5.3 % of java submissions (42.6 MB)
 */

// @lc code=start
class Solution {
    private List<String> ans = new ArrayList<>(16);

    private Set<String> set = new HashSet<>(16);

    public List<String> letterCasePermutation(String s) {
        travel(0, s);
        return ans;
    }

    private void travel(int index, String raw) {
        if (index >= raw.length()) return;
        
        StringBuilder sb = new StringBuilder(raw);
        char c = raw.charAt(index);
        if (c >= 65 && c <= 90) {
            sb.setCharAt(index ,(char)(c + 32));
        } else if (c >= 97 && c <= 122) {
            sb.setCharAt(index ,(char)(c - 32));
        }
        String r = sb.toString();
        travel(index + 1, raw);
        travel(index + 1, r);

        if (!set.contains(r)) {
            ans.add(r);
            set.add(r);
        }
        if (!set.contains(raw)) {
            ans.add(raw);
            set.add(raw);
        }         
    }
}
// @lc code=end

