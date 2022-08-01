/*
 * @lc app=leetcode.cn id=129 lang=typescript
 *
 * [129] 求根节点到叶节点数字之和
 * 
 * 108/108 cases passed (60 ms)
 * Your runtime beats 89.22 % of typescript submissions
 * Your memory usage beats 16.17 % of typescript submissions (44 MB)
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     val: number
 *     left: TreeNode | null
 *     right: TreeNode | null
 *     constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.left = (left===undefined ? null : left)
 *         this.right = (right===undefined ? null : right)
 *     }
 * }
 */


function sumNumbers(root: TreeNode | null): number {
  let ans = 0
  function travel(root: TreeNode | null, prev: number) {
    if (!root) return
    let s = prev * 10 + root.val
    if (!root.left && !root.right) {
      ans += s
    } else {
      travel(root.left, s);
      travel(root.right, s);
    }
  }
  travel(root, 0)
  return ans
};
// @lc code=end

