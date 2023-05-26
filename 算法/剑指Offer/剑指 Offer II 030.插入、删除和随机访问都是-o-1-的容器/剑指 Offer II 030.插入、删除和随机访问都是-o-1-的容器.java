/*
 * @lc app=leetcode.cn id=剑指 Offer II 030 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 030] 插入、删除和随机访问都是 O(1) 的容器
 * 
 * 19/19 cases passed (26 ms)
 * Your runtime beats 38.77 % of java submissions
 * Your memory usage beats 79.3 % of java submissions (87.2 MB)
 */

// @lc code=start
class RandomizedSet {
    Map<Integer, Integer> map = new HashMap<>();
    List<Integer> list = new ArrayList<>();
    Random rnd = new Random();

    public RandomizedSet() {

    }
    
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }
    
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int index = map.get(val);
        
        // 将数组最后一个位置的值迁到 index 的位置 避免删除导致的数组移动
        int lastVal = list.get(list.size() - 1);
        list.set(index, lastVal);
        list.remove(list.size() - 1);
        map.put(lastVal, index);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        return list.get(rnd.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
// @lc code=end



/*
// @lcpr case=start
// ["RandomizedSet", "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"]\n[[], [1], [2], [2], [], [1], [2], []]\n
// @lcpr case=end

 */

