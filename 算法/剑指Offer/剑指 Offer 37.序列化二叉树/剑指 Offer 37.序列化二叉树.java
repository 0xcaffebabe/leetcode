/*
 * @lc app=leetcode.cn id=剑指 Offer 37 lang=java
 * @lcpr version=21907
 *
 * [剑指 Offer 37] 序列化二叉树
 * 
 * 48/48 cases passed (18 ms)
 * Your runtime beats 60.19 % of java submissions
 * Your memory usage beats 5.1 % of java submissions (44.7 MB)
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    String[] arr;
    int pos;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return dfsS(root);
    }

    String dfsS(TreeNode root) {
        if (root == null) return "#";
        return String.format("%s,%s,%s", root.val, dfsS(root.left), dfsS(root.right));
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        arr = data.split(",");
        pos = -1;
        return dfsD();
    }

    TreeNode dfsD() {
        pos++;
        if (pos >= arr.length) return null;
        if (arr[pos].equals("#")) return null;
        return new TreeNode(Integer.valueOf(arr[pos]), dfsD(), dfsD());
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,null,null,4,5]\n
// @lcpr case=end

 */

