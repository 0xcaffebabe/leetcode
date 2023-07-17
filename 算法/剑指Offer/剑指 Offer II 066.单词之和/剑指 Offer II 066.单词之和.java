/*
 * @lc app=leetcode.cn id=剑指 Offer II 066 lang=java
 * @lcpr version=21909
 *
 * [剑指 Offer II 066] 单词之和
 * 
 * 34/34 cases passed (10 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 81.67 % of java submissions (40.4 MB)
 */

// @lc code=start
import java.util.HashMap;
import java.util.Map;

class MapSum {
    Map<String, Integer> map = new HashMap<>();
    public MapSum() {

    }
    
    public void insert(String key, int val) {
        map.put(key, val);
    }
    
    public int sum(String prefix) {
        int sum = 0;
        for (var enr : map.entrySet()) {
            if (enr.getKey().startsWith(prefix)) sum += enr.getValue();
        }
        return sum;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */
// @lc code=end



/*
// @lcpr case=start
// ["MapSum", "insert", "sum", "insert", "sum"]
// \n[[], ["apple", 3], ["ap"], ["app", 2], ["ap"]]\n
// @lcpr case=end

 */

