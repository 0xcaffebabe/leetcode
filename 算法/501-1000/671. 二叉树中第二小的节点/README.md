
<https://leetcode-cn.com/problems/second-minimum-node-in-a-binary-tree/>

```java
class Solution {
    private int min = Integer.MAX_VALUE;
    private int secMin = Integer.MAX_VALUE;
    private boolean existsSecMin = false;
    public int findSecondMinimumValue(TreeNode root) {
        findMin(root);
        findSecMin(root);
        if (!existsSecMin) return -1;
        return secMin;
    }

    private void findMin(TreeNode root) {
        if (root == null) return;
        if (root.val <= min) min = root.val;
        findMin(root.left);
        findMin(root.right);
    }

    private void findSecMin(TreeNode root) {
        if (root == null) return;
        if (root.val <= secMin && root.val > min) {
            secMin = root.val;
            existsSecMin = true;
        }
        findSecMin(root.left);
        findSecMin(root.right);
    }
}
```

time:0 beat:100

