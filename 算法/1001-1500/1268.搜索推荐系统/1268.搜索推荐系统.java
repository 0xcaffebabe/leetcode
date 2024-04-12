/*
 * @lc app=leetcode.cn id=1268 lang=java
 * @lcpr version=
 *
 * [1268] 搜索推荐系统
 * 
 * 43/43 cases passed (45 ms)
 * Your runtime beats 35.08 % of java submissions
 * Your memory usage beats 95.69 % of java submissions (45.4 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> ans = new ArrayList<>();
        for(int i = 0; i < searchWord.length(); i++) {
            var word = searchWord.substring(0, i + 1);
            List<String> list = new ArrayList<>();
            for(var product: products) {
                if (list.size() >= 3) break;
                if (product.substring(0, Math.min(i + 1, product.length()))
                    .equals(word)) list.add(product);
            }
            ans.add(list);
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["mobile","mouse","moneypot","monitor","mousepad"]\n"mouse"\n
// @lcpr case=end

// @lcpr case=start
// ["havana"]\n"havana"\n
// @lcpr case=end

// @lcpr case=start
// ["bags","baggage","banner","box","cloths"]\n"bags"\n
// @lcpr case=end

// @lcpr case=start
// ["havana"]\n"tatiana"\n
// @lcpr case=end

 */

