import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=705 lang=java
 *
 * [705] 设计哈希集合
 * 
 * 33/33 cases passed (14 ms)
 * Your runtime beats 65.1 % of java submissions
 * Your memory usage beats 23.17 % of java submissions (49.2 MB)
 */

// @lc code=start
class MyHashSet {
    int size = 4096;
    List<Integer>[] data = new List[size];

    public MyHashSet() {

    }
    
    public void add(int key) {
        ensureSlotExits(key);
        if (!data[key % size].contains(key)) data[key % size].add(key);
    }

    
    public void remove(int key) {
        if (data[key % size] == null) return;
        data[key % size].removeIf(v -> v == key);
    }
    
    public boolean contains(int key) {
        if (data[key % size] == null) return false;
        return data[key % size].contains(key);
    }
    private void ensureSlotExits(int key) {
        if (data[key % size] == null) data[key % size] = new LinkedList<>();
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
// @lc code=end

