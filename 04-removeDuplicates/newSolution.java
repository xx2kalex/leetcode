import java.util.Arrays;

class newSolution
{
  public static int removeDuplicates(int[] nums)
  {
    int amtOfThisInt;
    int finalNum = nums[nums.length - 1];
    int uniqueNumbers = 0;
    boolean finalNumAccessed = false;

    for (int i = 1; i < nums.length; i++)
    {
      amtOfThisInt = amtOfAnInt(nums, nums[i]);
      while (amtOfThisInt > 1)
      {
        removeValue(nums, i);
        amtOfThisInt--;
      }
    }

    for (int i = 0; i < nums.length; i++)
    {
      if (amtOfAnInt(nums, nums[i]) == 1)
      {
        uniqueNumbers++;
      }

      if (!finalNumAccessed)
      {
        if (nums[i] == finalNum)
        {
        uniqueNumbers++;
        finalNumAccessed = true;
        }
      }

    }


    System.out.println("Final answer: " + Arrays.toString(nums));


    return uniqueNumbers;
  }

  /**
   * @param arr - the input array
   */
  private static void removeValue(int[] arr, int indexToDelete)
  {
    for (int i = indexToDelete + 1; i < arr.length; i++)
    {
      arr[i - 1] = arr[i];
    }
    System.out.println("After shifting: " + Arrays.toString(arr));
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

  public static void main(String args[])
  {
    int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

     System.out.println(removeDuplicates(nums));
  }
}
