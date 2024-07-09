public class Solution
{
  public ListNode getIntersectionNode(ListNode headA, ListNode headB)
  {
    ListNode currentA = headA;
    ListNode currentB = headB;

    ListNode toReturn = null;

    int sizeA = 0;
    int sizeB = 0;
    while (currentA != null)
    {
      sizeA++;
      currentA = currentA.next;
    }
    currentA = headA; // Reset node to which currentA points to
    while (currentB != null)
    {
      sizeB++;
      currentB = currentB.next;
    }
    currentB = headB; // Reset node to which currentB points to

    int diff = Math.abs(sizeA - sizeB);

    if (sizeA > sizeB)
    {
      while (diff != 0)
      {
        diff--;

        try
        {
          currentA = currentA.next;
        }
        catch (NullPointerException e)
        {
          break;
        }
      }

      while (currentA != null || currentB != null)
      {
        if (currentA == currentB)
        {
          return currentA;
        }
        else
        {
          try
          {
            currentA = currentA.next;
            currentB = currentB.next;
          } catch (NullPointerException e)
          {
            return null;
          }
        }
      }
    }
    else if (sizeA < sizeB)
    {
      while (diff != 0)
      {
        currentB = currentB.next;
        diff--;
      }

      while (currentA != null || currentB != null)
      {
        if (currentA == currentB)
        {
          return currentA;
        }
        else
        {
          try
          {
            currentA = currentA.next;
            currentB = currentB.next;
          } catch (NullPointerException e)
          {
            return null;
          }
        }
      }
    }
    else
    {
      toReturn = incrementNode(currentA, currentB);
    }




    return toReturn;
  }

  private ListNode incrementNode(ListNode currentA, ListNode currentB)
  {
    while (currentA != null || currentB != null)
    {
      if (currentA == currentB)
      {
        return currentA;
      }
      else
      {
        try
        {
          currentA = currentA.next;
          currentB = currentB.next;
        } catch (NullPointerException e)
        {
          return null;
        }
      }
    }
  }
}
