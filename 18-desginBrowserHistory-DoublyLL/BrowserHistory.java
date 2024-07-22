class Node
{
  String website;
  Node next;
  Node prev;

  Node()
  {
  }

  Node(String website)
  {
    this.website = website;
  }
}


class BrowserHistory
{
  Node current = null;
  Node head;
  Node tail;
  Node dummyFront;
  Node dummyBack;
  int length;
  int currentIndex;

  public BrowserHistory(String homepage)
  {
    this.head = new Node(homepage);
    this.tail = head;
    this.dummyFront = head.prev;
    this.current = this.head;
    this.dummyBack = tail.next;
    this.length = 1;
    this.currentIndex = 0;
  }

  public void visit(String url)
  {
    Node nodeToAdd = new Node(url);

    // We are always adding at the back because we clear all forward browser history

    // current->NTA
    Node placeholderPointer = current.next;

    current.next = nodeToAdd;

    if (placeholderPointer != null)
    {
      // NTA->NTA.next
      nodeToAdd.next = placeholderPointer;
      // NTA<-NTA.next
      placeholderPointer.prev = nodeToAdd;
    }

    // current<-NTA
    nodeToAdd.prev = current;


    // Move current up to the newly added node
    current = nodeToAdd;

    Node temp = nodeToAdd.next;
    while (temp != null)
    {
      Node next = temp.next;
      temp.next = null;
      temp.prev = null;
      temp = next;
      length--;
    }

    current.next = null;

    length++;
    currentIndex++;
  }

  public String back(int steps)
  {
    if (steps > currentIndex)
    {
      steps = currentIndex;
    }

    while (steps != 0)
    {
      current = current.prev;
      steps--;
      currentIndex--;
    }

    System.out.println("You are now back at: " + current.website + " at index: " + currentIndex);
    return current.website;
  }

  public String forward(int steps)
  {
    if (steps > length - currentIndex - 1)
    {
      steps = length - currentIndex - 1;
    }

    while (steps != 0)
    {
      current = current.next;
      steps--;
      currentIndex++;
    }

    try
    {
      System.out.println("You went forward to: " + current.website + " to index: " + currentIndex);
    } catch (NullPointerException exception)
    {
      System.out.println("You went forward to: null" + " to index: " + currentIndex);
    }

    return current.website;
  }
}
