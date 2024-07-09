class Solution
{
  public ListNode removeElements(ListNode head, int val)
  {
    ListNode currentNode = head;
    ListNode currentHead = head;

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
          System.out.println("The head of the list is an illegal value");
          currentHead = currentHead.next;
          System.out.println("The new head is: " + currentHead.val);
          currentNode = currentNode.next;
          System.out.println("Moving on to node " + currentNode.val);
        }
        else if (currentNode.next.val == val)
        {
          System.out.println("Encountered an illegal value that is not the head");
          currentNode.next = currentNode.next.next;
          // TODO - this does not work if you have back to back illegal values
          currentNode = currentNode.next;
          try
          {
            System.out.println("Moving on to node " + currentNode.val);
          }
          catch (NullPointerException e)
          {
            System.out.println("Moving on to node null");
          }

        }
        else
        {
          currentNode = currentNode.next;
        }
      }
      else
      {
        if (currentHead.val == val)
        {
          return null;
        }
        else
        {
          return currentHead;
        }
      }

    }


    return currentHead;
  }

  public static void main(String[] args)
  {
    ListNode head = new ListNode(1);
    ListNode second = new ListNode(2);
    ListNode third = new ListNode(2);
    ListNode fourth = new ListNode(1);
//`    ListNode fifth = new ListNode(4);
//    ListNode sixth = new ListNode(5);
//    ListNode seventh = new ListNode(6);`
    head.next = second;
    second.next = third;
    third.next = fourth;
//    fourth.next = fifth;
//    fifth.next = sixth;
//    sixth.next = seventh;
    ListNode nullHead = new ListNode();

    int val = 2;

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


  }
