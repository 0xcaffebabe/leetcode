
<https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/>

```java
class Solution {
    public int kthLargest(TreeNode root, int k) {
       LinkedList<Integer> s = new LinkedList<>();
       travel(root, s);
       int cnt = 1;
       while(!s.isEmpty()){
           int i = s.pop();
           if (cnt == k) return i;
           cnt++;
       }
       return -1;
    }

    public void travel(TreeNode root, LinkedList<Integer> s){
        if (root == null) return;
        travel(root.left, s);
        s.push(root.val);
        travel(root.right, s);
    }
}
```

time:1 beat:40

