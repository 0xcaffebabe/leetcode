/*
 * @lc app=leetcode.cn id=2437 lang=java
 * @lcpr version=21907
 *
 * [2437] 有效时间的数目
 * 
 * 53/53 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 73.68 % of java submissions (39.2 MB)
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    private static Map<String, Integer> hours = new HashMap<>();

    static {
        
        hours.put("?0", 3);
        hours.put("?1", 3);
        hours.put("?2", 3);
        hours.put("?3", 3);
        hours.put("?4", 2);
        hours.put("?5", 2);
        hours.put("?6", 2);
        hours.put("?7", 2);
        hours.put("?8", 2);
        hours.put("?9", 2);

        hours.put("0?", 10);
        hours.put("1?", 10);
        hours.put("2?", 4);

        hours.put("??", 24);
        
    }

    private static Map<String, Integer> mintues = new HashMap<>();

    static {
        mintues.put("?0", 6);
        mintues.put("?1", 6);
        mintues.put("?2", 6);
        mintues.put("?3", 6);
        mintues.put("?4", 6);
        mintues.put("?5", 6);
        mintues.put("?6", 6);
        mintues.put("?7", 6);
        mintues.put("?8", 6);
        mintues.put("?9", 6);

        mintues.put("0?", 10);
        mintues.put("1?", 10);
        mintues.put("2?", 10);
        mintues.put("3?", 10);
        mintues.put("4?", 10);
        mintues.put("5?", 10);
        mintues.put("6?", 10);
        mintues.put("7?", 10);
        mintues.put("8?", 10);
        mintues.put("9?", 10);

        mintues.put("??", 60);
    }

    public int countTime(String time) {
        String[] split = time.split(":");
        var a = hours.getOrDefault(split[0], 1);
        var b = mintues.getOrDefault(split[1], 1);
        return a * b;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "?5:00"\n
// @lcpr case=end

// @lcpr case=start
// "0?:0?"\n
// @lcpr case=end

// @lcpr case=start
// "??:??"\n
// @lcpr case=end

// @lcpr case=start
// "15:59"\n
// @lcpr case=end

// @lcpr case=start
// "?2:16"\n
// @lcpr case=end

 */

