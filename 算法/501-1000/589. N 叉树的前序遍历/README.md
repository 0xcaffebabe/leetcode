
<https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/>

- 递归解法

```java
class Solution {
    private List<Integer> ans = new ArrayList<>(16);

    public List<Integer> preorder(Node root) {
        if (root == null) return ans;
        ans.add(root.val);
        if (root.children != null) for(Node i : root.children) preorder(i);
        return ans;
    }
}
```

time:0 beat:100

- 迭代解法

```java
class Solution {
    private List<Integer> ans = new ArrayList<>(16);

    public List<Integer> preorder(Node root) {
        if (root == null) return ans;
        LinkedList<Node> s = new LinkedList<>();
        s.push(root);
        while(!s.isEmpty()) {
            Node node = s.pop();
            ans.add(node.val);
            if (node.children != null) {
                for(int i = node.children.size() - 1;i >= 0; i--) s.push(node.children.get(i));
            }
        }
        return ans;
    }
}
```

time:2 beat:39

