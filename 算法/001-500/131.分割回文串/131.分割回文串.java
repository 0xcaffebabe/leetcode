/*
 * @lc app=leetcode.cn id=131 lang=java
 * @lcpr version=
 *
 * [131] 分割回文串
 * 
 * 32/32 cases passed (8 ms)
 * Your runtime beats 58.3 % of java submissions
 * Your memory usage beats 11.2 % of java submissions (55.6 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<List<String>> ans = new ArrayList<>();
    List<String> list = new ArrayList<>();
    String str;
    public List<List<String>> partition(String s) {
        this.str = s;
        dfs(0);
        return ans;
    }

    void dfs(int start) {
        // System.out.println(start);
        if (start >= str.length()) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = 1; i <= str.length() - start; i++) {
            var s = str.substring(start, i + start);
            if (isPalindrome(s)) {
                // System.out.println(s + "|" + start + "," + i);
                list.add(s);
                dfs(start + i);
                list.remove(list.size() - 1);
            }
        }
    }

    boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "aab"\n
// "aa"\n
// "ab"\n
// "abc"\n
// "aaa"\n
// @lcpr case=end

// @lcpr case=start
// "a"\n
// @lcpr case=end

 */

