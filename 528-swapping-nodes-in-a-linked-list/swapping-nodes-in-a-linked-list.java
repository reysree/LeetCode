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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp1 = head;
        ListNode temp2 = head;
        ListNode dummy = head;
        int i=1;
        while(i<k){
            temp1 = temp1.next;
            i++;
        }
        dummy = temp1;
        while(dummy.next != null){
            temp2= temp2.next;
            dummy= dummy.next;
        }
        System.out.println("temp1 value is : "+temp1.val);
        System.out.println("temp2 value is : "+temp2.val);
        i = temp1.val;
        temp1.val = temp2.val;
        temp2.val= i;
        return head;
    }
}