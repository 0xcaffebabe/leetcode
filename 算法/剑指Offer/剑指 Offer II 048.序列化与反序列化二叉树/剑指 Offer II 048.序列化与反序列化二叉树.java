/*
 * @lc app=leetcode.cn id=剑指 Offer II 048 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 048] 序列化与反序列化二叉树
 * 
 * 52/52 cases passed (22 ms)
 * Your runtime beats 35.25 % of java submissions
 * Your memory usage beats 5.94 % of java submissions (44.8 MB)
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
// TreeNode ans = deser.deserialize(ser.serialize(root));
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,null,null,4,5]\n
// @lcpr case=end

// @lcpr case=start
// []\n
// @lcpr case=end

// @lcpr case=start
// [1]\n
// @lcpr case=end

// @lcpr case=start
// [1,2]\n
// @lcpr case=end

 */

