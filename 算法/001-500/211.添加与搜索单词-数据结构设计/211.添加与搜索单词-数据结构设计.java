/*
 * @lc app=leetcode.cn id=211 lang=java
 * @lcpr version=21908
 *
 * [211] 添加与搜索单词 - 数据结构设计
 * 
 * 29/29 cases passed (172 ms)
 * Your runtime beats 91.05 % of java submissions
 * Your memory usage beats 57.16 % of java submissions (92.9 MB)
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class WordDictionary {
    Map<Integer, Node[]> map = new HashMap<>();

    public WordDictionary() {}
    
    public void addWord(String word) {
        var ori = map.computeIfAbsent(word.length(), key -> new Node[26]);
        for(var c: word.toCharArray()) {
            int idx = c - 'a';
            if (ori[idx] == null) ori[idx] = new Node();
            ori[idx].val = c;
            ori = ori[idx].next;
        }
    }
    
    public boolean search(String word) {
        if (word.length() == 0) return false;
        var head = map.get(word.length());
        if (head == null) return false;
        return search(word, 0, head);
    }
    boolean search(String word, int idx, Node[] nodes) {
        if (idx >= word.length()) return true;
        char c = word.charAt(idx);
        if (c == '.') {
            for(var node : nodes) {
                if (node == null) continue;
                if (search(word, idx + 1, node.next)) return true;
            }
            return false;
        } else {
            var node = nodes[c - 'a'];
            if (node == null) return false;
            return node.val == c && search(word, idx + 1, node.next);
        }
    }
}

class Node {
    char val;
    Node[] next = new Node[26];
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
// @lc code=end



/*
// @lcpr case=start
// ["WordDictionary","addWord","addWord","addWord","search","search","search","search", "search", "search", "search", "search"]\n
[[],["bad"],["dad"],["mad"],["pad"],["bad"],[".ad"],["b.."], ["bbbbbbb"], ["..d"], [".d"], ["..d"]]
// @lcpr case=end
// @lcpr case=start
// ["WordDictionary","addWord","addWord","addWord","addWord","search","search","addWord","search","search","search","search","search","search"]\n
[[],["at"],["and"],["an"],["add"],["a"],[".at"],["bat"],[".at"],["an."],["a.d."],["b."],["a.d"],["."]]
// @lcpr case=end

 */

