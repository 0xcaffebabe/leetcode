/*
 * @lc app=leetcode.cn id=2336 lang=java
 * @lcpr version=
 *
 * [2336] 无限集中的最小数字
 * 
 * 137/137 cases passed (9 ms)
 * Your runtime beats 83.24 % of java submissions
 * Your memory usage beats 18.78 % of java submissions (43.7 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

class SmallestInfiniteSet {

    
    Set<Integer> s = new HashSet<>();
    PriorityQueue<Integer> q = new PriorityQueue<>((a,b) -> a - b);
    int min = 1;

    
    public int popSmallest() {
        if (q.isEmpty()) return min++;
        if (q.peek() < min) {
            s.remove(q.peek());
            return q.poll();
        }
        return min++;
    }
    
    public void addBack(int num) {
        if (s.contains(num) || num >= min) return;
        q.offer(num);
        s.add(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
// @lc code=end

/*
// @lcpr case=start
// ["SmallestInfiniteSet","addBack","popSmallest","popSmallest","popSmallest","addBack","popSmallest","popSmallest","popSmallest"]\n
// [[],[2],[],[],[],[1],[],[],[]]\n
// ["SmallestInfiniteSet","addBack","popSmallest"]\n
// [[],[1],[]]\n
// ["SmallestInfiniteSet","addBack","popSmallest","addBack","addBack","addBack","addBack","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","addBack","addBack","addBack","popSmallest","popSmallest","addBack","addBack","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","addBack","popSmallest","addBack","addBack","addBack","popSmallest","popSmallest","addBack","popSmallest","addBack","addBack","addBack","addBack","addBack","addBack","addBack","popSmallest","popSmallest","addBack","addBack","popSmallest","popSmallest","popSmallest","addBack","addBack","popSmallest","popSmallest","addBack","addBack","addBack","addBack","addBack","addBack","addBack","addBack","popSmallest","popSmallest","addBack","popSmallest","addBack","addBack","popSmallest","addBack","addBack","addBack","addBack","popSmallest","addBack","addBack","popSmallest","popSmallest","popSmallest","addBack","popSmallest","popSmallest","addBack","popSmallest","popSmallest","popSmallest","addBack","popSmallest","addBack","addBack","addBack","popSmallest","popSmallest","addBack","popSmallest","addBack","addBack","addBack","popSmallest","addBack","popSmallest","addBack","popSmallest","addBack","addBack","addBack","popSmallest","popSmallest","popSmallest","addBack","addBack","addBack","addBack","addBack","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","addBack","addBack","popSmallest","addBack","popSmallest","addBack","addBack","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","addBack","popSmallest","addBack","popSmallest","popSmallest","addBack","popSmallest","addBack","popSmallest","addBack","addBack","addBack","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","addBack","addBack","popSmallest","popSmallest","popSmallest","addBack","addBack","popSmallest","addBack","addBack","popSmallest","addBack","addBack","popSmallest","popSmallest","addBack","addBack","popSmallest","popSmallest","addBack","popSmallest","popSmallest","popSmallest","addBack","popSmallest","popSmallest","popSmallest","addBack","addBack","addBack","popSmallest","addBack","addBack","addBack","addBack","addBack","addBack","addBack","popSmallest","addBack","addBack","addBack","addBack","addBack","addBack","addBack","addBack","addBack","addBack","popSmallest","addBack","addBack"]\n
// [[],[208],[],[752],[154],[178],[582],[],[],[],[],[],[],[239],[150],[905],[],[],[770],[400],[],[],[],[],[],[541],[],[758],[885],[931],[],[],[259],[],[561],[11],[357],[803],[997],[140],[124],[],[],[780],[678],[],[],[],[271],[996],[],[],[657],[230],[142],[362],[482],[707],[25],[291],[],[],[393],[],[955],[804],[],[178],[265],[526],[292],[],[479],[348],[],[],[],[278],[],[],[35],[],[],[],[691],[],[247],[791],[862],[],[],[112],[],[737],[808],[296],[],[773],[],[896],[],[865],[531],[800],[],[],[],[434],[110],[840],[323],[695],[],[],[],[],[],[734],[340],[],[240],[],[861],[154],[],[],[],[],[],[],[834],[],[162],[],[],[648],[],[385],[],[576],[165],[102],[],[],[],[],[],[626],[909],[],[],[],[306],[22],[],[22],[198],[],[603],[979],[],[],[410],[722],[],[],[822],[],[],[],[791],[],[],[],[878],[895],[740],[],[375],[94],[677],[309],[183],[178],[726],[],[710],[308],[652],[70],[167],[763],[388],[617],[876],[853],[],[354],[545]]\n
// @lcpr case=end


 */

