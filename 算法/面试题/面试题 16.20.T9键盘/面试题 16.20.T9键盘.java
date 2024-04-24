/*
 * @lc app=leetcode.cn id=面试题 16.20 lang=java
 * @lcpr version=
 *
 * [面试题 16.20] T9键盘
 * 
 * 33/33 cases passed (21 ms)
 * Your runtime beats 32.77 % of java submissions
 * Your memory usage beats 31.09 % of java submissions (45.6 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    static Map<Character, Character> map = new HashMap<>(); 
    static {
        map.put('a', '2');
        map.put('b', '2');
        map.put('c', '2');
        map.put('d', '3');
        map.put('e', '3');
        map.put('f', '3');
        map.put('g', '4');
        map.put('h', '4');
        map.put('i', '4');
        map.put('j', '5');
        map.put('k', '5');
        map.put('l', '5');
        map.put('m', '6');
        map.put('n', '6');
        map.put('o', '6');
        map.put('p', '7');
        map.put('q', '7');
        map.put('r', '7');
        map.put('s', '7');
        map.put('t', '8');
        map.put('u', '8');
        map.put('v', '8');
        map.put('w', '9');
        map.put('x', '9');
        map.put('y', '9');
        map.put('z', '9');
    }
        
    public List<String> getValidT9Words(String num, String[] words) {
        
        Map<String, List<String>> wordMap = new HashMap<>();
        for(var i : words) {
            StringBuilder sb = new StringBuilder();
            for(var c: i.toCharArray()) sb.append(map.get(c));
            wordMap.computeIfAbsent(sb.toString(), k -> new ArrayList<>())
                .add(i);
        }
        return wordMap.getOrDefault(num, new ArrayList<>());
    }
}
// @lc code=end



/*
// @lcpr case=start
// "8733"\n["tree", "used"]\n
// @lcpr case=end

// @lcpr case=start
// "2"\n["a", "b", "c", "d"]\n
// "3"\n["a", "b", "c", "d"]\n
// "4"\n["a", "b", "c", "d"]\n
// @lcpr case=end

 */

