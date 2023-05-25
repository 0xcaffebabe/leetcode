/*
 * @lc app=leetcode.cn id=1396 lang=java
 * @lcpr version=21908
 *
 * [1396] 设计地铁系统
 * 
 * 56/56 cases passed (92 ms)
 * Your runtime beats 66.38 % of java submissions
 * Your memory usage beats 57.76 % of java submissions (54.3 MB)
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class UndergroundSystem {
    Map<Integer, String> beginStattion = new HashMap<>();    
    Map<Integer, Integer> beginTime = new HashMap<>();
    Map<String, Integer> timeStat = new HashMap<>();
    Map<String, Integer> frqStat = new HashMap<>();

    public UndergroundSystem() {}
    
    public void checkIn(int id, String stationName, int t) {
        beginStattion.put(id, stationName);
        beginTime.put(id, t);
    }
    
    public void checkOut(int id, String stationName, int t) {
        var startStation = beginStattion.get(id);
        var startTime = beginTime.get(id);
        var line = startStation + "-" + stationName;
        timeStat.put(line, timeStat.getOrDefault(line, 0) + (t - startTime));
        frqStat.put(line, frqStat.getOrDefault(line, 0) + 1);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        var line = startStation + "-" + endStation;
        var frq = frqStat.getOrDefault(line, 0);
        var time = timeStat.getOrDefault(line, 0);
        if (frq == 0) return 0d;
        return time * 1d / frq;
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
// @lc code=end


/*
// @lcpr case=start
// ["UndergroundSystem","checkIn","checkIn","checkIn","checkOut","checkOut","checkOut","getAverageTime","getAverageTime","checkIn","getAverageTime","checkOut","getAverageTime"]\n
[[],[45,"Leyton",3],[32,"Paradise",8],[27,"Leyton",10],[45,"Waterloo",15],[27,"Waterloo",20],[32,"Cambridge",22],["Paradise","Cambridge"],["Leyton","Waterloo"],[10,"Leyton",24],["Leyton","Waterloo"],[10,"Waterloo",38],["Leyton","Waterloo"]]\n
// @lcpr case=end

// @lcpr case=start
// ["UndergroundSystem","checkIn","checkOut","getAverageTime","checkIn","checkOut","getAverageTime","checkIn","checkOut","getAverageTime"]\n
[[],[10,"Leyton",3],[10,"Paradise",8],["Leyton","Paradise"],[5,"Leyton",10],[5,"Paradise",16],["Leyton","Paradise"],[2,"Leyton",21],[2,"Paradise",30],["Leyton","Paradise"]]\n
// @lcpr case=end


 */

