/*
 * @lc app=leetcode.cn id=2642 lang=java
 * @lcpr version=
 *
 * [2642] 设计可以求最短路径的图类
 * 
 * 36/36 cases passed (105 ms)
 * Your runtime beats 35.42 % of java submissions
 * Your memory usage beats 5.21 % of java submissions (54.2 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;
import java.util.PriorityQueue;

class Graph {
    int[][] g;
    int n;
    public Graph(int n, int[][] edges) {
        g = new int[n][n];
        this.n = n;
        for(var e: edges) g[e[0]][e[1]] = e[2];
    }
    
    public void addEdge(int[] e) {
        g[e[0]][e[1]] = e[2];
    }
    
    public int shortestPath(int node1, int node2) {
        int[] s = new int[n]; // 从 node1 开始到每个节点的最小代价
        Arrays.fill(s, Integer.MAX_VALUE);
        // 节点及代价
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        queue.offer(new int[]{node1, 0});
        while(!queue.isEmpty()) {
            var v = queue.poll();
            int cur = v[0], cost = v[1];
            var neighbor = g[cur];
            if (cur == node2) return cost;
            for(int i = 0; i < neighbor.length; i++) {
                if (neighbor[i] != 0) {
                    int next = i, ncost = neighbor[i];
                    // 发现有更小的代价
                    if (s[next] > cost + ncost) {
                        s[next] = cost + ncost;
                        // 从具有更小代价的路径出发
                        queue.offer(new int[]{next, ncost + cost});
                    }
                }
            }
        }
        return -1;
    }
}

/**
 * Your Graph object will be instantiated and called as such:
 * Graph obj = new Graph(n, edges);
 * obj.addEdge(edge);
 * int param_2 = obj.shortestPath(node1,node2);
 */
// @lc code=end



/*
// @lcpr case=start
// ["Graph", "shortestPath", "shortestPath", "addEdge", "shortestPath"]\n
// [[4, [[0, 2, 5], [0, 1, 2], [1, 2, 1], [3, 0, 3]]], [3, 2], [0, 3], [[1, 3, 4]], [0, 3]]\n
// ["Graph", "shortestPath"]\n[[1,[]],[0,0]]\n
// ["Graph", "shortestPath"]\n[[3,[]],[1,0]]\n
// ["Graph", "shortestPath"]\n[[3,[[1,2,3]]],[1,2]]\n
// ["Graph","addEdge","addEdge","addEdge","addEdge","addEdge","shortestPath","shortestPath","shortestPath","addEdge","addEdge","addEdge","shortestPath","addEdge","addEdge","shortestPath","shortestPath","shortestPath","addEdge","addEdge","shortestPath","shortestPath","shortestPath","shortestPath","addEdge","addEdge","shortestPath","shortestPath","shortestPath","shortestPath","shortestPath","addEdge","shortestPath","addEdge","shortestPath","shortestPath","shortestPath","addEdge","shortestPath","shortestPath","shortestPath","shortestPath","shortestPath","addEdge","shortestPath","shortestPath","shortestPath"]\n
// [[13,[[11,6,84715],[7,9,764823],[6,0,315591],[1,4,909432],[6,5,514907],[9,6,105610],[3,10,471042],[7,10,348752],[5,11,715628],[6,1,973999],[8,7,593929],[7,6,64688],[6,4,741734],[10,1,894247],[9,7,81181],[2,11,75418],[12,2,85431],[7,2,260306],[11,9,640614],[2,3,648804],[4,12,568023],[0,8,730096],[9,11,633474],[3,6,390214],[1,10,117955],[9,8,222602],[10,7,689294]]],[[1,2,36450]],[[8,0,709628]],[[2,4,30185]],[[12,1,21696]],[[1,8,2553]],[8,9],[1,11],[3,4],[[4,6,2182]],[[7,5,206]],[[5,7,140]],[12,5],[[12,6,365184]],[[3,2,5]],[4,8],[7,10],[0,5],[[0,11,5]],[[1,7,5]],[0,8],[11,11],[7,4],[0,12],[[3,9,858944]],[[0,9,4]],[3,5],[4,5],[12,9],[9,8],[3,5],[[12,9,629052]],[3,8],[[4,0,545201]],[11,8],[4,11],[9,6],[[12,7,4]],[7,10],[2,5],[6,11],[12,2],[9,7],[[4,3,879736]],[1,3],[1,0],[4,6]]
// @lcpr case=end

 */

