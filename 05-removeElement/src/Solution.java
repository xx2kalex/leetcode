class Solution
{
  public int removeElement(int[] nums, int val)
  {
    if (nums.length == 0)
    {
      return 0;
    }

    int placeholder;
    int k = nums.length - 1;
    for (int i = 0; i < nums.length; i++)
    {
      // Assigns the illegal value to the end of the list and shifts everything else left
      if (nums[i] == val)
      {
        placeholder = nums[i];
        nums[i-1] = nums[i]; // TODO - this will cause OOB for i = 0
        nums[k] = placeholder;
      }
    }
  } //
}
