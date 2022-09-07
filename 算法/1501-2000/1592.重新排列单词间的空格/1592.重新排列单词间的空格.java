import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * @lc app=leetcode.cn id=1592 lang=java
 *
 * [1592] 重新排列单词间的空格
 * 
 * 89/89 cases passed (3 ms)
 * Your runtime beats 31.43 % of java submissions
 * Your memory usage beats 51.11 % of java submissions (39.7 MB)
 */

// @lc code=start
class Solution {
    public String reorderSpaces(String text) {
        int space = 0;
        for(var c: text.toCharArray()) if (c == ' ') space++;

        var arr = text.split(" ");
        List<String> words = new ArrayList<>();
        for(var s : arr) if (s.length() != 0) words.add(s);
        
        int interval = 0;
        int left = space;
        if (words.size() > 1) {
            interval = space / (words.size() - 1);
            left = space % (words.size() - 1);
        }

        String intervalSpace = genSpace(interval);
        String leftSpace = genSpace(left);

        return words.stream()
            .collect(Collectors.joining(intervalSpace)) + leftSpace;
    }

    private String genSpace(int n) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) sb.append(" ");
        return sb.toString();
    }
}
// @lc code=end

