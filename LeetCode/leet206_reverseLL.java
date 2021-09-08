public class leet206_reverseLL 
{
    Node headNode;
    public Node reverselist(Node head)
    {
        Node prev = null;
        while(head!=null)
        {
            Node next = headNode.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;  
    }
}
