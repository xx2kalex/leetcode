class Solution
{
  public static ListNode removeElements(ListNode head, int val)
  {
    ListNode currentNode = head;
    ListNode currentHead = head;

    // With an empty Linked List, simply return null
    if (currentHead == null)
    {
      return null;
    }

    while (currentNode != null)
    {
      if (currentHead.val == val)
      {
        // System.out.println("The head of the list is an illegal value");
        currentHead = currentHead.next;
        currentNode = currentNode.next;
        System.out.println("Current head: " + currentHead);
      }
      else
      {
        // System.out.println("The head of the list is legal, moving on to the rest");
        break;
      }
    }
    // System.out.println("Exited first while loop");

    if (currentHead != null)
    {
      // Reset currentNode pointer to original head
      currentNode = head;
    }
    else
    {
      // There are no more nodes in the linked list
      return null;
    }


    while (currentNode != null)
    {
      // System.out.println("Inside second while loop");
      if (currentNode.next != null && currentNode.next.val == val)
      {
        // System.out.println("The next value is illegal: " + currentNode.next.val);
        currentNode.next = currentNode.next.next;
        // // System.out.println("We will now set the next the next node to be: " + currentNode.next.val);
        if (currentNode.next != null)
        {
          try
          {
            while (currentNode.next.val == val)
            {
              // System.out.println("We have encountered b2b illegal nodes");
              // System.out.println("We will take illegal node: " + currentNode.next.val);
              currentNode.next = currentNode.next.next;
              // System.out.println("and set the next node to be: " + currentNode.next.val);
            }
          }
          catch (NullPointerException e)
          {
            break;
          }
        }
      }
      else
      {
        // // System.out.println("The current node's next node " + currentNode.next.val + " was legal");
        currentNode = currentNode.next;
        // // System.out.println("We will now check the next node's next node " + currentNode.next.val);

      }
    }

    return currentHead;
  }

  public static void main(String[] args)
  {
//    ListNode head = new ListNode(1);
//    ListNode second = new ListNode(2);
//    ListNode third = new ListNode(6);
//    ListNode fourth = new ListNode(3);
//    ListNode fifth = new ListNode(4);
//    ListNode sixth = new ListNode(5);
//    ListNode seventh = new ListNode(6);

//    ListNode head = new ListNode(9);
//    ListNode second = new ListNode(9);
//    ListNode third = new ListNode(9);
//    ListNode fourth = new ListNode(1);
//    ListNode fifth = new ListNode(9);
//    ListNode sixth = new ListNode(9);
//    ListNode seventh = new ListNode(9);

//    ListNode head = new ListNode(7);
//    ListNode second = new ListNode(7);
//    ListNode third = new ListNode(7);
//    ListNode fourth = new ListNode(7);

    ListNode head = new ListNode(5);
    ListNode second = new ListNode(4);
    ListNode third = new ListNode(3);
    ListNode fourth = new ListNode(2);
    ListNode fifth = new ListNode(1);
    ListNode sixth = new ListNode(1);



    head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    fifth.next = sixth;
//    sixth.next = seventh;
    ListNode nullHead = new ListNode();

    int val = 1;

    removeElements(head, val);
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
