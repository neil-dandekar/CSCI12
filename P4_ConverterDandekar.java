/*

1. Neil Dandekar

2. 09/25/2022

3. This program uses 2 different methods. It uses one method to print the decription of 
   the program and the second method to calulate the number of liters are equivalent to
   the given quantity of gallons.

4. Grade: 100%

   Explanation: First, my program uses proper Java naming conventions (e.g. "firstSecondThird...").
   Second, it follows proper indentation, easy to follow and navigate, and organized. Third, comments 
   are provided for each method to decribe what its function is and how it works. Fourth, my program 
   compiles, runs, and correctly produces the table of values that demonstrate the unit conversions 
   of various quanities of gallons ranging from 1-100, incrementing by 4. It also uses a for loop to 
   print a series of "/" characters in the first method and a for loop to print the table in the second
   method. There is also a class constant declared in the beginning with the correct naming convention.

*/

public class P4_ConverterDandekar
{
  //Declaration of the class constant variable. 
  public static final double GALLON_TO_LITER = 3.7;

   public static void main (String[] args)
   {
    printDescription();
    convertGallonToConverter();
   }

   /* 
    * The method, printDescription(), prints the description of the program. 
    * It explains that the converter will convert the amount of gallons to liters.
   */
   public static void printDescription()
   {
      for(int i = 0; i < 49; i++) {
        System.out.print("/");
      }

      System.out.println();
      System.out.println("//    WELCOME TO GALLON TO LITER CONVERTER!    //");
      System.out.println("//   This program will convert your quantity   //");
      System.out.println("// gallons to liters. (1 gallon ~ 3.7 liters)  //");

      for(int i = 0; i < 49; i++) {
        System.out.print("/");
      }
   } 

   /*
    * The method, convertGallonToConverter(), converts the quantity of gallons
    * to liters using the constant value, GALLON_TO_LITER, as the ratio. Then,
    * it prints the result in the form of a table.
   */
   public static void convertGallonToConverter()
   {
      double liters;
      System.out.println("\n\nGALLONS\t\t\tLITERS");
      for(int i = 1; i <= 100; i+=4) {
        liters = i * GALLON_TO_LITER;
        System.out.println(i+"\t\t\t"+liters);
      }
   }
}