/*
 * @lc app=leetcode.cn id=1352 lang=java
 * @lcpr version=21907
 *
 * [1352] 最后 K 个数的乘积
 * 17ms
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class ProductOfNumbers {

    private List<Integer> list = new ArrayList<>();

    public ProductOfNumbers() {}
    
    public void add(int num) {
        if (num == 0) list.clear();
        else {
            if (list.size() == 0) list.add(1);
            list.add(num * list.get(list.size() - 1));
        }
    }
    
    public int getProduct(int k) {
        var sz = list.size();
        if (sz <= k || sz == 0) return 0;
        return list.get(sz - 1) / list.get(sz - 1 - k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
// @lc code=end



/*
// @lcpr case=start
// ["ProductOfNumbers","add","add","add","add","add","getProduct","getProduct","getProduct","add","getProduct"]\n[[],[3],[0],[2],[5],[4],[2],[3],[4],[8],[2]]\n
// @lcpr case=end

 */

