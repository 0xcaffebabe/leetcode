/*
 * @lc app=leetcode.cn id=844 lang=java
 *
 * [844] 比较含退格的字符串
 * 
 * 114/114 cases passed (1 ms)
 * Your runtime beats 51.97 % of java submissions
 * Your memory usage beats 18.95 % of java submissions (39.9 MB)
 */

// @lc code=start
class Solution {
    public boolean backspaceCompare(String S, String T) {
        LinkedList<Character> s1 = new LinkedList<>();
        LinkedList<Character> s2 = new LinkedList<>();
        for(int i = 0;i<S.length();i++){
            char c = S.charAt(i);
            if (c == '#' && !s1.isEmpty()) s1.pop();
            else if(c != '#') s1.push(c);
        }
        for(int i = 0;i<T.length();i++){
            char c = T.charAt(i);
            if (c == '#' && !s2.isEmpty()) s2.pop();
            else if(c != '#') s2.push(c);
        }
        if (s1.size() != s2.size()) return false;
        while(!s1.isEmpty() && !s2.isEmpty()){
            if (s1.pop() != s2.pop()) return false;
        }
        return true;
    }
}
// @lc code=end

