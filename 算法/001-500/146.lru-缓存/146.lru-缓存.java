import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=146 lang=java
 *
 * [146] LRU 缓存
 * 
 * 22/22 cases passed (53 ms)
 * Your runtime beats 26.64 % of java submissions
 * Your memory usage beats 21.53 % of java submissions (115.6 MB)
 */

// @lc code=start
class LRUCache {
    LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>(32);
    

    int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public int get(int key) {
        renew(key);
        return map.getOrDefault(key, -1);
    }
    
    public void put(int key, int value) {
        renew(key);
        map.put(key, value);
        if (map.size() > capacity) invalidateOne();
    }

    private void renew(int key) {
        if (!map.containsKey(key)) return;
        map.put(key, map.remove(key));
    }

    private void invalidateOne() {
        Integer firstKey = null;
        for(var enr: map.entrySet()) {
            firstKey = enr.getKey();
            break;
        }
        if (firstKey != null) map.remove(firstKey);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
// @lc code=end

