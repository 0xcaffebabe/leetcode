
给定一个二叉树，找出其最大深度。

<https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/>

- 解法

同上题，传入根节点，如果根节点为空，返回0
否则i++
接下来递归获取左右子树的深度，获取最大深度，累加到i即可

```java
class Solution {
    public int maxDepth(TreeNode root) {
        return getDepth(root,0);
    }
    public int getDepth(TreeNode root,int i) {
        if (root == null) {
            return 0;
        }
        i++;
        int left = getDepth(root.left,0);
        int right = getDepth(root.right,0);
        if (left > right) {
            return i + left;
        }else {
            return i + right;
        }
    }
}
```

耗时：0ms

