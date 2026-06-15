class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode post = null;
        ListNode curr = head;
        if(head== null || head.next==null){
            return head;
        }
        while(curr!=null){

            post = curr.next;
            curr.next = prev;
            prev = curr;
            curr = post;
            
        }
       
        
      return prev;
    }
}
