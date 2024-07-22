public class Tester
{
  private static String printLL(Node head)
  {
    Node current = head;
    String output = "";

    while (current != null)
    {
      output = output + current.website + "->";
      current = current.next;
    }

    return output;
  }

  private static boolean test1()
  {
    BrowserHistory bh = new BrowserHistory("google.com");
    bh.visit("linkedin.com");
  }
}
