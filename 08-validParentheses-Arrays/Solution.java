import java.util.ArrayList;

class Solution
{
  public static boolean isValid(String s)
  {
    ArrayList<Character> stack = new ArrayList<Character>();

    // Adds all the characters in the String to a stack
    for (int i = 0; i < s.length(); i++)
    {
      stack.add(s.charAt(i));
    }

    // Checks if all parentheses have an inverse
    if (!containsInverse(stack))
    {
      return false;
    }

    char currChar;
    int currIndex;

    return true;
  }

  private static boolean containsInverse(ArrayList<Character> stack)
  {
    if ((stack.contains('(') && !stack.contains(')')) ||
        (stack.contains(')') && !stack.contains('(')))
    {
      return false;
    }
    if ((stack.contains('[') && !stack.contains(']')) ||
        (stack.contains(']') && !stack.contains('[')))
    {
      return false;
    }
    if ((stack.contains('{') && !stack.contains('}')) ||
        (stack.contains('}') && !stack.contains('{')))
    {
      return false;
    }

    return true;
  }


  private static boolean correctOrder(String s)
  {
    boolean openingParenthese;

    for (int i = 0; i < s.length(); i++)
    {
      // Determine if the current parenthese is an opening one or closing one
      if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
      {
        openingParenthese = true;
      }
      else
      {
        openingParenthese = false;
      }

      if (openingParenthese)
      {
        for (int j = i+1; i < s.length(); i++)
        {
          if (!openingParenthese || !(s.charAt(j) == //the exact inverse))
        }
      }
    }
  }

  public static void main(String[] args)
  {
    String s = "(][)";
    System.out.println(isValid(s));
  }
}
