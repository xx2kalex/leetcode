class Solution
{
  public static boolean isAnagram(String s, String t)
  {
    boolean isAnagram = false;

    int sLength = s.length();
    int tLength = t.length();

    // Immediate return if string lengths are not equal
    if (sLength != tLength)
    {
      System.out.println("sLength != tLength");
      return false;
    }

    System.out.println("Is every character in " + s + " also in " + t);
    boolean allCharsFound1 = false;
    for (int i = 0; i < sLength; i++)
    {
      char currChar1 = s.charAt(i);
      System.out.println("The current char is: " + currChar1);
      boolean foundCurChar1 = false;
      for (int j = 0; j < tLength; j++)
      {
        if (currChar1 == t.charAt(j))
        {
          System.out.println("We found the same character: " + currChar1);
          foundCurChar1 = true;
          continue;
        }
        if (j == tLength - 1 && foundCurChar1 == false)
        {
          System.out.println(
              "We did not find the same character, returning immediately: " + currChar1);
          return false;
        }
      }

      if (i == sLength - 1 && foundCurChar1 == true)
      {
        allCharsFound1 = true;
      }
    }

    System.out.println("Is every character in " + t + " also in " + s);
    boolean allCharsFound2 = false;
    for (int i = 0; i < tLength; i++)
    {
      char currChar2 = t.charAt(i);
      System.out.println("The current char is: " + currChar2);
      boolean foundCurChar2 = false;
      for (int j = 0; j < sLength; j++)
      {
        if (currChar2 == s.charAt(j))
        {
          System.out.println("We found the same character: " + currChar2);
          foundCurChar2 = true;
          continue;
        }
        if (j == tLength - 1 && foundCurChar2 == false)
        {
          System.out.println(
              "We did not find the same character, returning immediately: " + currChar2);
          isAnagram = false;
        }
      }

      if (i == tLength - 1 && foundCurChar2 == true)
      {
        allCharsFound2 = true;
      }
    }
    if (allCharsFound1 && allCharsFound2)
    {
      System.out.println("Each character that was in one string is also in the other.");
      isAnagram = true;
    }
    return isAnagram;
  }


  public static void main(String[] args)
  {
    System.out.println(isAnagram("bbcc", "ccbc"));
  }
}
