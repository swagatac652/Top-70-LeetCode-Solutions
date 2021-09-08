class leet142_cycle
{
    public ListNode detectCycle(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        while(fast != null && slow != null && fast.next != null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)
            {
                return startLoop(slow,head); //position where fast and slow meet
            }   
        }
        return null;
    }
    public ListNode startLoop(ListNode head, ListNode slow)
    {
        ListNode node = head;
        while(node!=slow)
        {
            slow=slow.next;
            node=node.next;
        }
        return slow;
    }
}