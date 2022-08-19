import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=451 lang=java
 *
 * [451] 根据字符出现频率排序
 * 
 * 33/33 cases passed (12 ms)
 * Your runtime beats 72.99 % of java submissions
 * Your memory usage beats 27.41 % of java submissions (42.5 MB)
 */

// @lc code=start
class Solution {
    public String frequencySort(String s) {
        PriorityQueue<Pair> que = new PriorityQueue<>((b, a) -> {
            return a.cnt == b.cnt ? a.val - b.val : a.cnt - b.cnt;
        });
        Map<Character, Integer> map = new HashMap<>();
        for(var c: s.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        for(var enr: map.entrySet()) {
            var p = new Pair();
            p.val = enr.getKey();
            p.cnt = enr.getValue();
            que.offer(p);
        }
        StringBuilder sb = new StringBuilder();
        while(!que.isEmpty()) {
            var p = que.poll();
            for(int i = 0; i < p.cnt; i++) sb.append(p.val);
        }

        return sb.toString();
    }
}

class Pair {
    char val;
    int cnt;
}
// @lc code=end

