class AnotherSolution
{
  public static int removeDuplicates(int[] nums)
  {
    int amtOfThisInt;
    for (int i = 0; i < nums.length; i++)
    {
      amtOfThisInt = amtOfAnInt(nums, i);
      if (amtOfThisInt > 1)
      {
        removeMiddle(nums, i, nums.length);
      }
    }

    return nums.length;
  }

  /**
   * Helper method to determine the amount of occurrences of a specific integer in a given array
   *
   * @param nums - the array of numbers
   * @param num  - the particular integer
   * @return - the number of occurrences of a particular integer
   */
  private static int amtOfAnInt(int[] nums, int num)
  {
    int numMatches = 0;
    for (int i = 0; i < nums.length; i++)
    {
      int currInt = nums[i];

      if (currInt == num)
      {
        numMatches++;
      }
    }

    return numMatches;
  }

  private static int[] removeMiddle(int[] arr, int i, int length)
  {
    // Shift starting from i + 1 to end
    for (int index = i + 1; index < length; index++)
    {
      arr[index - 1] = arr[index];
    }
    // No need to 'remove' arr[i], since we already shifted

    return arr;
  }


  public static void main(String args[])
  {
    int[] nums = {0,0,1,1,1,2,2,3,3,4};
    System.out.println(removeDuplicates(nums));
  }
}
