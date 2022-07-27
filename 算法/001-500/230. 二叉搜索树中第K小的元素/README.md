
<https://leetcode-cn.com/problems/kth-smallest-element-in-a-bst/>

```java
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        return getKMin(root,k,new int[]{0});
    }

    public int getKMin(TreeNode root,int k,int[] i){
        if (root == null) return -1;
        int l = getKMin(root.left, k,i);
        i[0]++;
        if (i[0] == k) {
            return root.val;
        }
        
        int r = getKMin(root.right, k,i);
        if (l != -1) {
            return l;
        }
        if (r != -1) {
            return r;
        }
        
        return -1;
    }
}
```

耗时：0

