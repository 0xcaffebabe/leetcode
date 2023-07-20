/*
 * @lc app=leetcode.cn id=377 lang=java
 * @lcpr version=21910
 *
 * [377] 组合总和 Ⅳ
 * 
 * 15/15 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 60.39 % of java submissions (38.7 MB)
 */

// @lc code=start
class Solution {
    int target;
    int[] nums;
    Integer[] memo;
    public int combinationSum4(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
        memo = new Integer[target + 1];
        return bt(target);
    }
    int bt(int sum) {
        if (sum < 0) return 0;
        if (sum == 0) {
            return 1;
        }
        if (memo[sum] != null) return memo[sum];
        int res = 0;
        for(var i : nums) res += bt(sum - i);
        memo[sum] = res;
        return memo[sum];
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3]\n4\n
// [4,2,1]\n32\n
// @lcpr case=end

// @lcpr case=start
// [9]\n3\n
// [10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200,210,220,230,240,250,260,270,280,290,300,310,320,330,340,350,360,370,380,390,400,410,420,430,440,450,460,470,480,490,500,510,520,530,540,550,560,570,580,590,600,610,620,630,640,650,660,670,680,690,700,710,720,730,740,750,760,770,780,790,800,810,820,830,840,850,860,870,880,890,900,910,920,930,940,950,960,970,980,990,111]\n
// 999
// @lcpr case=end

 */

