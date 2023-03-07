/*

1. Neil Dandekar

2. 11/06/2022

3. This program uses 6 different methods. It uses the main method, one method to convert the 
   operator to a string, one to convert each operand to string, one to evaluate the result, one to 
   print the list of possible operators to the user, and the start method that contains the other 
   method in order to run the program's functionality.

4. Grade: 100%

   Explanation: First, my program uses proper Java naming conventions (e.g. "firstSecondThird...").
   Second, it follows proper indentation, easy to follow and navigate, and organized. Third, 
   comments are provided for each method to describe what its function is and how it works. 
   
   Fourth, my program asks the user for various inputs for operands, the operator, and prints the 
   result as it should. Also, it contains all the methods specified by the directions and uses the 
   switch cases or the if/else statements when it's supposed to.

*/

import java.util.*;

class P10_ClimbDandekar {

}

class RockClimb {
  public static void main(String[] args) {
    Scanner avanti = new Scanner(System.in);
    Random avanti2 = new Random();
    execute(avanti2, avanti);
  }

  /* this method calls the other methods to run the program */
  public static void execute(Random rand, Scanner kb) {
    boolean repeat = true;
    description();
    while (repeat) {
      int height = input(kb);
      int slips = climb(height, rand);
      System.out.println(
          "While climbing up the mountain of height " + height + " step(s), you slipped " + slips + " time(s).");
      System.out.println("Would you like to play again? ");
      kb.nextLine();
      String again = kb.nextLine();
      if (again.equalsIgnoreCase("no")) {
        System.out.println("Goodbye!");
        repeat = false;
      }
    }
  }

  /*
   * this method asks the height of the mountain that a person will climb
   * Data validation must be done to ensure that the highet is a positive integer
   * while loop and do- while loop must be used
   */
  public static int input(Scanner kb) {
    int h = 0;
    do {
      System.out.print("What is the height of the mountain: ");
      while (!kb.hasNextInt()) {
        kb.nextLine();
        System.out.print("What is the height of the mountain: ");
      }
      h = kb.nextInt();
    } while (h < 0);
    return h;
  }

  /* refer to the document */
  public static int climb(int h, Random rand) {

    int distance = 0;
    int steps = 0;
    int slips = 0;
    do {
      int num = rand.nextInt(2);
      if (num == 1) {
        steps = rand.nextInt(11) + 20;
        distance += steps;
        System.out.println("You moved up " + steps + " step(s).");
      } else {
        steps = rand.nextInt(5) + 1;
        distance -= steps;
        System.out.println("You moved down " + steps + " step(s).");
        slips++;
      }
    } while (distance < h);
    return slips;
  }

  /*
   * Displays the information about the program such as the
   * number of steps moving up, number of the steps slipping:
   */
  public static void description() {
    System.out.println("*********************************************************");
    System.out.println("*                WELCOME TO THE CLIMB GAME              *");
    System.out.println("*   Climb to the top of the mountain to win! You will   *");
    System.out.println("*             Randomly climb up and slip down.          *");
    System.out.println("*********************************************************");
  }
}