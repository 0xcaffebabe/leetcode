/*
 * @lc app=leetcode.cn id=101 lang=typescript
 *
 * [101] 对称二叉树
 * 
 * 198/198 cases passed (72 ms)
 * Your runtime beats 58.66 % of typescript submissions
 * Your memory usage beats 5.51 % of typescript submissions (44.8 MB)
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


function isSymmetric(root: TreeNode | null): boolean {
  return check(root, root)
};

function check(left: TreeNode | null, right: TreeNode | null) {
  if (!left && !right) return true
  if (!left || !right) return false

  return left.val == right.val
    && check(left.right, right.left)
    && check(right.right, left.left)
}
// @lc code=end

