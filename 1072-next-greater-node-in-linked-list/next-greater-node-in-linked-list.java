/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        if(head != null){
            ListNode temp = head;
            int len = length(temp);
            System.out.println("the length is : "+len);
            int arr[] = new int[len];
            int i = 0;
            while(head.next !=null){
                temp = head;
                while(temp.next != null){
                    if(head.val < temp.next.val){
                        arr[i] = temp.next.val;
                        break;
                    }else{
                        temp = temp.next;
                    }
                }
                i++;
                head = head.next;
            }
            return arr;
        }else{
            return new int[0];
        }
    }

    public static int length(ListNode curr) {
        int res = 0;
        while (curr != null) {
            res++;
            curr = curr.next;
        }
        return res;
    }
}