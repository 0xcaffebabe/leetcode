/*
 * @lc app=leetcode.cn id=295 lang=java
 *
 * [295] 数据流的中位数
 * 
 * 21/21 cases passed (99 ms)
 * Your runtime beats 74.41 % of java submissions
 * Your memory usage beats 87.45 % of java submissions (59.3 MB)
 */

// @lc code=start
class MedianFinder {

    PriorityQueue<Integer> min = new PriorityQueue<Integer>((a,b) -> b-a);
    PriorityQueue<Integer> max = new PriorityQueue<Integer>((a,b) -> a-b);

    /* 
     * 
     * 通过维护两个最大堆 保证中位数处于堆顶（单数在min，双数在min跟max）
     */
    public MedianFinder() {

    }
    
    public void addNum(int num) {
        // 优先加入到左侧 或者当当前数字小于左侧最大值时，就加入到左侧
        if (min.isEmpty() || num < min.peek()) {
            min.offer(num);
            // 如果左侧比右侧大于超过1个单位，移动左侧1个单位到右侧
            if (max.size() + 1 < min.size()) max.offer(min.poll());
        }else {
            // 比左侧的最大值大时，加入到右侧
            max.offer(num);
            // 如果此时右侧长度大于左侧了，则移动右侧1个单位到左侧
            if (min.size() < max.size()) min.offer(max.poll());
        }
    }
    
    public double findMedian() {
        if (max.size() == min.size()) {
            return (max.peek() + min.peek()) / 2d;
        }
        return min.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
// @lc code=end

