package twosum;

import java.util.*;

class Main {
  public static void main(String[] args) {
    int[] arr = {7, 5, 8, 12, 3, 1};
    ArrayList<Integer> nums = new ArrayList<Integer>();
    
    for (int i = 0; i < arr.length; i++) {
      nums.add(arr[i]);
    }

    int target = 20;
    int remainder;

    int[] indices = new int[2];

    for (int num : nums) {
      remainder = target - num;
      if (nums.contains(remainder)) {
        indices[0] = nums.indexOf(num);
        indices[1] = nums.indexOf(remainder);
        break;
      } 
    }
    
    System.out.println("[" + indices[0] + ", " + indices[1] + "]");
  }
}