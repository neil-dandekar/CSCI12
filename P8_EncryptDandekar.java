/*

1. Neil Dandekar

2. 10/23/2022

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

//Desription for each method is given in the text document

import java.util.*;

public class P8_EncryptDandekar
{
   //no code here
}  
class encryptOrDecryptMessage
{
   public static void main(String[] args) {
      runProgram();
   }
   
   //*************************************************************************************
   public static void runProgram( )
   {
      Scanner avanti = new Scanner(System.in);

      for(int i = 0; i < 20; i++) {
         printMenu();
         System.out.print("Enter a choice: ");
         String choice = avanti.nextLine();

         if(!(choice.equalsIgnoreCase("E") || choice.equalsIgnoreCase("D")))
         {
            System.out.println("Invalid Choice");
            continue;
         }

         System.out.print("\nEnter a message: ");
         String message = avanti.nextLine();

         System.out.print("\nEnter a key: ");
         int key = avanti.nextInt();
         //System.out.println(key);
         avanti.nextLine();

         if(key <= 0)
         {
            System.out.println("Invalid Key");
            continue;
         }

         message = message.toUpperCase();
         System.out.println("Message: " + message);
         String result = "";
         if(choice.equalsIgnoreCase("E")) {
            result = encryptMessage(message, key);
            System.out.println("\nHere is your encrypted message: " + result);
         }

         else if(choice.equalsIgnoreCase("D")) {
            result = decryptMessage(message, key);
            System.out.println("\nHere is your decrypted message: " + result);
         }
      }
      avanti.close();
   }
   
//*************************************************************************
	/*
	 * Returns a new string with the letters of the given string shifted
	 * forward or backward by the amount equal to the given key.
	 * For example, shift("hello", 3) returns "khoor".
	 */
   public static String encryptMessage(String s, int key)
   {
      String encryptedMessage = "";
      for(int i = 0; i < s.length(); i++) {
         char letter = s.charAt(i);
         if(letter == ' ') {
            letter = '#';
         }
         else {
            if(letter >= 65 && letter <= 90) {
               letter += key;
            }
            if(letter > 90) {
               letter -= 26;
            }
            if(letter < 65) {
               letter += 26;
            }
         }
         encryptedMessage += letter;
      }
      return encryptedMessage;
   }
   //*********************************************************************
   
   /*
	 * decrypts the encrypted string using the same key value. 
	 * For example, decrypt("khoor", 3) returns "hello".
	 */

   public static String decryptMessage(String s, int key)
   {
      String decryptedMessage = "";
      for(int i = 0; i < s.length(); i++) {
         char letter = s.charAt(i);
         if(letter == '#') letter = ' ';
         else {
            if(letter >= 65 && letter <= 90) {
               letter -= key;
            }
            if(letter < 65) {
               int diff = 'A' - letter;     
               letter = (char)('Z' - diff + 1);
            }
            if(letter > 90) {
               int diff = 'Z' - letter;
               letter= (char)('A' + diff + 1);
            }
         }
         decryptedMessage += letter;
      }
      return decryptedMessage;
   }
   
   //**********************************************************************
   
   /*This method displays a menu for the user to choose the option.
   refer to the provided output to see the menu*/
   public static void printMenu()
   {
      System.out.println("\n***************************************");
      System.out.println("Enter \"E\" or \"e\" to Encrypt your message\nEnter \"D\" or \"d\" to Decrypt your message");
      System.out.println("****************************************");
      System.out.println();
   }
   //**********************************************************************************

}