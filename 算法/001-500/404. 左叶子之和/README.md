
<https://leetcode-cn.com/problems/sum-of-left-leaves/submissions/>

```java
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return sum(root,false);
    }
    public int sum(TreeNode root,boolean isLeft){
        if (root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            if (isLeft){
                return root.val;
            }else {
                return 0;
            }
        }
        return sum(root.left,true)+sum(root.right,false);
    }
}
```

耗时:0

