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
 import java.util.Stack;
class Solution {
    public ListNode removeNodes(ListNode head) {
        if(head == null){
            return head;
        }

        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;

        while(temp !=null){
            while(!stack.isEmpty() && stack.peek().val < temp.val){
                stack.pop();
            }
            stack.push(temp);
            temp=temp.next;
        }
        ListNode res = stack.isEmpty() ? null : stack.get(0);
        ListNode prev = res;
        for(int i=1; i< stack.size(); i++){
            prev.next = stack.get(i);
            prev = prev.next;
        }
        return res;

    }
}