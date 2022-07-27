
<https://leetcode-cn.com/problems/deepest-leaves-sum/>

```java
class Solution {
    private int maxDepth = 0;
    private int sum;
    public int deepestLeavesSum(TreeNode root) {
        travel(root, 0);
        calc(root, 0);
        return sum;
    }

    private void calc(TreeNode root, int depth){
        if (root == null) return;
        int curDepth = depth + 1;
        calc(root.left, curDepth);
        calc(root.right, curDepth);
        if (depth == maxDepth - 1) sum += root.val;
    }

    private void travel(TreeNode root, int depth){
        if (depth > maxDepth) maxDepth = depth;
        if (root == null) return;
        int curDepth = depth + 1;
        travel(root.left, curDepth);
        travel(root.right, curDepth);
    }
}
```

time:1 beat:100

