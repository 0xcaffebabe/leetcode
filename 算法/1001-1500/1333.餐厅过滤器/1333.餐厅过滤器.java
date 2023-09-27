/*
 * @lc app=leetcode.cn id=1333 lang=java
 * @lcpr version=
 *
 * [1333] 餐厅过滤器
 * 
 * 53/53 cases passed (10 ms)
 * Your runtime beats 35.82 % of java submissions
 * Your memory usage beats 47.76 % of java submissions (49.4 MB)
 */

// @lc code=start

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        return Arrays.stream(restaurants)
            .filter(v -> veganFriendly == 1 ? v[2] == veganFriendly: true)
            .filter(v -> v[3] <= maxPrice)
            .filter(v -> v[4] <= maxDistance)
            .sorted((b,a) -> {
                if (a[1] != b[1]) return Integer.compare(a[1], b[1]);
                return Integer.compare(a[0], b[0]);
            })
            .map(v -> v[0])
            .collect(Collectors.toList());
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,4,1,40,10],[2,8,0,50,5],[3,8,1,30,4],[4,10,0,10,3],[5,1,1,15,1]]\n1\n50\n10\n
// @lcpr case=end

// @lcpr case=start
// [[1,4,1,40,10],[2,8,0,50,5],[3,8,1,30,4],[4,10,0,10,3],[5,1,1,15,1]]\n0\n50\n10\n
// @lcpr case=end

// @lcpr case=start
// [[1,4,1,40,10],[2,8,0,50,5],[3,8,1,30,4],[4,10,0,10,3],[5,1,1,15,1]]\n0\n30\n3\n
// @lcpr case=end

 */

