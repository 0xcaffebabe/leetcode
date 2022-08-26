import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=895 lang=java
 *
 * [895] 最大频率栈
 * 
 * 38/38 cases passed (27 ms)
 * Your runtime beats 94.88 % of java submissions
 * Your memory usage beats 85.16 % of java submissions (50 MB)
 */

// @lc code=start
class FreqStack {
    Map<Integer, Integer> frq = new HashMap<>();
    Map<Integer, LinkedList<Integer>> group = new HashMap<>();
    int maxF;
    public FreqStack() {}
    
    public void push(int val) {
        int cf = frq.getOrDefault(val, 0) + 1;
        frq.put(val, cf);
        if (cf > maxF) maxF = cf;
        // 存储当前频率出现过的数字
        group.computeIfAbsent(cf, key -> new LinkedList<>()).push(val);
    }
    
    public int pop() {
        int x = group.get(maxF).pop();
        frq.put(x, frq.get(x) - 1);
        if (group.get(maxF).size() == 0) maxF--;
        return x;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */
// @lc code=end

