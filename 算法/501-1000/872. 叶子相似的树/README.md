
<https://leetcode-cn.com/problems/leaf-similar-trees/>

```java
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        getLeafNodes(root1, list1);
        getLeafNodes(root2, list2);
        return list1.equals(list2);
    }
    private void getLeafNodes(TreeNode root, List<Integer> list){
        if (root == null) return ;
        if (root.left == null && root.right == null) list.add(root.val);
        getLeafNodes(root.left, list);
        getLeafNodes(root.right, list);
    }
}
```

耗时：0

