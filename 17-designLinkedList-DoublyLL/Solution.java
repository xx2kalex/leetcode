class MyLinkedList
{
  static ListNode head;
  ListNode tail;

  public MyLinkedList()
  {
    tail = head;
  }

  public int get(int index)
  {
    ListNode current = head;
    int counter = 0;

    while (current != null)
    {
      if (counter == index)
      {
        System.out.println("You got: " + current.val);

        return current.val;
      }
      else
      {
        counter++;
        current = current.next;
      }
    }


    return -1;
  }

  public void addAtHead(int val)
  {
    ListNode nodeToAdd = new ListNode(val);
    nodeToAdd.next = head;
    head = nodeToAdd;
    if (getLength(head) == 1)
    {
      tail = head;
    }
  }

  public void addAtTail(int val)
  {
    ListNode nodeToAdd = new ListNode(val);
    tail.next = nodeToAdd;
    nodeToAdd.prev = tail;
    tail = nodeToAdd;
  }

  public void addAtIndex(int index, int val)
  {
    if (index > getLength(head) + 1)
    {
      return;
    }
    if (index == 0)
    {
      addAtHead(val);
    }
    if (index == getLength(head) + 1)
    {
      addAtTail(val);
    }
    else
    {
      ListNode nodeToAdd = new ListNode(val);
      ListNode current = head;
      int counter = 0;

      while (current != null)
      {
        if (counter == index - 1)
        {
          nodeToAdd.next = current.next;
          if (current.next != null)
          {
            current.next.prev = nodeToAdd;
          }
          current.next = nodeToAdd;
          nodeToAdd.prev = current;
          break;
        }
        else
        {
          counter++;
          current = current.next;
        }
      }
    }
  }

  public void deleteAtIndex(int index)
  {
    if (index < 0 || index > getLength(head))
    {
      return;
    }
    else
    {
      ListNode current = head;
      int counter = 0;

      while (current != null)
      {
        if (counter == index)
        {
          current.prev.next = current.next;

          break;
        }
        else
        {
          counter++;
          current = current.next;
        }
      }
    }
  }

  private int getLength(ListNode head)
  {
    ListNode current = head;
    int length = 0;

    while (current != null)
    {
      length++;
      current = current.next;
    }

    return length;
  }

  private static String printLL(ListNode head)
  {
    ListNode current = head;
    String output = "";

    while (current != null)
    {
      output = output + current.val + "->";
      current = current.next;
    }

    return output;
  }

  public static void main(String[] args)
  {
    MyLinkedList myLinkedList = new MyLinkedList();
    myLinkedList.addAtHead(1);
    System.out.println(printLL(head));
    myLinkedList.addAtTail(3);
    System.out.println(printLL(head));
    myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
    System.out.println(printLL(head));
    myLinkedList.get(1);              // return 2
    myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
    System.out.println(printLL(head));
    myLinkedList.get(1);              // return 3
    System.out.println(printLL(head));
  }
}

