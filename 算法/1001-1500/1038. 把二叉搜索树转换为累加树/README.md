
<https://leetcode-cn.com/problems/binary-search-tree-to-greater-sum-tree/>

```java
class Solution {
    private int sum;
    private List<TreeNode> nodeList;
    public TreeNode bstToGst(TreeNode root) {
        nodeList = new ArrayList<>(100);
        travel(root);
        for(int i = 0;i<nodeList.size();i++){
            TreeNode item = nodeList.get(i);
            int orign = item.val;
            item.val = sum;
            sum -= orign;
        }
        return root;
    }

    private void travel(TreeNode root) {
        if (root == null) return;
        travel(root.left);
        nodeList.add(root);
        sum += root.val;
        travel(root.right);
    }
}
```

time:0 beat:100

