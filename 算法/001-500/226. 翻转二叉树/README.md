
<https://leetcode-cn.com/problems/invert-binary-tree/>

```java
class Solution {
    public TreeNode invertTree(TreeNode root) {
        invertTree0(root);
        return root;
    }
    private void invertTree0(TreeNode root){
        if (root == null) return;
        
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;

        if (root.left !=null) invertTree0(root.left);
        if (root.right !=null) invertTree0(root.right);
    }
}
```

耗时：0

