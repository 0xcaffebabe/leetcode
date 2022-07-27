
<https://leetcode-cn.com/problems/first-common-ancestor-lcci/>

```java
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> list = new ArrayList<>();
        lowestCommonAncestor1(root, p, q, list);
        return list.get(list.size() - 1);
    }

    public void lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q, List<TreeNode> list) {
        if (root == null) return;

        if (hasChild(p, q)) list.add(p);
        if(hasChild(q, p)) list.add(q);
        if (hasChild(root, p) && hasChild(root, q)) list.add(root);;
        
        lowestCommonAncestor1(root.left, p, q, list);
        lowestCommonAncestor1(root.right, p, q, list);
    }

    private boolean hasChild(TreeNode root, TreeNode child) {
        if (root == null) return false;
        if (root == child) return true;
        return hasChild(root.left, child) || hasChild(root.right, child);
    }
}
```

time:2500+ beat:5

