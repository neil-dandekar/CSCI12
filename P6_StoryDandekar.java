/*

1. Neil Dandekar

2. 10/09/2022

3. This program uses 2 different methods. It uses one method to print the description of 
   the program and the second method to calculate the number of liters are equivalent to
   the given quantity of gallons.

4. Grade: 100%

   Explanation: First, my program uses proper Java naming conventions (e.g. "firstSecondThird...").
   Second, it follows proper indentation, easy to follow and navigate, and organized. Third, comments 
   are provided for each method to describe what its function is and how it works. 
   
   Fourth, my program asks the user for various inputs and prints the story as intended while using one method from the Math class and one from the String class.

*/

import java.util.*;
public class P6_StoryDandekar
{

}
class MyStory
{
  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);
    System.out.print("How many stories are you making: ");
    int count = kb.nextInt();
    kb.nextLine();
    for(int i = 1; i <= count ; i++)
    {
      System.out.println("Answer a few questions and I will make up a story for you\n");
      printStory(kb);
    }

  }
  /* create a method with a name of your choice. The name of the method must be meaningful.
  this method accepts a Scanner object as its parameter
  do the followings in this method: 
        declare variables to hold the user's answers to the questions
        ask the required questions
        create the story
        display the story*/
  public static void printStory(Scanner kb) {

    //Question 1
    System.out.print("Enter name of a city: ");
    String location = kb.nextLine();
    //Question 2
    System.out.print("\nEnter name of another city: ");
    String destination = kb.nextLine();
    //Question 3
    System.out.print("\nEnter an integer: ");
    int familyNumber = kb.nextInt();
    kb.nextLine();
    //Question 4
    System.out.print("\nEnter name of restaurant: ");
    String restaurantName = kb.nextLine();
    restaurantName = restaurantName.toUpperCase();
    //Question 6
    System.out.print("\nEnter type of family member (e.g. brother, mother, uncle, etc.): ");
    String familyMember = kb.nextLine();
    //Question 7
    System.out.print("\nEnter name of dessert: ");
    String dessert = kb.nextLine();
    //Question 8
    System.out.print("\nEnter name: ");
    String familyMemberName = kb.nextLine();
    //Question 9
    System.out.print("\nEnter name of destination: ");
    String destination2 = kb.nextLine();
    //Question 10
    System.out.print("\nEnter fruit: ");
    String fruit = kb.nextLine();
    //Question 11
    System.out.print("\nEnter a price (as a decimal): ");
    double price = kb.nextDouble();
    int snackNumber = Math.multiplyExact(familyNumber, 2);

    //Printing the story
    System.out.print(
    "Sunny weekends in " + location + 
    " were always my favorite. They were the days that marked the beginnings of my culinary journey. No matter what was going on, me and my family of " + familyNumber + 
    " people would head over to the local " + destination + 
    ". We'd always pack lots of snacks to ensure that no one had the urge to buy food from the only fast food place we had in town, " + restaurantName + 
    ". Since our family had " + familyNumber + 
    " people, we'd have to pack at least 2 snacks for each, making our grand total " + snackNumber + 
    " snacks. My " + familyMember + 
    " makes a mean cook though, so having plenty of food on hand was never a problem. Their desserts were always the first to disappear at family reunions, so you just know they had to be good. Personally, I didn't love " + dessert + 
    ", but seeing the love and care " + familyMemberName + 
    " put into it was always enough to make me try it. It was from these trips to our local " + destination2 + 
    " that I began to find interest in the various aspects of the culinary world. My " + familyMember + 
    " would take me to the grocery store and I distinctly remember being shocked by the price of a dozen " + fruit + 
    ". I mean how could " + fruit + 
    " be " + price + 
    "!"
    );
  }
}