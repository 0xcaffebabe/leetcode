/*
 * @lc app=leetcode.cn id=449 lang=java
 *
 * [449] 序列化和反序列化二叉搜索树
 * 
 * 62/62 cases passed (13 ms)
 * Your runtime beats 30.93 % of java submissions
 * Your memory usage beats 5.05 % of java submissions (43.5 MB)
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
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;
// @lc code=end

