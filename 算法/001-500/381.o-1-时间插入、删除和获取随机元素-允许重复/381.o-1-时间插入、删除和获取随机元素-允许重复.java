/*
 * @lc app=leetcode.cn id=381 lang=java
 *
 * [381] O(1) 时间插入、删除和获取随机元素 - 允许重复
 * 
 * 32/32 cases passed (37 ms)
 * Your runtime beats 21.43 % of java submissions
 * Your memory usage beats 5.11 % of java submissions (93.4 MB)
 */

// @lc code=start
class RandomizedCollection {
    Map<Integer, Set<Integer>> locMap = new HashMap<>();
    List<Integer> nums = new ArrayList<>();
    public RandomizedCollection() {

    }
    
    public boolean insert(int val) {
        locMap.computeIfAbsent(val, key -> new HashSet<>());
        var loc = locMap.get(val);
        nums.add(val);
        loc.add(nums.size() - 1);
        // System.out.println(nums);
        return loc.size() == 1;
    }
    
    public boolean remove(int val) {
        if (!locMap.containsKey(val)) return false;
        var loc = locMap.get(val);

        // 交换最后一个元素到被删除的位置
        int delIndex = loc.iterator().next();
        int lastNum = nums.get(nums.size() - 1);
        nums.set(delIndex, lastNum);
        // 选择当前元素的某个位置删除
        loc.remove(delIndex);
        // 记得删除最后一个元素的最后位置的地址映射 然后添加交换位置的映射
        locMap.get(lastNum).remove(nums.size() - 1);
        if (delIndex < nums.size() - 1) locMap.get(lastNum).add(delIndex);
        // System.out.println(nums);

        if (loc.size() == 0) locMap.remove(val);

        nums.remove(nums.size() - 1);
        return true;
    }
    
    public int getRandom() {
        Random rnd = new Random();
        return nums.get(rnd.nextInt(nums.size()));
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
// @lc code=end

