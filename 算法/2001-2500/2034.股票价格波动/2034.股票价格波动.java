import java.util.HashMap;
import java.util.TreeMap;

/*
 * @lc app=leetcode.cn id=2034 lang=java
 *
 * [2034] 股票价格波动
 * 
 * 18/18 cases passed (114 ms)
 * Your runtime beats 74.28 % of java submissions
 * Your memory usage beats 59.78 % of java submissions (91.3 MB)
 */

// @lc code=start
class StockPrice {
    HashMap<Integer, Integer> timepPrice = new HashMap<>(32);
    TreeMap<Integer, Integer> priceCountMap = new TreeMap<>();
    int maxTime;

    public StockPrice() {

    }
    
    public void update(int timestamp, int price) {
        if (timestamp > maxTime) maxTime = timestamp;
        Integer prePrice = timepPrice.get(timestamp);
        if (prePrice != null) {
            int count = priceCountMap.get(prePrice);
            if (count > 1) priceCountMap.put(prePrice, count - 1);
            else priceCountMap.remove(prePrice);
        }

        timepPrice.put(timestamp, price);
        priceCountMap.put(price, priceCountMap.getOrDefault(price, 0) + 1);

    }
    
    public int current() {
        return timepPrice.get(maxTime);
    }
    
    public int maximum() {
        return priceCountMap.lastKey();
    }
    
    public int minimum() {
        return priceCountMap.firstKey();
    }
}

/**
 * Your StockPrice object will be instantiated and called as such:
 * StockPrice obj = new StockPrice();
 * obj.update(timestamp,price);
 * int param_2 = obj.current();
 * int param_3 = obj.maximum();
 * int param_4 = obj.minimum();
 */
// @lc code=end

