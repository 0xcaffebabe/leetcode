/*
 * @lc app=leetcode.cn id=500 lang=java
 *
 * [500] 键盘行
 * 
 * 22/22 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 75.02 % of java submissions (39.3 MB)
 */

// @lc code=start
class Solution {
    private static final Set<Character> line1 = Set.of('q','w','e','r','t','y','u','i','o','p');
    private static final Set<Character> line2 = Set.of('a','s','d','f','g','h','j','k','l');
    private static final Set<Character> line3 = Set.of('z','x','c','v','b','n','m');
    public String[] findWords(String[] words) {
        
        List<String> ans = new ArrayList<>();
        for(var word: words) {
            boolean allContains = true;
            Set<Character> line = null;
            for(var c : word.toLowerCase().toCharArray()) {
                if (line == null) {
                    if (line1.contains(c)) line = line1;
                    else if (line2.contains(c)) line = line2;
                    else if (line3.contains(c)) line = line3;
                    continue;
                }
                allContains &= line.contains(c);
            }
            if (allContains) ans.add(word);
        }
        return ans.toArray(new String[]{});
    }
}
// @lc code=end

