/*
 * @lc app=leetcode.cn id=剑指 Offer II 031 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 031] 最近最少使用缓存
 * 
 * 21/21 cases passed (80 ms)
 * Your runtime beats 13.77 % of java submissions
 * Your memory usage beats 5.05 % of java submissions (125.2 MB)
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

/*
// @lcpr case=start
// ["LRUCache","put","put","get","put","get","put","get","get","get"]\n
[[2],[1,1],[2,2],[1],[3,3],[2],[4,4],[1],[3],[4]]\n
// @lcpr case=end

*/

