
<https://leetcode-cn.com/problems/count-complete-tree-nodes/>

```java
class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        int l = countNodes(root.left);
        int r = countNodes(root.right);
        return l + r + 1;
    }
}
```

耗时：0

