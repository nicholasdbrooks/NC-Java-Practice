package containsduplicate;

import java.util.Scanner;
import java.util.HashSet;

class Main {
  static boolean dupcheck(int[] nums) {
    HashSet<Integer> seen = new HashSet<Integer>();
    for (int i = 0; i < nums.length; i++) {
      if (seen.contains(nums[i])) {
        return true;
      } else {
        seen.add(nums[i]);
      }
    }
    return false;
  }
  public static void main(String[] args) {
    // initialize scanner, array of nums
    Scanner input = new Scanner(System.in);
    int[] nums;

    // get the number of ints that will be in the array
    System.out.println("How many numbers will be in your array? ");
    int length = input.nextInt();
    nums = new int[length];

    // fill the array
    for (int i = 0; i < length; i++) {
      System.out.println("Enter a number: ");
      nums[i] = input.nextInt();
    }

    // close the scanner
    input.close();

    // test for duplicates
    System.out.println("Are there any duplicates? " + dupcheck(nums));

    
  }
}