import java.util.Arrays;

class Solution
{
  public static int removeElement(int[] nums, int val)
  {
    if (nums.length == 0)
    {
      return 0;
    }

    int placeholder;
    int k = nums.length - 1;
    int legalVals = nums.length;
    int totalIterations = 0;
    for (int i = 0; i < nums.length; i++)
    {
      if (totalIterations == k+1)
      {
        return legalVals;
      }

      // Edge Case: the illegal value is the first value
      if (i == 0 && nums[i] == val)
      {
        // Swap last and first values;
        placeholder = nums[i];
        for (int j = 1; j < nums.length; j++)
        {
          nums[j-1] = nums[j];
        }
        nums[k-1] = placeholder;

        i = -1;
        legalVals--;
        totalIterations = 0;
        continue;
      }

      // Assigns the illegal value to the end of the list and shifts everything else left
      if ((nums[i] == val) && (i != 0))
      {
        placeholder = nums[i];
        for (int j = i + 1; j < nums.length; j++)
        {
          nums[j-1] = nums[j];
        }
        nums[k-1] = placeholder;

        i = -1;
        legalVals--;
        totalIterations = 0;
        continue;
      }

      else
      {
        totalIterations++;
      }

      System.out.println(Arrays.toString(nums));
    }

    return legalVals;
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

  public static void main(String[] args)
  {
    int[] nums = {0,1,2,2,3,0,4,2};
    int val = 2;
    System.out.println(removeElement(nums, val));
    System.out.println(Arrays.toString(nums));
  }
}

