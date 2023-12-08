/*
 * @lc app=leetcode.cn id=919 lang=java
 * @lcpr version=
 *
 * [919] 完全二叉树插入器
 * 
 * 84/84 cases passed (17 ms)
 * Your runtime beats 16.55 % of java submissions
 * Your memory usage beats 17.99 % of java submissions (42.8 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class CBTInserter {
    List<List<TreeNode>> levels = new ArrayList<>();
    int level = 0;
    TreeNode root;
    public CBTInserter(TreeNode root) {
        this.root = cut(root);
        dfs(this.root, 0);
        level = levels.size() - 1;
    }

    void dfs(TreeNode root, int depth) {
        if (root == null) return;
        if (levels.size() <= depth) levels.add(new ArrayList<>());
        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
        levels.get(depth).add(root);
    }
    
    public int insert(int val) {
        var node = new TreeNode(val);
        var first = levels.get(Math.max(0, levels.size() - 2));
        var second = levels.get(levels.size() - 1);
        if (levels.size() - 2 >= 0) {
            for(int i = 0; i < first.size(); i++) {
                if (first.get(i).left == null) {
                    first.get(i).left = node;
                    second.add(node);
                    return first.get(i).val;
                }
                if (first.get(i).right == null) {
                    first.get(i).right = node;
                    second.add(node);
                    return first.get(i).val;
                }
            }
        }

        levels.add(new ArrayList<>());
        for(int i = 0; i < second.size(); i++) {
            if (second.get(i).left == null) {
                second.get(i).left = node;
                levels.get(levels.size() - 1).add(node);
                return second.get(i).val;
            }
            if (second.get(i).right == null) {
                second.get(i).right = node;
                levels.get(levels.size() - 1).add(node);
                return second.get(i).val;
            }
        }
        return -1;
    }
    
    public TreeNode get_root() {
        return root;
    }

    TreeNode cut(TreeNode root){
        if (root == null){
            return root;
        }
        Queue<TreeNode> qt = new LinkedList<>();
        qt.add(root);
        boolean goon = true;
        while(!qt.isEmpty() && goon){
            int size = qt.size();
            for (int i=0; i<size; i++){
                TreeNode temp = qt.poll();
                qt.poll();
                if (temp.left != null){
                    qt.add(temp.left);
                }else{
                    goon = false;
                    temp.right = null;  // 当前节点右孩子剪掉
                    break;
                }
                if (temp.right != null){
                    qt.add(temp.right);
                }else{
                    goon = false;
                    break;
                }
            }
        }
        while(!qt.isEmpty()){
            // 把剩下的上一层节点的孩子剪掉
            qt.peek().left = null;
            qt.peek().right = null;
            qt.poll();
        }
        return root;
    }
}

/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(val);
 * TreeNode param_2 = obj.get_root();
 */
// @lc code=end

/*
// @lcpr case=start
// ["CBTInserter","insert","insert","insert","insert","insert","get_root"]\n[[[1]],[2],[3],[4],[5],[6],[]]\n
// ["CBTInserter","insert","insert","get_root"]\n[[[1,2]],[3],[4],[]]\n
// ["CBTInserter","insert","insert","insert","get_root"]\n[[[1,2,3]],[4],[5],[6],[]]\n
// ["CBTInserter","insert","get_root"]\n[[[1]],[2],[]]\n
//  ["CBTInserter","insert","insert","get_root"]\n[[[1,null,2]],[3],[4],[]]\n
// @lcpr case=end
*/