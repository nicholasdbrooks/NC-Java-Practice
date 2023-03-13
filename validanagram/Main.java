package validanagram;

import java.util.*;

class Main {
  static boolean anagram(char[] a, char[] b) {
    // check to see if the strings are the same length
    if (a.length != b.length) {
      return false;
    }

    // sort the arrays
    Arrays.sort(a);
    Arrays.sort(b);

    for (int i = 0; i < a.length; i++) {
      if (a[i] != b[i]) {
        return false;
      }
    }

    return true;
  }
  public static void main(String[] args) {
    // initialize Scanner, Strings
    Scanner input = new Scanner(System.in);
    String a, b;

    // get input from the user
    System.out.println("Enter a word: ");
    a = input.nextLine();
    System.out.println("Enter a second word: ");
    b = input.nextLine();

    input.close();

    // convert the strings to arrays of chars
    char[] a_array = a.toCharArray();
    char[] b_array = b.toCharArray();

    System.out.println("Are the strings " + a + " and " + b + " anagrams? " + anagram(a_array, b_array));
    
  }
}