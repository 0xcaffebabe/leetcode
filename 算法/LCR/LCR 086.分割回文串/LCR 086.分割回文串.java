/*
 * @lc app=leetcode.cn id=LCR 086 lang=java
 * @lcpr version=
 *
 * [LCR 086] 分割回文串
 * 
 * 33/33 cases passed (26 ms)
 * Your runtime beats 17.87 % of java submissions
 * Your memory usage beats 14.44 % of java submissions (55.1 MB)
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
    public String[][] partition(String s) {
        this.str = s;
        dfs(0);
        String[][] res = new String[ans.size()][0];
        for(int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i).toArray(new String[]{});
        }
        return res;
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
// "google"\n
// @lcpr case=end

// @lcpr case=start
// "aab"\n
// @lcpr case=end

// @lcpr case=start
// "a"\n
// @lcpr case=end

 */

