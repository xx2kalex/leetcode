class Solution
{
  public static ListNode mergeTwoLists(ListNode list1, ListNode list2)
  {
    ListNode start = new ListNode(0);
    ListNode current = start;
    ListNode head1 = list1;
    ListNode head2 = list2;
    ListNode toReturn;

    if (head1 == null && head2 == null)
    {
      return null;
    }
    else
    {
      if (head1.val < head2.val)
      {
        current = head1;
        toReturn = head1;
        head1 = head1.next;
      }
      else
      {
        current = head2;
        toReturn = head2;
        head2 = head2.next;
      }
    }

    while ((head1 != null) && (head2 != null))
    {
      if (head1.val < head2.val)
      {
        current.next = head1;
        head1 = head1.next;
      }
      else
      {
        current.next = head2;
        head2 = head2.next;
      }

      current = current.next;
    }

    if (head2 != null)
    {
      while (head2 != null)
      {
        current.next = head2;
        head2 = head2.next;
      }
    }

    if (head1 != null)
    {
      while (head1 != null)
      {
        current.next = head1;
        head1 = head1.next;
      }
    }


    return toReturn;
  }

  public static void main(String[] args)
  {
    ListNode head1 = new ListNode(1);
    head1.next = new ListNode(2);
    head1.next.next = new ListNode(4);

    ListNode head2 = new ListNode(1);
    head2.next = new ListNode(3);
    head2.next.next = new ListNode(5);

    ListNode mergedList = mergeTwoLists(head1, head2);

    printList(mergedList);
  }

  public static void printList(ListNode node)
  {
    while (node != null)
    {
      System.out.print(node.val);
      if (node.next != null)
      {
        System.out.print(" -> ");
      }
      node = node.next;
    }
    System.out.println();
  }
  //
}
