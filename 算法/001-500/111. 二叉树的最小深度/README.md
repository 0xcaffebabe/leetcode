
<https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/submissions/>

```java
class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        int l = minDepth(root.left)+1;
        int r = minDepth(root.right)+1;
        if (root.left == null || root.right == null){
            return Math.max(l,r);
        }else{
            return Math.min(l,r);
        }
    }
}
```

耗时：0

