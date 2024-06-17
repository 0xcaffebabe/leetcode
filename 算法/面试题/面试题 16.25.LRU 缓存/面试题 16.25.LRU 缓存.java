/*
 * @lc app=leetcode.cn id=面试题 16.25 lang=java
 * @lcpr version=
 *
 * [面试题 16.25] LRU 缓存
 * 
 * 18/18 cases passed (27 ms)
 * Your runtime beats 14.48 % of java submissions
 * Your memory usage beats 37.26 % of java submissions (55.3 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.LinkedHashMap;

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


/*
// @lcpr case=start
// ["LRUCache","put","put","get","put","get","put","get","get","get"]\n[[2],[1,1],[2,2],[1],[3,3],[2],[4,4],[1],[3],[4]]\n
// @lcpr case=end

 */
