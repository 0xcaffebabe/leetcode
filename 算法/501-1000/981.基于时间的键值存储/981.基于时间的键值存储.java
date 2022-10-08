import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;

/*
 * @lc app=leetcode.cn id=981 lang=java
 *
 * [981] 基于时间的键值存储
 * 
 * 48/48 cases passed (160 ms)
 * Your runtime beats 25.44 % of java submissions
 * Your memory usage beats 35.99 % of java submissions (115.1 MB)
 */

// @lc code=start
class TimeMap {
    Map<String, TreeMap<Integer, String>> data = new HashMap<>();

    Function<String, TreeMap<Integer, String>> comp = k -> new TreeMap<>();

    public TimeMap() { }
    
    public void set(String key, String value, int timestamp) {
        data.computeIfAbsent(key, comp)
            .put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        var enr = data.computeIfAbsent(key, comp)
            .floorEntry(timestamp);
        return enr == null ? "" : enr.getValue();
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
// @lc code=end

