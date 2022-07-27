
<https://leetcode-cn.com/problems/check-subtree-lcci/>

```java
class Solution {
    public boolean checkSubTree(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null && t2 != null) return false;
        if (t2 == null && t1 != null) return false;

        if (t1.val == t2.val) return checkSubTree(t1.left, t2.left) && checkSubTree(t1.right, t2.right);
        return checkSubTree(t1.left, t2) || checkSubTree(t1.right, t2);
    }
}
```

time:0 beat:100

