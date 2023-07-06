/*
 * @lc app=leetcode.cn id=609 lang=java
 * @lcpr version=21909
 *
 * [609] 在系统中查找重复文件
 * 
 * 162/162 cases passed (30 ms)
 * Your runtime beats 9.22 % of java submissions
 * Your memory usage beats 91.49 % of java submissions (50.1 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        for (var p : paths) {
            String[] split = p.split(" ");
            var dir = split[0];
            for(int i = 1; i < split.length; i++) {
                var ss = split[i].split("\\(");
                var file = ss[0];
                var content = ss[1].replace("\\)", "");
                map.computeIfAbsent(content, k -> new ArrayList<>());
                map.get(content).add(dir + "/" + file);
            }
        }
        return map.values()
                .stream()
                .filter(v -> v.size() > 1)
                .collect(Collectors.toList());
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"]\n
// @lcpr case=end

// @lcpr case=start
// ["root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)"]\n
// @lcpr case=end

 */

