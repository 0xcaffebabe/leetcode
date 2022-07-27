
<https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/>

```java
class Solution {
    public int[] levelOrder(TreeNode root) {
        if (root == null) return new int[]{};

        LinkedList<TreeNode> nodes = new LinkedList<>();
        List<Integer> vals = new ArrayList<>(16);
        nodes.push(root);

        while(!nodes.isEmpty()) {
            var node = nodes.poll();
            vals.add(node.val);
            if (node.left != null) nodes.offer(node.left);
            if (node.right != null) nodes.offer(node.right);
        }

        int[] result = new int[vals.size()];
        for(int i = 0;i<result.length;i++) result[i] = vals.get(i);

        return result;
    }
}
```

time:1 beat:98

