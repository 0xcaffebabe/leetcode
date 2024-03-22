/*
 * @lc app=leetcode.cn id=2471 lang=java
 * @lcpr version=
 *
 * [2471] 逐层排序二叉树所需的最少操作数目
 * 
 * 146/146 cases passed (53 ms)
 * Your runtime beats 71.43 % of java submissions
 * Your memory usage beats 48.21 % of java submissions (62.2 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution {
    public int minimumOperations(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int ans = 0;
        while(!queue.isEmpty()) {
            int n = queue.size();
            int[] nums = new int[n];
            for(int i = 0; i < n; i++) {
                var node = queue.poll();
                nums[i] = node.val;
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            ans += getSwapCost(nums);
        }
        return ans;
    }

    int getSwapCost(int[] nums) {
        int[] clone = nums.clone();
        Arrays.sort(clone);
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < clone.length; i++) 
            indexMap.put(clone[i], i);
        
        int ans = 0;
        for(int i = 0; i < nums.length; i++) {
            while(true) {
                int idx = indexMap.get(nums[i]);
                if (idx != i) {
                    int t = nums[i];
                    nums[i] = nums[idx];
                    nums[idx] = t;
                    ans++;
                } else {
                    break;
                }
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,4,3,7,6,8,5,null,null,null,null,9,null,10]\n
// @lcpr case=end

// @lcpr case=start
// [1,3,2,7,6,5,4]\n
// [1]\n
// [1,3,2]\n
// [1,3]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4,5,6]\n
// @lcpr case=end

 */

