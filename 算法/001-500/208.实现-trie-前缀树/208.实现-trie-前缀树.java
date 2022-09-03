import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=208 lang=java
 *
 * [208] 实现 Trie (前缀树)
 * 
 * 16/16 cases passed (33 ms)
 * Your runtime beats 72.16 % of java submissions
 * Your memory usage beats 17.36 % of java submissions (51.3 MB)
 */

// @lc code=start
class Trie {
    Node[] head = new Node[26];
    Set<String> set = new HashSet<>();
    public Trie() {}
    
    public void insert(String word) {
        var ori = head;
        for(var c: word.toCharArray()) {
            int idx = c - 'a';
            if (ori[idx] == null) ori[idx] = new Node();
            ori[idx].val = c;
            ori = ori[idx].next;
        }
        set.add(word);
    }
    
    public boolean search(String word) {
        return set.contains(word);
    }
    
    public boolean startsWith(String prefix) {
        var ori = head;
        for(var c: prefix.toCharArray()) {
            int idx = c - 'a';
            if (ori[idx] == null) return false;
            ori = ori[idx].next;
        }
        return true;
    }
}

class Node {
    char val;
    Node[] next = new Node[26];
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
// @lc code=end

