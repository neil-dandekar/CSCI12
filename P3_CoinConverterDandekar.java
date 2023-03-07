/*

1. Neil Dandekar

2. 09/18/2022

3. This program uses 2 different methods. It uses one method to print the decription of 
   the program and the second method to calulate the number of each denomination needed 
   to represent the number of Yuan in USD.

4. Grade: 100%

   Explanation: First, my program uses proper Java naming conventions (e.g. "firstSecondThird...").
   Second, it follows proper indentation, easy to follow and navigate, and organized.
   Third, comments are provided for each method to decribe what its function is and 
   how it works. Fourth, my program compiles, runs, and correctly produces the word 
   TENNESSEE using the block letters created by multiple print statements in the 
   method calls. Fifth, the class and all methods are implemented correctly, and it 
   follows all requirements.

*/

public class P3_CoinConverterDandekar
{
   public static void main(String[] args)
   {
      description(); //Calls the description method that will explain the purpose of the program.
      convert(); //Calls the convert method that will calculate the US currency equivalent to the amount of Yuan entered.
   }
   public static void description()
   {
      System.out.println("//////////////////////////////////////");
      System.out.println("//    WELCOME TO COIN CONVERTER!    //");
      System.out.println("//  This program will convert your  //");
      System.out.println("// quantity of Yuan to US Currency. //");
      System.out.println("//////////////////////////////////////");
      System.out.println();
   }
   /*
    * Prints the description of the program. It explains that the coin converter
      will convert the amount of Yuan to USD currency.
    */
   public static void convert()
   {
      int yuan = 34567; //number of Yuan
      int pennies = (int)(yuan * 14); //conversion of Yuan to pennies
      int dollars = pennies/100; //conversion of pennies to dollars
      pennies = pennies%100; //removing number of dollars from total pennies
      int quarters = pennies/25; //conversion of pennies to quarters
      pennies = pennies%25; //removing number of quarters from total pennies
      int dimes = pennies/10; //converstion of pennies to dimes
      pennies = pennies%10; //removing number of dimes from total pennies
      int nickels = pennies/5; //converstion of pennies to dimes
      pennies = pennies%5; //number of pennies leftover

      System.out.println(yuan + "¥ is the same as "); //printing the results
      System.out.println(dollars+" dollars, "+quarters+" quarters, "+dimes+" dimes, "+nickels+" nickels, and "+pennies+" pennies.");
   }
}
