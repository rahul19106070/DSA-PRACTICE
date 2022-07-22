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
    public ListNode partition(ListNode head, int x) {
        ListNode s=null;
        ListNode si=null;
        ListNode l=null;
        ListNode li=null;
        ListNode curr=head;
        while(curr!=null){
           
             if(curr.val<x){
                 // System.out.println("--"+curr.val);
                 if(s==null){
                     s=curr;
                     si=curr;
                     curr=curr.next;
                 }else{
                 si.next=curr;
                si=si.next;
                curr=curr.next;
                 }
            }else if (curr.val>=x){
                 // System.out.print(curr.val);
                 if(l==null){
                     l=curr;
                     li=curr;
                     curr=curr.next;
                 }
                 else{
                li.next=curr;
                li=li.next;
                curr=curr.next;
                 }
            }
        }
        if(l!=null){
            li.next=null;
        }
        // System.out.print(si.val);
        // System.out.print(s.val);
        if(s==null || l==null){
            return head;
        }
        else {
            si.next=l;
            return s;
        }
        
        
    }
}