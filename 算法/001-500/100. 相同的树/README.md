
给定两个二叉树，编写一个函数来检验它们是否相同

<https://leetcode-cn.com/problems/same-tree/>

- 解法

对两棵树做前序遍历，结果存到两个list，比较两个lsit即可
需要注意的是，需要特别处理左树为空，但右树不为空的情况

```java
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        preWalk(p,list1);
        preWalk(q,list2);
        return list1.equals(list2);
    }
    public void preWalk(TreeNode p, List<Integer> list){
        if (p == null){
            return ;
        }
        list.add(p.val);
        if (p.left == null && p.right != null) {
            list.add(null);
        }
        preWalk(p.left,list);
        preWalk(p.right,list);
    }
}
```

耗时:0ms

