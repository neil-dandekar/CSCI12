/*

1. Neil Dandekar

2. 09/11/2022

3. This program uses 5 different methods. 4 methods are used each to print lines of strings 
   that resemble the letters T, E, N, and S. The main method then calls these other methods 
   in a specific order to spell out the word TENNESSEE.

4. Grade: 100%

   Explanation: First, my program uses proper Java naming conventions (e.g. "firstSecondThird...").
   Second, it follows proper indentation, easy to follow and navigate, and organized.
   Third, comments are provided for each method to decribe what its function is and 
   how it works. Fourth, my program compiles, runs, and correctly produces the word 
   TENNESSEE using the block letters created by multiple print statements in the 
   method calls. Fifth, the class and all methods are implemented correctly, and it 
   follows all requirements.

*/

public class P1_TennesseeDandekar
{
  public static void main(String[] args)
  {
    printDoubleT();
    printDoubleE();
    printDoubleN();
    printDoubleN();
    printDoubleE();
    printDoubleS();
    printDoubleS();
    printDoubleE();
    printDoubleE();
  }
  /* 
  The main method calls each of the following methods to produce the word TENNESSEE. It calls 
  each one in the order of the spelling of the word based on what letter the method will print.
  */

  public static void printDoubleT()
  {
    System.out.println("TTTTTTTTTTTT     TTTTTTTTTTTT");
    System.out.println("     TT               TT     ");
    System.out.println("     TT               TT     ");
    System.out.println("     TT               TT     ");
    System.out.println("     TT               TT     ");
    System.out.println();
  }
  /* 
  The printDoubleT method uses 5 lines of println statements consisting of 
  strings of spaces and the letter T to resemble the letter T itself. At the 
  end, there is an empty println statement to skip a line for the next letter.
  */

  public static void printDoubleE()
  {
    System.out.println("EEEEEEEEEEE      EEEEEEEEEEE");
    System.out.println("EE               EE          ");
    System.out.println("EEEEEE           EEEEEE      ");
    System.out.println("EE               EE          ");
    System.out.println("EEEEEEEEEEE      EEEEEEEEEEE");
    System.out.println();
  }
  /* 
  The printDoubleE method uses 5 lines of println statements consisting of 
  strings of spaces and the letter E to resemble the letter E itself. At the 
  end, there is an empty println statement to skip a line for the next letter.
  */

  public static void printDoubleN()
  {
    System.out.println("NN       NN      NN       NN");
    System.out.println("NN NN    NN      NN NN    NN");
    System.out.println("NN   NN  NN      NN   NN  NN");
    System.out.println("NN    NN NN      NN    NN NN");
    System.out.println("NN       NN      NN       NN");
    System.out.println();
  }
  /* 
  The printDoubleN method uses 5 lines of println statements consisting of 
  strings of spaces and the letter N to resemble the letter N itself. At the 
  end, there is an empty println statement to skip a line for the next letter.
  */

  public static void printDoubleS()
  {
    System.out.println(" SSSSSSSS         SSSSSSSS  ");
    System.out.println("SS               SS         ");
    System.out.println(" SSSSSSS          SSSSSSS   ");
    System.out.println("       SS               SS  ");
    System.out.println("SSSSSSSS         SSSSSSSS   ");
    System.out.println();
  }
  /* 
  The printDoubleS method uses 5 lines of println statements consisting of 
  strings of spaces and the letter S to resemble the letter S itself. At the 
  end, there is an empty println statement to skip a line for the next letter.
  */
}