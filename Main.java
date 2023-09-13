import ReverseLinkedList.ListNode;

public class main{
   public ListNode reverseList(ListNode head) {
if(head == null){
return null;
}

if(head.next==null){
    return head;
}
ListNode prev = null;
ListNode curr = head;
while(curr!=null){
    curr.next= prev;
    prev = curr;
    curr=nextNode;
}
   }
}