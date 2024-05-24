/*
 * @lc app=leetcode.cn id=990 lang=java
 * @lcpr version=
 *
 * [990] 等式方程的可满足性
 * 
 * 181/181 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 60.28 % of java submissions (40.9 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start



class Solution {
    int[] parent = new int[26];
    public boolean equationsPossible(String[] equations) {
        for(int i = 0; i < 26; i++) parent[i] = i;
        for(var eq: equations) {
            if (eq.charAt(1) == '=') {
                int a = eq.charAt(0) - 'a';
                int b = eq.charAt(3) - 'a';
                union(a, b);
            }
        }
        for(var eq: equations) {
            if (eq.charAt(1) == '!') {
                int a = eq.charAt(0) - 'a';
                int b = eq.charAt(3) - 'a';
                if (find(a) == find(b)) return false;
            }
        }
        return true;
    }

    void union(int a, int b) {
        parent[find(a)] = find(b);
    }

    int find(int index) {
        while(parent[index] != index) {
            parent[index] = parent[parent[index]];
            index = parent[index];
        }
        return index;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["a==b","b!=a"]\n
// ["b==a","a==b"]\n
// ["a==b","b==c","a==c"]\n
// ["a==b","b!=c","c==a"]\n
// ["c==c","b==d","x!=z"]\n
// ["a==b"]\n
// ["a==a"]\n
// ["a==a", "a!=b"]\n
// ["a==a", "a==c", "a!=b"]\n
// ["a==a", "a==c", "a!=c"]\n
// ["a==d", "a==c", "a!=c"]\n
// ["a!=a"]\n
// @lcpr case=end

 */

