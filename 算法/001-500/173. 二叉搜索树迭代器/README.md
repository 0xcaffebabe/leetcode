
<https://leetcode-cn.com/problems/binary-search-tree-iterator/>

```java
class BSTIterator {
    private LinkedList<Integer> list = new LinkedList<>();
    public BSTIterator(TreeNode root) {
        midVisist(root);
    }

    private void midVisist(TreeNode root){
        if (root == null) return;
        midVisist(root.left);
        list.add(root.val);
        midVisist(root.right);
    }
    
    /** @return the next smallest number */
    public int next() {
        return list.removeFirst();
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !list.isEmpty();
    }
}
```

耗时：24

