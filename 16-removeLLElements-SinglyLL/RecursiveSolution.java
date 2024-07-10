public class RecursiveSolution
{
  public ListNode removeElements(ListNode head, int val)
  {
    ListNode currentNode = head;
    ListNode currentHead = head;

    while (currentNode != null)
    {
      if (currentHead.val == val)
      {
        currentHead = currentHead.next;
        removeElements(currentHead, val);
      }
      if (currentNode.val == val)
      {
        currentNode = currentNode.next;
        removeElements(currentNode, val);
      }

      else
      {
        currentNode = currentNode.next;
      }
    }

    return currentHead;
  }

  public static void main(String[] args)
  {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(6);
        ListNode fourth = new ListNode(3);
        ListNode fifth = new ListNode(4);
        ListNode sixth = new ListNode(5);
        ListNode seventh = new ListNode(6);
//    ListNode head = new ListNode(9);
//    ListNode second = new ListNode(9);
//    ListNode third = new ListNode(9);
//    ListNode fourth = new ListNode(1);
//    ListNode fifth = new ListNode(9);
//    ListNode sixth = new ListNode(9);
//    ListNode seventh = new ListNode(9);
    head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    fifth.next = sixth;
    sixth.next = seventh;
    ListNode nullHead = new ListNode();

    int val = 9;

    RecursiveSolution sol = new RecursiveSolution();
    sol.removeElements(head, val);
    printLL(head);
  }

  public static void printLL(ListNode head)
  {
    ListNode current = head;
    String output = "";

    while (current != null)
    {
      output = output + current.val + "->";
      current = current.next;
    }

    System.out.println(output);
  }
}
