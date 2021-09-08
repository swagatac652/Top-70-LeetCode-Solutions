class leet21_merge
{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) 
    {
       ListNode headNode=null, nextNode=null;
        while(l1!=null && l2!=null)
        {
            if(l1.val > l2.val)
            {
                ListNode newNode = new ListNode(l2.val);
                if(headNode==null)
                {
                    headNode = newNode;
                    nextNode=newNode;
                }
                if(nextNode!=null)
                {
                    nextNode.next=newNode;
                }
                nextNode=newNode;
                l2=l2.next;
            }
            else
            {
                ListNode newNode = new ListNode(l1.val);
                if(headNode==null)
                {
                    headNode=newNode;
                    nextNode=newNode;
                }
                if(nextNode!=null)
                {
                    nextNode.next=newNode;
                }
                nextNode=newNode;
                l1=l1.next;
            }
        }
        if(l1!=null)
        {
            if(nextNode!=null)
            {
                nextNode.next=l1;
            }
            else
            {
                headNode=l1;
            }
        }
        else
        {
            if(nextNode!=null)
            {
                nextNode.next=l2;
            }
            else
            {
                headNode=l2;
            }
        }

        return headNode;
    }
}