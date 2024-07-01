class Solution
{
  public ListNode deleteDuplicates(ListNode head)
  {
    ListNode current;
    current = head;

    while (current != null)
    {
      if (current.next.val == current.val)
      {
        current.next = current.next.next;
      }
      else
      {
        current = current.next;
      }
    }

    return head;
  }
}
