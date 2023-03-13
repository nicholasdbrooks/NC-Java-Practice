package validpalindrome;

import java.util.*;

class Main {
  static boolean palindrome(String word) {
    int backwards = word.length() - 1;
    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == word.charAt(backwards)) {
        backwards -= 1;
      } else {
        return false;
      }
    }
    return true;
  }
  
  public static void main(String[] args) {
    // Initialize Scanner to get user input
    Scanner input = new Scanner(System.in);
    String word;

    System.out.print("Enter a word: ");
    word = input.nextLine();

    input.close();

    boolean isit = palindrome(word);
    if (isit) {
      System.out.println("Yes, " + word + " is a palindrome.");
    } else {
      System.out.println("No, " + word + " is not a palindrome.");
    }
  }
}