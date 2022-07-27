
<https://leetcode-cn.com/problems/balanced-binary-tree/>

```java
class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;
        
        if (Math.abs(treeHeight(root.left, 0) - treeHeight(root.right, 0)) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int treeHeight(TreeNode root, int i){
        if (root == null) return i;
        i++;
        int l = treeHeight(root.left, i);
        int r = treeHeight(root.right, i);
        return l > r ? l : r;
    }
}
```

耗时：1

