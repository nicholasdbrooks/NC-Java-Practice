package test;
import java.util.HashSet;

public class test {
    public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4, 1};

      // initialize HashSet
      HashSet<Integer> nums = new HashSet<Integer>();

      for(int i = 0; i < arr.length; i++) {
        if (nums.contains(arr[i])) {
          System.out.println("False");
          break;
        } else {
          nums.add(arr[i]);
        }
      }
      System.out.println("True");
    }
}
