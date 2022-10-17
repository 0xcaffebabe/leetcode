import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=819 lang=java
 *
 * [819] 最常见的单词
 * 
 * 48/48 cases passed (15 ms)
 * Your runtime beats 20.95 % of java submissions
 * Your memory usage beats 66.09 % of java submissions (41.2 MB)
 */

// @lc code=start
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bset = new HashSet<>();
        Map<String, Integer> frq = new HashMap<>();
        for(var i : banned) bset.add(i.toLowerCase());
        
        List<String> words = new ArrayList<>();
        StringBuilder buffer = new StringBuilder();
        for(int i = 0; i < paragraph.length(); i++) {
            char c = paragraph.charAt(i);
            if (!isLetter(c) && buffer.length() != 0) {
                var word = buffer.toString().toLowerCase();
                words.add(word);
                frq.putIfAbsent(word, 0);
                frq.put(word, frq.get(word) + 1);
                buffer.delete(0, buffer.length());
            } else {
                if (isLetter(c)) buffer.append(c);
            }
        }
        if (buffer.length() != 0) {
            var word = buffer.toString().toLowerCase();
            words.add(word);
            frq.putIfAbsent(word, 0);
            frq.put(word, frq.get(word) + 1);
            buffer.delete(0, buffer.length());
        }

        Collections.sort(words, (b,a) -> frq.get(a) - frq.get(b));
        // System.out.println(words);
        for(var i : words) {
            if (!bset.contains(i)) return i;
        }
        return "";
    }

    private boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
}
// @lc code=end

