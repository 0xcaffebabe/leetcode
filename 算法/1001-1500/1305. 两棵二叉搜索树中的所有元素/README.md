
<https://leetcode.cn/problems/all-elements-in-two-binary-search-trees/>

```java
class Solution {
    private List<Integer> list1 = new ArrayList<>(32);
    private List<Integer> list2 = new ArrayList<>(32);

    private List<Integer> ans = new ArrayList<>(32);

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        travel(root1, list1);
        travel(root2, list2);
        int p = 0, q = 0;
        int l1 = list1.size(), l2 = list2.size();

        while(p < l1 && q < l2) {
            if (list1.get(p) < list2.get(q)) ans.add(list1.get(p++));
            else ans.add(list2.get(q++));
        }
        while(p < l1) ans.add(list1.get(p++));
        while(q < l2) ans.add(list2.get(q++));
        return ans;
    }

    private void travel(TreeNode root, List<Integer> list) {
        if (root == null) return;
        travel(root.left, list);
        list.add(root.val);
        travel(root.right, list);
    }
}
```

time:16 beat:71

