public class leet19_link 
{
    /* this code works but exceeds run time

    public ListNode removeNthFromEnd(ListNode head, int n)
    {
        int len=length(head);
        int pos=len-n+1;
        ListNode node = head;
        int i=0;
        while(i<pos-1)
        {
            node=node.next;
        }
        node.next=node.next.next;
        return head;
    }
    public int length(ListNode head)
    {
        int l=0;
        while(head.next!=null)
        {
            l++;
        }
        return l;
    }
    */

    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int length  = 0;
        ListNode first = head;
        while (first != null) 
        {
            length++;
            first = first.next;
        }
        length -= n;
        first = dummy;
        while (length > 0) 
        {
            length--;
            first = first.next;
        }
        first.next = first.next.next;
        return dummy.next;
    }
}
