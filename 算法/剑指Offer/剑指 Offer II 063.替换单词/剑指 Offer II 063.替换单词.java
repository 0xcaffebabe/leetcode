/*
 * @lc app=leetcode.cn id=剑指 Offer II 063 lang=java
 * @lcpr version=21909
 *
 * [剑指 Offer II 063] 替换单词
 * 
 * 126/126 cases passed (27 ms)
 * Your runtime beats 34.05 % of java submissions
 * Your memory usage beats 86.2 % of java submissions (45.1 MB)
 */

// @lc code=start
class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Collections.sort(dictionary, (a, b) -> a.length() - b.length());
        String[] split = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for(var i : split) {
            var t = i;
            for(var j : dictionary) {
                if (i.startsWith(j)) {
                    t = j;
                    break;
                }
            }
            sb.append(t + " ");
        }
        return sb.toString().substring(0, sb.length() - 1);
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["cat","bat","rat"]\n"the cattle was rattled by the battery"\n
// @lcpr case=end

// @lcpr case=start
// ["a","b","c"]\n"aadsfasf absbs bbab cadsfafs"\n
// @lcpr case=end

// @lcpr case=start
// ["a", "aa", "aaa", "aaaa"]\n"a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa"\n
// @lcpr case=end

// @lcpr case=start
// ["catt","cat","bat","rat"]\n"the cattle was rattled by the battery"\n
// @lcpr case=end

// @lcpr case=start
// ["ac","ab"]\n"it is abnormal that this solution is accepted"\n
// @lcpr case=end

 */

