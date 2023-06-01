/*
 * @lc app=leetcode.cn id=432 lang=java
 * @lcpr version=21908
 *
 * [432] 全 O(1) 的数据结构
 * 
 * 18/18 cases passed (55 ms)
 * Your runtime beats 18.18 % of java submissions
 * Your memory usage beats 90.43 % of java submissions (57.1 MB)
 */

// @lc code=start

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class AllOne {
    Map<String, Integer> map = new HashMap<>();
    TreeMap<Integer, Set<String>> countMap = new TreeMap<>();
    public AllOne() {}
    
    public void inc(String key) {
        var val = map.getOrDefault(key, 0);
        map.put(key, val + 1);

        countMap.computeIfAbsent(val + 1, k -> new HashSet<>());
        countMap.computeIfAbsent(val, k -> new HashSet<>());
        countMap.get(val + 1).add(key);
        countMap.get(val).remove(key);
        
        if (countMap.get(val).size() == 0) countMap.remove(val);
    }
    
    public void dec(String key) {
        var val = map.get(key);
        if (val == null) return;
        if (val == 1) {
            map.remove(key);
            countMap.get(val).remove(key);
            if (countMap.get(val).size() == 0) countMap.remove(val);
            return;
        }
        map.put(key, val - 1);

        countMap.computeIfAbsent(val - 1, k -> new HashSet<>());
        countMap.computeIfAbsent(val, k -> new HashSet<>());
        countMap.get(val - 1).add(key);
        countMap.get(val).remove(key);
        
        if (countMap.get(val).size() == 0) countMap.remove(val);
    }
    
    public String getMaxKey() {
        if (countMap.size() >= 1) {
            for (var s: countMap.get(countMap.lastKey())) return s;
        }
        return "";
    }
    
    public String getMinKey() {
        // System.out.println(countMap);
        if (countMap.size() >= 1) {
            for (var s: countMap.get(countMap.firstKey())) return s;
        }
        return "";
    }
}

/**
 * Your AllOne object will be instantiated and called as such:
 * AllOne obj = new AllOne();
 * obj.inc(key);
 * obj.dec(key);
 * String param_3 = obj.getMaxKey();
 * String param_4 = obj.getMinKey();
 */
// @lc code=end

/*
// @lcpr case=start
// ["AllOne", "inc", "inc", "getMaxKey", "getMinKey", "inc", "getMaxKey", "getMinKey", "dec", "getMaxKey", "getMinKey"]\n
[[], ["hello"], ["hello"], [], [], ["leet"], [], [], ["leet"], [], []]
// @lcpr case=end

// @lcpr case=start
// ["AllOne","inc","inc","inc","inc","inc","inc","dec", "dec","getMinKey","dec","getMaxKey","getMinKey"]\n
[[],["a"],["b"],["b"],["c"],["c"],["c"],["b"],["b"],[],["a"],[],[]]
// @lcpr case=end

 */

