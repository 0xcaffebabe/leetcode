import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=1694 lang=java
 *
 * [1694] 重新格式化电话号码
 * 
 * 108/108 cases passed (2 ms)
 * Your runtime beats 48.38 % of java submissions
 * Your memory usage beats 26 % of java submissions (40.1 MB)
 */

// @lc code=start
class Solution {
    public String reformatNumber(String number) {
        List<Character> list = new ArrayList<>();
        for(var c: number.toCharArray()) if (c >= '0' && c <= '9') list.add(c);
        
        boolean deci = false;
        if (list.size() != 1 && list.size() % 3 == 1) deci = true;

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < list.size(); i++) {
            if (i % 3 == 0) sb.append("-");
            if (list.size() - 4 == i && deci) {
                sb.append(list.get(i));
                sb.append(list.get(i+1));
                sb.append("-");
                sb.append(list.get(i+2));
                sb.append(list.get(i+3));
                break;
            }
            sb.append(list.get(i));
        }
        sb.delete(0, 1);
        return sb.toString();
    }
}
// @lc code=end

