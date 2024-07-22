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
  Node dummyBack;
  int length;

  public BrowserHistory(String homepage)
  {
    this.head = new Node(homepage);
    this.tail = head;
    this.current = this.head;
    this.dummyBack = tail.next;
    this.length = 0;
  }

  public void visit(String url)
  {
    Node nodeToAdd = new Node(url);

    if (length == 1)
    {
      // Adding at the front (after first visited website)

      // ->
      current.next = nodeToAdd;

      // <-
      nodeToAdd.prev = current;

      // Move current up to the newly added node
      current = nodeToAdd;

      // We have two nodes total, so tail becomes current

      tail = current;
    }
    else if (current.next == dummyBack && length > 1)
    {
      // Adding at the back, if not after the first visited website

      // <-
      dummyBack.prev.next = nodeToAdd;

      // ->
      nodeToAdd.next = dummyBack;

      // Update tail pointer
      tail = tail.next;
    }
    else
    {
      // Adding somewhere in the middle

      // ->
      nodeToAdd.prev = current.prev;

      // <-
      nodeToAdd.next = current.next;

      // Set current to be recently added node
      current = nodeToAdd;
    }

    length++;
  }

  public String back(int steps)
  {


    return null;
  }

  public String forward(int steps)
  {

    return null;
  }
}
