
<https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal/>

- 初始解法

```java
class Solution {
    Map<Integer, List<Integer>> map = new LinkedHashMap<>(16);
    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) return new ArrayList<>();
        
        travel(Arrays.asList(root), 0);
        List<List<Integer>> ans = new ArrayList<>();
        for(Map.Entry<Integer, List<Integer>> entry: map.entrySet()) ans.add(entry.getValue());
        
        return ans;
    }

    private void travel(List<Node> nodeList, int level) {
        if (nodeList.size() == 0) return;

        List<Node> childrenList = new ArrayList<>();
        for(Node node : nodeList) {
            map.putIfAbsent(level, new ArrayList<>());
            map.get(level).add(node.val);
            childrenList.addAll(node.children);
        }
        travel(childrenList, level + 1);
    }
}
```

time:2/3 beat:5/75

- 优化：流式遍历

```java
class Solution {
    Map<Integer, List<Integer>> map = new LinkedHashMap<>(16);
    List<List<Integer>> ans = new ArrayList<>();
    int level;

    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) return new ArrayList<>();

        travel(Arrays.asList(root));
        
        return ans;
    }

    private void travel(List<Node> nodeList) {
        if (nodeList.size() == 0) return;

        List<Node> childrenList = new ArrayList<>();
        ans.add(new ArrayList<>());
        for(Node node : nodeList) {
            
            ans.get(level).add(node.val);
            childrenList.addAll(node.children);
        }
        level++;
        travel(childrenList);
    }
}
```

time:2 beat:92

