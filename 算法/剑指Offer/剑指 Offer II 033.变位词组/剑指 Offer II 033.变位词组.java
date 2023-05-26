/*
 * @lc app=leetcode.cn id=剑指 Offer II 033 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 033] 变位词组
 * 
 * 114/114 cases passed (12 ms)
 * Your runtime beats 22.81 % of java submissions
 * Your memory usage beats 5.06 % of java submissions (46.6 MB)
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,Integer> map = new HashMap<>(128);
        int i = 0;
        List<List<String>> list = new ArrayList<>();
        for(String s : strs) {
            var arr = s.toCharArray();
            Arrays.sort(arr);
            String key = Arrays.toString(arr);
            if (!map.containsKey(key)){
                map.put(key, i);
                i++;
                list.add(new ArrayList<>());
                list.get(list.size() -1).add(s);
            }else{
                int index = map.get(key);
                list.get(index).add(s);
            }
        }
        return list;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["eat", "tea", "tan", "ate", "nat", "bat"]\n
// @lcpr case=end

// @lcpr case=start
// [""]\n
// @lcpr case=end

// @lcpr case=start
// ["a"]\n
// @lcpr case=end

 */

