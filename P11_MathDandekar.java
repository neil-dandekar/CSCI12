/*

1. Neil Dandekar

2. 11/13/2022

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
public class P11_MathDandekar
{
  // no code here
}

class MathQuiz 	 
{
   public static void main(String[] args)
   {
      prep();
   }

   /* 
    * This method declares 3 arrays to hold questions, answers and the points for each question.
    * calls the method populate to fill in the three arrays with math questions, answers and points
    * follow thw given algorithm line by line to implemnet the code
    */
   public static void prep()
   {  
      System.out.println("*****************************************************");
      System.out.println("* There are 5 questions in this quiz.               *");
      System.out.println("* You get certain points if you answer it correctly *");
      System.out.println("* let's take the quiz                               *");
      System.out.println("*****************************************************");

      //1. declare an array of type string with the size 5 to hold the math questions
      String[] questions = new String[5];
      //2. declare an int array of size 5 to hold the answer in each math question
      int[] answers = new int[5];
      //3. declare an array of int with size 5 to hold the points for each question
      int[] points = new int[5];
      //4. create a random object
      Random rand = new Random();
      //5.create a Scanner object
      Scanner avanti = new Scanner(System.in);

      boolean repeat = true;
      while(repeat)
      {
         //6. generate a random number between 11 and 20
         int num1 = rand.nextInt(11) + 20;
         //7. generate a random number between 5 and 10
         int num2 = rand.nextInt(6) + 5;
         //8. call the method populate and pass the variables declared at steps 1,2,3,6,7
         populate(questions, answers, points, num1, num2);
         //9.call the method test and pass the variables declared at step 1,2,3 .
         // method test returns an it so make sure to store the result in a variable
         int totalScore = test(questions, answers, points);
         //10. display the result that you got at step 9. this is the score therefore display a message to the user
         System.out.println("\nYour total score was " + totalScore + ".");
         //11. ask the user if they want to play again and store it in a variable
         System.out.print("Do you want to play again? ");
         String again = avanti.nextLine();
         //12. if the user's answer equals to no (you need to use equals method from the string clas
         // then set the repeat to false
         if(again.equalsIgnoreCase("NO")) repeat = false;   
      }
      avanti.close();
   } 

   /*
    * This method generates math expressions randomly, the operations used are / + * % -
    * each math expression will be stored in the array called quiz, the correct answer for each expression will be stored
    * in the array answe, and the points for each question will be stored in the array points. 
    * max and min are used to generate a random number between min and max for each number.
    * Valid operations are stored in the array operation. a random number between 0 and 3 must be generated 
    * to pick a random operation and assign points for each question in the array values
    */
   public static void populate(String[] quiz, int[] answer,  int[] points, int max, int min)
   {
      char[] operation =  {'*', '/', '+','-'};  // valid operations
      //create a Random object
      Random rand = new Random();
      for(int i =  0; i < quiz.length; i++)
      {
         //1. generate a random number between min nad max and store it in a variable of type int 
         int num1 = rand.nextInt(max - min + 1) + min;
         //2. generate another random number between min and max and store it in a variable of type int 
         int num2 = rand.nextInt(max - min + 1) + min;
         //3. generate a randon number between 1 and 4 store it in a variable called index: this would be the index for the array operation to choose a random operation
         int index = rand.nextInt(4);
         //4. declare a variable of type char, and assign operation[index] to it
         char oper = operation[index];
         //5. build the expression using the randon munbers generated and the random operation created in step 4
         String expression = num1 + Character.toString(oper) + num2;
         //6. assign the string that you built in step 5 to quiz[i]
         quiz[i] = expression;
         //7. asnwers[i] = calculate(variable declared in step1, variable created at step 4, vaiable created at step 2)
         answer[i] = calculate(num1, oper, num2);
         //8. generate a random number between 1-10 and assign it to points[i]
         points[i] = rand.nextInt(11) + 1;
      }    	 
   }

   public static int calculate(int num1, char op, int num2)
   {
      switch(op)
      {
         case '*' : 
            return num1 * num2;
         case '/' : 
            return num1/num2;
         case '+' : 
            return num1 + num2;
         case '-' : 
            return num1 - num2;
         default :  
            return -1;
      }
   }

   /* 
    * This method gets the three arrays containg the questions, the correct answer 
    * for each question and the points for each question
    * this method displays one question at a time for the user to answer, verifies the user's answer
    * by comparint it to the proper index in the answers array
    * if the person's answer is correct then the correct poits will be added to the user's score
    * return the score at the end.
    */ 
   public static int test(String[] questions,  int[] answers, int[] values)
   {
      //1. declare an int variable to hold the score, set it to zero
      int score = 0;
      //2. create a Scanner object
      Scanner avanti = new Scanner(System.in);
      for(int  i = 0; i < answers.length; i++)
      {
         //3. display the question in the questions array at the index i
         System.out.print("\nWhat is " + questions[i] + "? ");
         //4. declare an int variable and to store the user's answer
         int answer = avanti.nextInt();
         //if the user's answer is equal to the answers[i]
         if(answer == answers[i])
         {
            //add the valuies[i] to the score, this is a cumulative sum: score = score + values[i]
            score += values[i];
            //display a message the points that the user gained answerin this question
            System.out.println("Correct! You scored " + values[i] + " points.");
         } 
         // else
         else
            //display a message indicating that the answer was wrong
            System.out.println("Incorrect!");
      }
      avanti.close();
      return score;
   }
} 
