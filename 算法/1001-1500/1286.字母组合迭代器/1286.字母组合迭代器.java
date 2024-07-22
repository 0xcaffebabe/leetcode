/*
 * @lc app=leetcode.cn id=1286 lang=java
 * @lcpr version=
 *
 * [1286] 字母组合迭代器
 * 
 * 17/17 cases passed (10 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 21.21 % of java submissions (44.8 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.List;

class CombinationIterator {

    private List<String> data = new ArrayList<>();
    char[] chars;
    int n;
    int cur = 0;

    public CombinationIterator(String characters, int combinationLength) {
        this.n = combinationLength;
        this.chars = characters.toCharArray();
        bt(new StringBuilder(), -1);
    }

    void bt(StringBuilder sb, int s) {
        if (sb.length() == n) {
            data.add(sb.toString());
            return;
        }
        for(int i = s + 1; i < chars.length; i++) {
            sb.append(chars[i]);
            bt(sb, i);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    
    public String next() {
        return data.get(cur++);
    }
    
    public boolean hasNext() {
        return cur < data.size();
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
// @lc code=end



/*
// @lcpr case=start
// ["CombinationIterator", "next", "hasNext", "next", "hasNext", "next", "hasNext"]\n
// [["abc", 2], [], [], [], [], [], []]\n
// ["CombinationIterator", "next", "hasNext"]\n
// [["a", 1], [], []]\n
// @lcpr case=end

 */

