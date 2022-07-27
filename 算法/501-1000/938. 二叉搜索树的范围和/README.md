
<https://leetcode-cn.com/problems/range-sum-of-bst/>

```java
class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        int[] sum = new int[]{0};
        midTravel(root,sum,L,R);
        return sum[0];
    }
    private void midTravel(TreeNode root,int[] sum,int l,int r){
        if (root == null) return;
        midTravel(root.left, sum,l,r);
        if (root.val >=l && root.val <=r ) sum[0] += root.val;
        midTravel(root.right, sum,l,r);
    }
}
```

耗时：1

