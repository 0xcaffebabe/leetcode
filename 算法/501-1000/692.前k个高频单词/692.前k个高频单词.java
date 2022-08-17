import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=692 lang=java
 *
 * [692] 前K个高频单词
 * 
 * 110/110 cases passed (7 ms)
 * Your runtime beats 24.96 % of java submissions
 * Your memory usage beats 54.39 % of java submissions (41.7 MB)
 */

// @lc code=start
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for(var i : words) map.put(i, map.getOrDefault(i, 0) + 1);
        PriorityQueue<Pair> que = new PriorityQueue<>((a, b) -> {
            return b.cnt == a.cnt ? b.key.compareTo(a.key): a.cnt - b.cnt;
        });
        for(var enr: map.entrySet()) {
            var pair = new Pair();
            pair.key = enr.getKey();
            pair.cnt = enr.getValue();
            que.offer(pair);
            if (que.size() > k) que.remove();
        }
        // System.out.println(que);
        List<String> ans = new ArrayList<>();
        while(!que.isEmpty()) ans.add(que.poll().key);
        Collections.reverse(ans);
        return ans;
    }
}

class Pair {
    String key;
    int cnt;

    public String toString() {
        return key + "|" + cnt;
    }
}
// @lc code=end

