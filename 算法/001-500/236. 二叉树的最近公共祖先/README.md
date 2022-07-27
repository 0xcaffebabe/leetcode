
<https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/>

```java
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root.val == p.val && exist(root, q)) return root;
        if (root.val == q.val && exist(root, p)) return root;
        if (exist(root.left, p) && exist(root.right, q)) return root;
        if (exist(root.left, q) && exist(root.right, p)) return root;

        TreeNode l = lowestCommonAncestor(root.left, p, q);
        TreeNode r = lowestCommonAncestor(root.right, p, q);
        if (l != null) return l;
        return r;
    }

    private boolean exist(TreeNode root, TreeNode target) {
        if (root == null) return false;
        if (root.val == target.val) return true;
        return exist(root.left, target) || exist(root.right, target);
    }
}
```

time:700+ beat:5

