
<https://leetcode-cn.com/problems/subtree-of-another-tree/submissions/>

```java
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        List<String> list1 = new ArrayList<>(32);
        List<String> list2 = new ArrayList<>(32);
        travel(root, list1);
        travel(subRoot, list2);
        String a = "," + list1.stream().collect(Collectors.joining(",")) + ",";
        String b = "," + list2.stream().collect(Collectors.joining(",")) + ",";
        return a.contains(b);
    }

    private void travel(TreeNode root, List<String> list) {
        if (root == null) {
            list.add("null");
            return;
        }
        travel(root.left, list);
        travel(root.right, list);
        list.add(root.val + "");
    }
}
```

time:17 beat:5

