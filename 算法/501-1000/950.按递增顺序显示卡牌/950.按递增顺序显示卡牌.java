/*
 * @lc app=leetcode.cn id=950 lang=java
 * @lcpr version=
 *
 * [950] 按递增顺序显示卡牌
 * 
 * 33/33 cases passed (3 ms)
 * Your runtime beats 94.2 % of java submissions
 * Your memory usage beats 62.32 % of java submissions (42.5 MB)
 */

// @lc code=start

import java.util.Arrays;
import java.util.LinkedList;

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        LinkedList<Integer> list = new LinkedList<>();
        list.add(deck[deck.length - 1]);
        for(int i = deck.length - 2; i >= 0; i--) {
            list.addFirst(list.removeLast());
            list.addFirst(deck[i]);
        }
        int[] ans = new int[list.size()];
        int i = 0;
        while(i < ans.length) ans[i++] = list.removeFirst();
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [17,13,11,2,3,5,7]\n
// [12,3,4,5,6,7,8]\n
// [1,2,3]\n
// [1,2]\n
// [1]\n
// @lcpr case=end

 */

