/*
 * @lc app=leetcode.cn id=355 lang=java
 *
 * [355] 设计推特
 * 
 * 16/16 cases passed (9 ms)
 * Your runtime beats 87.09 % of java submissions
 * Your memory usage beats 33.39 % of java submissions (39.8 MB)
 */

// @lc code=start
class Twitter {

    Map<Integer, Set<Integer>> userFllowMap = new HashMap<>();
    List<int[]> tweetList = new ArrayList<>();
    public Twitter() {}
    
    public void postTweet(int userId, int tweetId) {
        tweetList.add(new int[]{tweetId, userId});
    }
    
    public List<Integer> getNewsFeed(int userId) {
        var followeeSet = userFllowMap.getOrDefault(userId, new HashSet<>());
        List<Integer> ans = new ArrayList<>();
        for(int i = tweetList.size() - 1; i >= 0; i--) {
            if (ans.size() >= 10) break;
            var item = tweetList.get(i);
            if (item[1] == userId || followeeSet.contains(item[1])) ans.add(item[0]);
        }
        return ans;

    }
    
    public void follow(int followerId, int followeeId) {
        userFllowMap.computeIfAbsent(followerId, key -> new HashSet<>());
        userFllowMap.get(followerId).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        userFllowMap.computeIfAbsent(followerId, key -> new HashSet<>());
        userFllowMap.get(followerId).remove(followeeId);
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */
// @lc code=end

