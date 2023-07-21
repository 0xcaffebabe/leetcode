/*
 * @lc app=leetcode.cn id=423 lang=java
 * @lcpr version=21910
 *
 * [423] 从英文中重建数字
 * 
 * 24/24 cases passed (3 ms)
 * Your runtime beats 98.86 % of java submissions
 * Your memory usage beats 58.33 % of java submissions (42.8 MB)
 */

// @lc code=start

class Solution {
    int[] m = new int[128];
    public String originalDigits(String s) {
        for (char c : s.toCharArray()) m[c]++;

        int[] result = new int[10];
        String[] words = {"zero","six","eight","two","seven","five","four","three","one","nine"};
        int[] pos = {0,6,8,2,7,5,4,3,1,9};

        for (int i = 0; i < result.length; i++) {
            int[] data = new int[words[i].length()];
            int cnt = 0;
            for (char c : words[i].toCharArray()) 
                data[cnt++] = m[c];
            
            int nn = min(data);
            result[pos[i]] = nn;
            delete(words[i], nn);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result[i]; j++) {
                sb.append(i);
            }
        }
        return sb.toString();
    }

    void delete(String w, int n) {
       for (char c : w.toCharArray()) {
            m[c] -= n;
       }
    }

    int min(int...data) {
        int min = data[0];
        for (int i : data) min = Math.min(i, min);
        return min;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "owoztneoer"\n
// "oworzztnoeeoer"\n
// "zero four six two one five seven nine three eight"\n
// @lcpr case=end

// @lcpr case=start
// "fviefuro"\n
// "fvfieefuvroi"\n
// @lcpr case=end

 */

