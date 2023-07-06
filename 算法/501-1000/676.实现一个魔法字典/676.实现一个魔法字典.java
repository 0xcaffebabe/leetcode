/*
 * @lc app=leetcode.cn id=676 lang=java
 * @lcpr version=21909
 *
 * [676] 实现一个魔法字典
 * 
 * 83/83 cases passed (28 ms)
 * Your runtime beats 56.3 % of java submissions
 * Your memory usage beats 65.15 % of java submissions (43.1 MB)
 */

// @lc code=start
class MagicDictionary {
    String[] dictionary;
    public MagicDictionary() {}
    
    public void buildDict(String[] dictionary) {
        this.dictionary = dictionary;
    }
    
    public boolean search(String searchWord) {
        for(var i : dictionary) {
            if (i.length() != searchWord.length()) continue;

            int dif = 0;
            for(int id = 0; id < i.length(); id++) {
                if (i.charAt(id) != searchWord.charAt(id)) dif++;
            }
            if (dif == 1) return true;
        }
        return false;
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dictionary);
 * boolean param_2 = obj.search(searchWord);
 */
// @lc code=end

/*
// @lcpr case=start
// ["MagicDictionary", "buildDict", "search", "search", "search", "search"]\n
// [[], [["hello","leetcode"]], ["hello"], ["hhllo"], ["hell"], ["leetcoded"]]\n
// ["MagicDictionary", "buildDict", "search", "search", "search", "search"]\n
// [[], [["hello","hallo","leetcode"]], ["hello"], ["hhllo"], ["hell"], ["leetcoded"]]
// @lcpr case=end
*/
