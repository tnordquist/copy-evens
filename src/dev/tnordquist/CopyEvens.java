package dev.tnordquist;

/**
 * CodingBat: Given an array of positive ints, return a new array of length "count" containing the
 * first even numbers from the original array. The original array will contain at least "count" even
 * numbers.
 */
public class CopyEvens {

  public int[] copyEvens(int[] nums, int count) {

    int[] arr = new int[count];
    int index = 0;
    for (int i = 0; i < nums.length; ++i) {

      if (nums[i] % 2 == 0 && arr[arr.length - 1] == 0) {
        arr[index++] = nums[i];
      }

    }
    return arr;
  }


}
