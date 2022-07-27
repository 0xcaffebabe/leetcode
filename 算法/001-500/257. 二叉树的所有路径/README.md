
<https://leetcode-cn.com/problems/binary-tree-paths/>

```java
class Solution {
    private List<String> ans = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if (root.left == null && root.right == null) return Arrays.asList(root.val + "");
        order(root.left, root.val + "");
        order(root.right, root.val + "");
        return ans;
    }

    private void order(TreeNode root, String str) {
        if (root == null) return;

        str += "->" + root.val;
        if (root.left == null && root.right == null) ans.add(str);

        order(root.left, str);
        order(root.right, str);
    }
}
```

time:8 beat:33

