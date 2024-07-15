public class Main
{
  private static String printLL(Node head)
  {
    Node current = head;
    String output = "";

    while (current != null)
    {
      output = output + current.val + "->";
      current = current.next;
    }

    return output;
  }

  private static boolean test1()
  {

    MyLinkedList linkedList = new MyLinkedList();
    linkedList.addAtHead(1);
    linkedList.addAtTail(3);
    linkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
    linkedList.get(1);              // return 2
    linkedList.deleteAtIndex(1);    // now the linked list is 1->3
    linkedList.get(1);              // return 3

    String output = printLL(linkedList.head);

    if (!(output.equals("1->3->")))
    {
      return false;
    }

    return true;
  }

  private static boolean test2()
  {
    MyLinkedList myLinkedList = new MyLinkedList();
    myLinkedList.addAtHead(1);
    myLinkedList.addAtHead(2);
    myLinkedList.deleteAtIndex(0);

    String output = printLL(myLinkedList.head);

    if (!(output.equals("1->")))
    {
      return false;
    }

    return true;
  }

  private static boolean test3()
  {
    MyLinkedList linkedList = new MyLinkedList();
    linkedList.addAtHead(7);
    linkedList.addAtHead(2);
    linkedList.addAtHead(1);
    linkedList.addAtIndex(3, 0);
    System.out.println("#" + printLL(linkedList.head));
    linkedList.deleteAtIndex(2);
    linkedList.addAtHead(6);
    System.out.println("@" + printLL(linkedList.head));
    linkedList.addAtTail(4);
    System.out.println("@" + printLL(linkedList.head));
    linkedList.get(4);
    linkedList.addAtHead(4);
    System.out.println("#" + printLL(linkedList.head));
    linkedList.addAtIndex(5, 0);
    linkedList.addAtHead(6);


    String output = printLL(linkedList.head);

    if (!(output.equals("1->")))
    {
      return false;
    }

    return true;
  }



  public static void main(String[] args)
  {
    MyLinkedList myLinkedList = new MyLinkedList();

    System.out.println("Test 1 " + test1());
    System.out.println("Test 2 " + test2());
    System.out.println("Test 3 " + test3());

  }
}

