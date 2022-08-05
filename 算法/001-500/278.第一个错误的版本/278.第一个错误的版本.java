/*
 * @lc app=leetcode.cn id=278 lang=java
 *
 * [278] 第一个错误的版本
 * 
 * 24/24 cases passed (16 ms)
 * Your runtime beats 20.29 % of java submissions
 * Your memory usage beats 77.08 % of java submissions (38.1 MB)
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return find(1, n);
    }

    int find(int start, int end) {
        int mid = start + (end - start) / 2;
        // System.out.println(mid);
        if (isBadVersion(mid)) {
            if (!isBadVersion(mid - 1)) return mid;
            return find(start, mid - 1);
        }else {
            return find(mid + 1, end);
        }
        
    }
}
// @lc code=end

