
<https://leetcode-cn.com/problems/path-sum/submissions/>

```java
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null){
            return false;
        }
        if (root.left == null && root.right == null){
            return root.val == sum;
        }else if(root.left == null){
            return hasPathSum(root.right,sum-root.val);
        }else if(root.right == null){
            return hasPathSum(root.left,sum-root.val);
        }else {
            return hasPathSum(root.right,sum-root.val) || 
                    hasPathSum(root.left,sum-root.val);
        }
    }
}
```

耗时:0

