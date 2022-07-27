
<https://leetcode-cn.com/problems/binary-tree-inorder-traversal/>

```java
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        walk(root, list);
        return list;
    }
    private void walk(TreeNode root, List<Integer> list){
        if (root == null) return;
        walk(root.left, list);
        list.add(root.val);
        walk(root.right, list);
    }
}
```

耗时：0

