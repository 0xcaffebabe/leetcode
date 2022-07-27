
给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）

<https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/>

- 解法

对树做前序遍历，将结果写到list里，再对list进行reverse

```java
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        walk(root,list,0);
        Collections.reverse(list);
        return list;
    }
    public void walk(TreeNode root,ArrayList<List<Integer>> list,int p) {
        if (root == null) {
            return;
        }
        if (list.size()<=p) {
            list.add(p,new ArrayList<>());
        }
        list.get(p).add(root.val);
        walk(root.left,list,p+1);
        walk(root.right,list,p+1);
    }
}
```

耗时：1ms

