class leet2_addLink
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        ListNode headNode = new ListNode(0);

        ListNode l3 = headNode;
        int carry=0;

        while(l1!=null || l2!=null)
        {
            int l1_val = (l1!=null)?l1.val:0; //substitute blank places with 0 so that both lists are of same length
            int l2_val = (l2!=null)?l2.val:0;

            int current_sum = l1_val + l2_val + carry;
            carry = current_sum/10;
            int last_digit  = current_sum%10;

            ListNode newNode = new ListNode(last_digit);
            l3.next=newNode;

            if(l1!=null)
            l1=l1.next;

            if(l2!=null)
            l2=l2.next;

            l3=l3.next;

        }

        if(carry>0)
        {
            ListNode new_Node = new ListNode(carry);
            l3.next = new_Node;
            l3=l3.next;
        }

        return headNode.next;
    }
}