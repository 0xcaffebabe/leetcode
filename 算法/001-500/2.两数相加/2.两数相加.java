/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> list = process(l1,l2);
        
        ListNode l = f(list);
        return l;
    }
    
    private ListNode f(List<Integer> list){
        if (list.size()>0){
            int i = list.get(0);
            ListNode l = new ListNode(i);
            list.remove(0);
            l.next = f(list);
            return l;
        }else{
            return null;
        }
        
    }
    private List<Integer> process(ListNode l1,ListNode l2){
        
       List<Integer> list = new ArrayList<>();
      
       while(l1 != null || l2 != null){
           if (l1 == null){
              list.add(l2.val);
              l2 = l2.next;
           }else if(l2 == null){
               list.add(l1.val);       
               l1 = l1.next;
           }else{
               list.add(l1.val+l2.val);
               l1= l1.next;
               l2 = l2.next;
           }
           
       } 
        
       for (int i=0;i<list.size();i++){
           if (list.get(i) >=10){
               int m = list.get(i)-10;
               list.set(i,m);
               if(list.size()-1 <= i){
                   list.add(1);
               }else{
                   list.set(i+1,list.get(i+1)+1);
               }
           }
       }
        return list;
    } 
}
// @lc code=end

