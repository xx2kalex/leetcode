public class Tester
{
  private static String printBrowserHistory(BrowserHistory bh)
  {
    Node current = bh.head;
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

    return printBrowserHistory(bh).equals("google.com->linkedin.com->");
  }

  private static boolean test2()
  {
    BrowserHistory bh = new BrowserHistory("google.com");
    bh.visit("linkedin.com");
    bh.visit("bing.com");

    return printBrowserHistory(bh).equals("google.com->linkedin.com->bing.com->");
  }

  private static boolean test3()
  {
    BrowserHistory bh = new BrowserHistory("google.com");
    bh.visit("linkedin.com");
    bh.current = bh.current.prev;
    bh.visit("bing.com");

    return printBrowserHistory(bh).equals("google.com->bing.com->");
  }

  private static boolean test4()
  {
    BrowserHistory bh = new BrowserHistory("A");
    bh.visit("B");
    bh.visit("C");
    bh.visit("D");
    bh.visit("E");
    String newWebsite = bh.back(4);

    return printBrowserHistory(bh).equals("A->B->C->D->E->") && newWebsite.equals("A");
  }

  private static boolean test5()
  {
    BrowserHistory bh = new BrowserHistory("leetcode");
    bh.visit("google");
    bh.visit("facebook");
    bh.visit("youtube");
    bh.back(1);
    bh.back(1);
    bh.forward(1);
    bh.visit("linkedin");
    if (bh.length != 4)
    {
      return false;
    }
    bh.forward(2);
    bh.back(2);
    bh.back(7);

    return printBrowserHistory(bh).equals("leetcode->google->facebook->linkedin->");
  }


  public static void main(String[] agrs)
  {
//    System.out.println("1: " + test1());
//    System.out.println("2: " + test2());
//    System.out.println("3: " + test3());
//    System.out.println("4: " + test4());
    System.out.println("5: " + test5());

  }
}
