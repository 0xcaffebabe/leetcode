
<https://leetcode-cn.com/problems/validate-binary-search-tree/>

```java
class Solution {
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>(16);
        midTravel(root, list);
        if (list.size() < 2) return true;
        for(int i = 1; i < list.size();i++) {
            if (list.get(i) <= list.get(i - 1)) return false;
        }
        return true;
    }

    private void midTravel(TreeNode root, List<Integer> list) {
        if (root == null) return;
        if (root.left != null) midTravel(root.left, list);
        list.add(root.val);
        if (root.right != null) midTravel(root.right, list);
    }
}
```

time:2 beat: 18

