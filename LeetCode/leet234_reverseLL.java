public class leet234_reverseLL
{
    public boolean isPalindrome(Node head)
    {
        Node start = head;
        Node end = head;
        while(end!=null && end.next!=null)
        {
            end=end.next.next;
            start=start.next;
        }
        start=reverselist(start);
        end=head;
        while(start!=null)
        {
            if(start.data!=end.data)
            {
                return false;
            }
            start=start.next;
            end=end.next;
        }
        return true;
    }
    public Node reverselist(Node head)
    {
        Node prev = null;
        while(head!=null)
        {
            Node next = head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;  
    }    
}
