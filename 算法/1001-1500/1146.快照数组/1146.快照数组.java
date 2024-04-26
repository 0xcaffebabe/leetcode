/*
 * @lc app=leetcode.cn id=1146 lang=java
 * @lcpr version=
 *
 * [1146] 快照数组
 * 
 * 75/75 cases passed (901 ms)
 * Your runtime beats 6.33 % of java submissions
 * Your memory usage beats 21.72 % of java submissions (79.9 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.HashMap;
import java.util.Map;

class SnapshotArray {
    private int snapId = 0;
    private Map<Integer, Integer> data = new HashMap<>(32);

    public SnapshotArray(int length) {
        for(int i = 0; i < length; i++) 
            data.put(id(i,0), 0);
        
    }
    
    public void set(int index, int val) {
        data.put(id(index, snapId), val);
    }
    
    public int snap() {
        return snapId++;
    }
    
    public int get(int index, int snap_id) {
        for(int i = snap_id; i >= 0; i--) {
            var v = data.get(id(index, i));
            if (v != null) return v;
        }
        return -1;
    }

    private int id(int a, int b) {
        return (a << 16) | b;
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */
// @lc code=end



/*
// @lcpr case=start
// ["SnapshotArray","set","snap","set","get"]\n[[3],[0,5],[],[0,6],[0,0]]\n
// ["SnapshotArray","set","snap","set","get","snap","get"]\n[[3],[0,5],[],[0,6],[0,0],[],[1,0]]\n
// ["SnapshotArray","snap","snap","get","set","snap","set"]\n[[4],[],[],[3,1],[2,4],[],[1,4]]\n
// ["SnapshotArray","set","snap","set","snap","set","snap","set","get","get","snap"]\n[[4],[1,5],[],[0,16],[],[2,15],[],[2,5],[1,0],[0,2],[]]\n
// @lcpr case=end

 */

