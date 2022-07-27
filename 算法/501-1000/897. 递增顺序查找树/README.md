
<https://leetcode-cn.com/problems/increasing-order-search-tree/>

```java
class Solution {
    public TreeNode increasingBST(TreeNode root) {
        if (root == null) return null;
        List<Integer> list = new ArrayList<>();
        travel(root, list);
        TreeNode ret = new TreeNode();
        TreeNode origin = ret;
        for(int i=0;i<list.size();i++){
            ret.val = list.get(i);
            if (i == list.size() -1) break;
            ret.right = new TreeNode();
            ret = ret.right;
        }
        return origin;
    }
    private void travel(TreeNode root, List<Integer> list){
        if (root == null) return;
        travel(root.left, list);
        list.add(root.val);
        travel(root.right, list);
    }
}
```

耗时：0

