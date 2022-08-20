import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1357 lang=java
 *
 * [1357] 每隔 n 个顾客打折
 * 
 * 25/25 cases passed (133 ms)
 * Your runtime beats 14.17 % of java submissions
 * Your memory usage beats 47.24 % of java submissions (69.7 MB)
 */

// @lc code=start
class Cashier {
    Map<Integer, Integer> priceMap = new HashMap<>();
    int n;
    int pos = 1;
    int discount;
    public Cashier(int n, int discount, int[] products, int[] prices) {
        this.n = n;
        this.discount = discount;
        for(int i = 0; i < products.length; i++) priceMap.put(products[i], prices[i]);
        
    }
    
    public double getBill(int[] product, int[] amount) {
        double ans = 0;
        for(int i = 0; i < product.length; i++) {
            int p = product[i];
            int a = amount[i];
            ans += a * priceMap.get(p);
        }
        if (pos % n == 0) ans = ans - (discount * ans) / 100;
        pos++;
        
        return ans;
    }
}

/**
 * Your Cashier object will be instantiated and called as such:
 * Cashier obj = new Cashier(n, discount, products, prices);
 * double param_1 = obj.getBill(product,amount);
 */
// @lc code=end

