
<https://leetcode-cn.com/problems/two-sum-iv-input-is-a-bst/>

```java
class Solution {
    private HashSet<Integer> set = new HashSet<>();
    private int k;
    public boolean findTarget(TreeNode root, int k) {
        this.k = k;
        preorder(root);
        if (set.size() == 1) return false;
        return check(root);
    }

    private void preorder(TreeNode root) {
        if (root == null) return;
        set.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    private boolean check(TreeNode root) {
        if (root == null) return false;
        int a = root.val;
        int b = k - root.val;
        if (set.contains(b) && a != b) return true;
        if (check(root.left) || check(root.right)) return true;
        return false;
    }
}
```

time:3 beat:48

