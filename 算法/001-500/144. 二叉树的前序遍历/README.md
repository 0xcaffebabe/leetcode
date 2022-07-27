
<https://leetcode-cn.com/problems/binary-tree-preorder-traversal/>

```java
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preTravel(root,list);
        return list;
    }

    private void preTravel(TreeNode root, List<Integer> list){
        if (root == null) return;
        list.add(root.val);
        preTravel(root.left, list);
        preTravel(root.right, list);
    }
}
```

耗时：0

