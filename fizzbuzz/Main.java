package fizzbuzz;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Initialize Scanner, get user input
    Scanner input = new Scanner(System.in);
    System.out.println("How high? ");
    int endpoint = input.nextInt();
    input.close();

    // perform the fizzbuzz operation
    for (int i = 1; i <= endpoint; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }
    }
  }
}