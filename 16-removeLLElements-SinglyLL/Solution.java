class Solution
{
  public ListNode removeElements(ListNode head, int val)
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
      if (currentNode.next != null)
      {
        if (currentHead.val == val)
        {
          // The head of the list is an illegal value
          System.out.println("The head of the list is an illegal value");
          if (currentHead.next.val != val && currentNode.next.val != val)
          {
            currentHead = currentHead.next;
            currentNode = currentNode.next;
          }
          else
          {

          }


        }
        else if (currentNode.next.val == val)
        {
          System.out.println("Encountered an illegal value that is not the head");
          currentNode.next = currentNode.next.next;
          if (currentNode.next != null && currentNode.next.val == val)
          {
            currentNode.next = currentNode.next.next;
          }
          currentNode = currentNode.next;
        }
        else
        {
          currentNode = currentNode.next;
        }
      }
      else
      {
        // If the Linked List only contains one value:
        if (currentHead.val == val)
        {
          return null; // the only node had an illegal value
        }
        else
        {
          return currentHead; // the only node had a legal value, return it
        }
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
    ListNode head = new ListNode(9);
    ListNode second = new ListNode(9);
    ListNode third = new ListNode(9);
    ListNode fourth = new ListNode(1);
    ListNode fifth = new ListNode(9);
    ListNode sixth = new ListNode(9);
    ListNode seventh = new ListNode(9);
    head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    fifth.next = sixth;
    sixth.next = seventh;
    ListNode nullHead = new ListNode();

    int val = 9;

    Solution sol = new Solution();
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

  private ListNode iterateLL(ListNode head, int value)
  {
    ListNode current = head;

    while (current != null)
    {
      if (current.val == head)
    }
  }


  }
