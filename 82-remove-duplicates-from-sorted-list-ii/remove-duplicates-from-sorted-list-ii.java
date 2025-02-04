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
    public ListNode deleteDuplicates(ListNode head) {
        if(head != null){
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode prev = dummy;
            boolean flag = false;
            while(head != null){
                flag = false;
                while(head.next != null && head.val == head.next.val){
                    flag = true;
                    head = head.next;
                }
                if(flag){
                    prev.next = head.next;
                }else{
                    prev= prev.next;
                }
                head = head.next;
            }
            return dummy.next;
        }else{
            return head;
        }

        
    }
}