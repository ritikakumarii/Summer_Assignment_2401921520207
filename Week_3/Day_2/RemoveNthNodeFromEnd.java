class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        if(head==null||head.next==null) return null;

        for(int i = 0 ;i<n;i++){
            fast=fast.next;
        }
        if(fast==null) {
            head=head.next;
            return head;
        }
        while(fast!=null && fast.next!=null){
            fast=fast.next;
            slow= slow.next;
        }
        if(slow.next!=null){
        slow.next=slow.next.next;
        }
     return head;

    }
}  
