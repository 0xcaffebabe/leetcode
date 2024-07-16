/*
 * @lc app=leetcode.cn id=1797 lang=java
 * @lcpr version=
 *
 * [1797] 设计一个验证系统
 * 
 * 91/91 cases passed (58 ms)
 * Your runtime beats 33.33 % of java submissions
 * Your memory usage beats 16.67 % of java submissions (45.4 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.HashMap;
import java.util.Map;

class AuthenticationManager {
    int ttl;
    Map<String, Integer> expireMap = new HashMap<>();
    public AuthenticationManager(int timeToLive) {
        this.ttl = timeToLive;
    }
    
    public void generate(String tokenId, int currentTime) {
        expireMap.put(tokenId, currentTime + ttl);
    }
    
    public void renew(String tokenId, int currentTime) {
        var expireTime = expireMap.get(tokenId);
        if (expireTime == null) return;
        if (expireTime <= currentTime) {
            expireMap.remove(tokenId);
            return;
        }
        expireMap.put(tokenId, currentTime + ttl);
    }
    
    public int countUnexpiredTokens(int currentTime) {
        int cnt = 0;
        for(var enr: expireMap.entrySet()) {
            if (enr.getValue() > currentTime) cnt++;
        }
        return cnt;
    }
}

/**
 * Your AuthenticationManager object will be instantiated and called as such:
 * AuthenticationManager obj = new AuthenticationManager(timeToLive);
 * obj.generate(tokenId,currentTime);
 * obj.renew(tokenId,currentTime);
 * int param_3 = obj.countUnexpiredTokens(currentTime);
 */
// @lc code=end



/*
// @lcpr case=start
// ["AuthenticationManager", "renew", "generate", "countUnexpiredTokens", "generate", "renew", "renew","countUnexpiredTokens"]\n
// [[5], ["aaa", 1], ["aaa", 2], [6], ["bbb", 7], ["aaa", 8], ["bbb", 10], [15]]\n
// @lcpr case=end

 */

