/*
 * @lc app=leetcode.cn id=剑指 Offer II 062 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 062] 实现前缀树
 * 
 * 15/15 cases passed (31 ms)
 * Your runtime beats 82.42 % of java submissions
 * Your memory usage beats 24.51 % of java submissions (53.2 MB)
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



