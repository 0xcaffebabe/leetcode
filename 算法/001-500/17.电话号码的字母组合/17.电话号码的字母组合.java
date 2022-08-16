/*
 * @lc app=leetcode.cn id=17 lang=java
 *
 * [17] 电话号码的字母组合
 * 
 * 25/25 cases passed (6 ms)
 * Your runtime beats 15.6 % of java submissions
 * Your memory usage beats 5.07 % of java submissions (41.9 MB)
 */

// @lc code=start
class Solution {
    String[] map = {
        "", // 0
        "", // 1
        "abc", // 2
        "def", // 3
        "ghi", // 4
        "jkl", // 5
        "mno", // 6
        "pqrs", // 7
        "tuv", // 8
        "wxyz", // 9
    };
    List<String> ans = new ArrayList<>();
    String digits;
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return List.of();
        this.digits = digits;
        dfs(0, "");
        return ans;
    }

    void dfs(int index, String path) {
        if (path.length() == digits.length()) {
            ans.add(path);
            return;
        }
        if (index >= digits.length()) return;
        var s = map[digits.charAt(index) - '0'];
        // System.out.println(s);
        for(var i : s.toCharArray()) {
            dfs(index + 1, path + i);
        }
    }
}
// @lc code=end

