/*
 * @lc app=leetcode.cn id=1233 lang=java
 * @lcpr version=
 *
 * [1233] 删除子文件夹
 * 
 * 34/34 cases passed (35 ms)
 * Your runtime beats 95.88 % of java submissions
 * Your memory usage beats 76.29 % of java submissions (52.6 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> ans = new ArrayList<>();
        var cur = "//";
        for(var dir: folder) {
            if (!dir.startsWith(cur)) {
                cur = dir + "/";
                ans.add(dir);
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["/a","/a/b","/c/d","/c/d/e","/c/f"]\n
// ["/a/a","/a/ab"]\n
// @lcpr case=end

// @lcpr case=start
// ["/a","/a/b/c","/a/b/d"]\n
// @lcpr case=end

// @lcpr case=start
// ["/a/b/c","/a/b/ca","/a/b/d"]\n
// @lcpr case=end

 */

