/*
 * @lc app=leetcode.cn id=427 lang=java
 * @lcpr version=21909
 *
 * [427] 建立四叉树
 * 
 * 22/22 cases passed (1 ms)
 * Your runtime beats 37.78 % of java submissions
 * Your memory usage beats 5.55 % of java submissions (42.8 MB)
 */

// @lc code=start

// Definition for a QuadTree node.
// class Node {
//     public boolean val;
//     public boolean isLeaf;
//     public Node topLeft;
//     public Node topRight;
//     public Node bottomLeft;
//     public Node bottomRight;

    
//     public Node() {
//         this.val = false;
//         this.isLeaf = false;
//         this.topLeft = null;
//         this.topRight = null;
//         this.bottomLeft = null;
//         this.bottomRight = null;
//     }
    
//     public Node(boolean val, boolean isLeaf) {
//         this.val = val;
//         this.isLeaf = isLeaf;
//         this.topLeft = null;
//         this.topRight = null;
//         this.bottomLeft = null;
//         this.bottomRight = null;
//     }
    
//     public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
//         this.val = val;
//         this.isLeaf = isLeaf;
//         this.topLeft = topLeft;
//         this.topRight = topRight;
//         this.bottomLeft = bottomLeft;
//         this.bottomRight = bottomRight;
//     }
// };


class Solution {
    int[][] grid;
    public Node construct(int[][] grid) {
        this.grid = grid;
        return construct(0,0, grid.length - 1, grid.length - 1, grid.length);
    }

    // a,b代表左顶角 c,d 代表右下角
    Node construct(int a, int b, int c, int d, int offset) {
        // System.out.println(offset);
        if (offset == 1) return new Node(grid[a][b] == 1, true);
        offset /= 2;
        var topLeft = construct(a, b, c - offset, d - offset, offset);
        var topRight = construct(a, b + offset, c, d - offset , offset);
        var bottomLeft = construct(a + offset, b,  c - offset, d - offset, offset);
        var bottomRight = construct(a + offset, b + offset, c, d, offset);
        
        // 合并相同的
        if (topLeft.isLeaf && topRight.isLeaf && bottomLeft.isLeaf && bottomRight.isLeaf) {
            if (topLeft.val && topRight.val && bottomLeft.val && bottomRight.val) 
                return new Node(topLeft.val, true);
            
            if (!topLeft.val && !topRight.val && !bottomLeft.val && !bottomRight.val) 
                return new Node(topLeft.val, true);
        }
        
        return new Node(true, 
                        false, 
                        topLeft, topRight, bottomLeft, bottomRight);
    }

}
// @lc code=end

/*

// @lcpr case=start
// [[1,1],[1,1]]\n
// [[1,1,0,0],[0,0,1,1],[1,1,0,0],[0,0,1,1]]\n
// [[1,1,1,1,1,1,1,1],[1,1,1,1,1,1,1,1],[1,1,1,1,1,1,0,0],[1,1,1,1,1,1,0,0],[1,1,1,1,1,1,1,1],[1,1,1,1,1,1,1,1],[0,0,0,0,1,1,1,1],[0,0,0,0,1,1,1,1]]
// @lcpr case=end

// @lcpr case=start
// [[0,1],[1,0]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,1,1,1,0,0,0,0],[1,1,1,1,0,0,0,0],[1,1,1,1,1,1,1,1],[1,1,1,1,1,1,1,1],[1,1,1,1,0,0,0,0],[1,1,1,1,0,0,0,0],[1,1,1,1,0,0,0,0],[1,1,1,1,0,0,0,0]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,1],[1,1]]\n
// @lcpr case=end

// @lcpr case=start
// [[0]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,1,0,0],[1,1,0,0],[0,0,1,1],[0,0,1,1]]\n
// @lcpr case=end

 */

