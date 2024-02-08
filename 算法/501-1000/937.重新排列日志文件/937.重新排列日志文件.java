/*
 * @lc app=leetcode.cn id=937 lang=java
 * @lcpr version=
 *
 * [937] 重新排列日志文件
 * 
 * 65/65 cases passed (5 ms)
 * Your runtime beats 67.48 % of java submissions
 * Your memory usage beats 50.41 % of java submissions (42.8 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] reorderLogFiles(String[] logs) {
        List<String[]> strings = new ArrayList<>();
        List<String> numbers = new ArrayList<>();
        for(var log: logs) {
            var arr = log.split(" ");
            if (arr[1].charAt(0) >= '0' && arr[1].charAt(0) <= '9') 
                numbers.add(log);
            else {
                strings.add(arr);
            }
        }
        strings.sort((a,b) -> {
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for(int i = 1; i < a.length; i++) sb1.append(a[i]).append(" ");
            sb1.delete(sb1.length() - 1, sb1.length());
            for(int i = 1; i < b.length; i++) sb2.append(b[i]).append(" ");
            sb2.delete(sb2.length() - 1, sb2.length());

            if (!sb1.toString().equals(sb2.toString()))
                return sb1.compareTo(sb2);
            return a[0].compareTo(b[0]);
        });
        // System.out.println(numbers);
        // for(var s: strings) System.out.print(Arrays.toString(s) + ", ");
        // System.out.println();
        String[] ans = new String[logs.length];
        int cnt = 0;
        for(int i = 0; i < strings.size(); i++) {
            ans[cnt++] = String.join(" ", strings.get(i));
        }
        for(int i = 0; i < numbers.size(); i++) {
            ans[cnt++] = numbers.get(i);
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["l evmbcyaqe zx", "pk amxcdvhuhavi", "cx 965 84 9 20", "b 401957007189", "ez xodjwnc awg", "96t oxgsdkuj j", "af 611441988 6", "l9d 21 6 77 795", "l khuxbzszqarfz", "4zj 6115548620", "l6 fzqtxlo qi j", "anr 76976970 17", "of vtqfbyxaxtce", "j 544232 60 554", "108 u amvyjml s"]\n
// ["dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"]\n
// @lcpr case=end

// @lcpr case=start
// ["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]\n
// ["j mo", "5 m w", "g 07", "o 2 0", "t q h"]\n
//  ["j 7 0", "i 23", "w 346", "g q w", "o krb"]\n
// ["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo","a2 act car"]
// @lcpr case=end

 */

