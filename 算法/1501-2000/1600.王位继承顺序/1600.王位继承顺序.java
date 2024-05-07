/*
 * @lc app=leetcode.cn id=1600 lang=java
 * @lcpr version=
 *
 * [1600] 王位继承顺序
 * 
 * 49/49 cases passed (259 ms)
 * Your runtime beats 90.97 % of java submissions
 * Your memory usage beats 15.46 % of java submissions (102.7 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class ThroneInheritance {
    String king;
    Map<String, List<String>> g = new HashMap<>();
    Set<String> deathMan = new HashSet<>();
    public ThroneInheritance(String kingName) {
        this.king = kingName;
    }
    
    public void birth(String parentName, String childName) {
        g.computeIfAbsent(parentName, k -> new ArrayList<>())
            .add(childName);
    }
    
    public void death(String name) {
        deathMan.add(name);
    }
    
    public List<String> getInheritanceOrder() {
        List<String> list = new ArrayList<>();
        dfs(king, list);
        return list;
    }
    void dfs(String name, List<String> list) {
        if (!deathMan.contains(name)) list.add(name);
        var children = g.get(name);
        if (children == null) return;
        for(var c: children) dfs(c, list);
    }
}

/**
 * Your ThroneInheritance object will be instantiated and called as such:
 * ThroneInheritance obj = new ThroneInheritance(kingName);
 * obj.birth(parentName,childName);
 * obj.death(name);
 * List<String> param_3 = obj.getInheritanceOrder();
 */
// @lc code=end



/*
// @lcpr case=start
// ["ThroneInheritance", "birth", "birth", "birth", "birth", "birth", "birth", "getInheritanceOrder", "death","getInheritanceOrder"]\n
// [["king"], ["king", "andy"], ["king", "bob"], ["king", "catherine"], ["andy", "matthew"], ["bob", "alex"], ["bob","asha"], [null], ["bob"], [null]]\n
// ["ThroneInheritance", "birth", "birth", "birth", "birth", "birth", "birth", "getInheritanceOrder", "death","getInheritanceOrder"]\n
// [["king"], ["king", "andy"], ["king", "bob"], ["king", "catherine"], ["andy", "matthew"], ["bob", "alex"], ["bob","asha"], [null], ["king"], [null]]\n
// @lcpr case=end

 */

