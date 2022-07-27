
<https://leetcode-cn.com/problems/find-elements-in-a-contaminated-binary-tree/>

- 解法1 

```java
class FindElements {

    private TreeNode root;

    public FindElements(TreeNode root) {
        this.root = root;
        if (root != null) root.val = 0;
        recover(root);
    }
    
    public boolean find(int target) {
        return find(root, target);
    }

    private boolean find(TreeNode root, int target){
        if (root == null) return false;
        if (root.val == target) return true;
        return find(root.left, target) || find(root.right, target);
    }

    private void recover(TreeNode root){
        if (root == null) return;

        if (root.left != null) root.left.val = 2*root.val+1;
        if (root.right != null) root.right.val = 2*root.val+2;

        recover(root.left);
        recover(root.right);
    }
}
```

time: 1000+ beat:20

- 解法2 优化：增加缓存

```java
class FindElements {

    private TreeNode root;
    private Map<Integer, Boolean> map = new HashMap<>();

    public FindElements(TreeNode root) {
        this.root = root;
        if (root != null) root.val = 0;
        recover(root);
    }
    
    public boolean find(int target) {
        return map.containsKey(target);
    }

    private void recover(TreeNode root){
        if (root == null) return;

        if (root.left != null) {
            root.left.val = 2*root.val+1;
            map.put(root.left.val, true);
        }
        if (root.right != null) { 
            root.right.val = 2*root.val+2;
            map.put(root.right.val, true);
        }

        recover(root.left);
        recover(root.right);
```

time:28 beat:84

