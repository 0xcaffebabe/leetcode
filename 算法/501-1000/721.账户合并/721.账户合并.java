/*
 * @lc app=leetcode.cn id=721 lang=java
 * @lcpr version=
 *
 * [721] 账户合并
 * 
 * 50/50 cases passed (58 ms)
 * Your runtime beats 14.48 % of java submissions
 * Your memory usage beats 8.48 % of java submissions (49.4 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {
    Map<String, List<String>> graph = new HashMap<>();
    Map<String, String> emailOwnerMap = new HashMap<>();
    Set<String> visted = new HashSet<>();
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        for(var account: accounts) {
            for(int i = 1; i < account.size(); i++) {
                emailOwnerMap.put(account.get(i), account.get(0));
                for(int j = 1; j < account.size(); j++) {
                    graph.computeIfAbsent(account.get(i), k -> new ArrayList<>())
                        .add(account.get(j));
                }
            }
        }
        
        // System.out.println(graph.get("johnnybravo@mail.com"));
        List<List<String>> ans = new ArrayList<>();
        for(var enr: graph.entrySet()) {
            List<String> list = new ArrayList<>();
            dfs(enr.getKey(), list);
            if (list.size() > 0) {
                Collections.sort(list);
                list.add(0, emailOwnerMap.get(enr.getKey()));
                ans.add(list);
            }
        }
        return ans;
    }

    void dfs(String v, List<String> list) {
        if (visted.contains(v)) return;
        list.add(v);
        visted.add(v);
        var neighbour = graph.get(v);
        for(var n: neighbour) {
            dfs(n, list);
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// [["John", "johnsmith@mail.com", "john00@mail.com"], ["John", "johnnybravo@mail.com"], ["John","johnsmith@mail.com", "john_newyork@mail.com"], ["Mary", "mary@mail.com"]]\n
// [["John", "johnsmith@mail.com", "john00@mail.com", "john_newyork@mail.com"], ["John", "johnnybravo@mail.com"], ["John","johnsmith@mail.com", "john_newyork@mail.com"], ["Mary", "mary@mail.com"]]\n
// @lcpr case=end

// @lcpr case=start
// [["Gabe","Gabe0@m.co","Gabe3@m.co","Gabe1@m.co"],["Kevin","Kevin3@m.co","Kevin5@m.co","Kevin0@m.co"],["Ethan","Ethan5@m.co","Ethan4@m.co","Ethan0@m.co"],["Hanzo","Hanzo3@m.co","Hanzo1@m.co","Hanzo0@m.co"],["Fern","Fern5@m.co","Fern1@m.co","Fern0@m.co"]]\n
// @lcpr case=end

 */

