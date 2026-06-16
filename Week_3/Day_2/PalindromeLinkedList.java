class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null ) return true;
        ListNode fast =head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow= slow.next;
        }
        ListNode pre = null;
        ListNode post = null;
        ListNode curr = slow.next;
        while(curr!= null){
            post = curr.next;
            curr.next= pre;
            pre= curr;
            curr = post;
        }
        slow.next = pre;
        ListNode temp1 = head;
        ListNode temp2 = slow.next;
        while(temp2!=null){
            if(temp1.val!= temp2.val) return false;
            temp1 = temp1.next;
            temp2 = temp2.next;
           
        }
        
    return true;
}
}
