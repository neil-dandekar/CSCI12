/*

1. Neil Dandekar

2. 10/16/2022

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

import java.util.Scanner;
public class P7_MathDandekar
{
   //no code goes here
}
class Expression
{
   public static void main(String[] args)
   {
      start();
   }

   /* 
    * This must be the last method to implement. After you have implemented all the methods
    */
   public static void start()
   {
      Scanner avanti = new Scanner(System.in);
      System.out.print("How many times do you want to use the software: ");
      int count = avanti.nextInt();
      avanti.nextLine();
      for(int i = 1; i <= count; i++)
      {
         list();
         System.out.print("\nWhich operator do you want to use? ");
         String operator = avanti.nextLine();
         System.out.print("\nWhat is the first operand? ");
         int operand1 = avanti.nextInt();
         System.out.print("\nWhat is the second operand? ");
         int operand2 = avanti.nextInt();

         System.out.println("\nResult:\n" + Integer.toString(operand1) + " " + operator + " " + Integer.toString(operand2) + " = " + evaluate(operand1, operand2, operator));
         System.out.println(convertNumToWord(operand1) + " " + convertOpToWords(operator) + " " + convertNumToWord(operand2) + " is " + evaluate(operand1, operand2, operator));
      }
      avanti.close();
   }

   /*
    * This method get the operation and returns the name of the operation in words. 
    * For example if the operation is *, it should return multiply. Must use switch cases.
    */
   public static String convertOpToWords(String operator)
   {
      switch(operator) {
         case "+": return "added to";
         case "-": return "subtracted from";
         case "*": return "multiplied by";
         case "/": return "divided by";
         case "^": return "raised to";
         case "%": return "modulo";
         default: return "";
      }
   }
   
   /* 
    * This method gets a number 1-9 and returns it in  words. For example if the num 
    * is 1 it should return "one". Must use if/else statements in this method.
   */
   public static String convertNumToWord(int a)
   {
      if (a == 1) {
         return "one";
      }
      else if (a == 2) {
         return "two";
      }
      else if (a == 3) {
         return "three";
      }
      else if (a == 4) {
         return "four";
      }
      else if (a == 5) {
         return "five";
      }
      else if (a == 6) {
         return "six";
      }
      else if (a == 7) {
         return "seven";
      }
      else if (a == 8) {
         return "eight";
      }
      else if (a == 9) {
         return "nine";
      }
      else if (a == 0) {
         return "zero";
      }
      return "";
   }

   /*
    * This method gets two numbers and the operation and returns the result of the 
    * expression. For example if this method gets 3, 2 and *, then the method should 
    * return 6. Must use switch cases.  
   */
   public static int evaluate(int a, int b, String op)
   {
      switch(op) {
         case "+": return a+b;
         case "-": return a-b;
         case "*": return a*b;
         case "/": return a/b;
         case "^": return (int) Math.pow(a, b);
         case "%": return a%b;
         default: return 0;
      }    
   }

   /*
    * This method list all the operations that the user can choose from. You must 
    * create your own menu and  not to use the menu that I provided in the sample 
    * output be creative and provide a user friendly menu. Providing the exact same 
    * menu as the sample output, will not get credit.
   */
   public static void list()
   {
      System.out.println("\nHello! Welcome to the Mathematics Application!\nBelow are the possible operators:\nFor Addition, enter \"+\"\nFor Subtraction, enter \"-\"\nFor Multiplication, enter \"*\"\nFor Division, enter \"/\"\nFor Exponentiation, enter \"^\"\nFor Modulus, enter \"%\"");
   }
}