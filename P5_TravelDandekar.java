/*

1. Neil Dandekar

2. 10/02/2022

3. This program uses 2 different methods. It uses one method to print the description of 
   the program and the second method to calculate the number of liters are equivalent to
   the given quantity of gallons.

4. Grade: 100%

   Explanation: First, my program uses proper Java naming conventions (e.g. "firstSecondThird...").
   Second, it follows proper indentation, easy to follow and navigate, and organized. Third, comments 
   are provided for each method to describe what its function is and how it works. 
   
   Fourth, my program compiles, runs, and correctly produces the table of values that demonstrate the 
   unit conversions of various quantities of gallons ranging from 1-100, incrementing by 4. It also uses 
   a for loop to print a series of "/" characters in the first method and a for loop to print the table 
   in the second method. There is also a class constant declared in the beginning with the correct naming 
   convention.

*/

import java.util.*;
public class P5_TravelDandekar
{
  /* the complete main method is given do not make any changes*/ 
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      description();
      System.out.print("How many time do you want to use the app: ");
      int count = kb.nextInt();
      for(int j = 1; j <= count; j++)
      {   
         gasTravel(kb);
         for(int i = 1; i <= 30; i++)
            System.out.print("&");
         System.out.println();   
         electricTravel(kb);
         for(int i = 1; i <= 30; i++)
         System.out.print("&");
         System.out.println();
      } 
      System.out.println("GOOD BYE");   
   }

   /*This method calculates the total cost charging the battery. Stops represents the number of the charges*/
   public static double chargeCost(int stops, double pricePerCharge)
   {
      return stops*pricePerCharge;
   }
   
   /*This method calculates the total monet spend on the gas to travel */
   public static double gasCost(double distance, double milesPerGallon, double costPerGallon)
   {
      return (distance/milesPerGallon)*costPerGallon;
   }
   
   /*This method calculates the number of the stops needed to charge the battery.
    milePerCharge represents the number of the miles  driven with a fully charged battery*/ 
   public static int stops(double distance, double milesPerCharge)
   {
      return (int)(distance/milesPerCharge);
   }

   /*This method calculate the hours of travel taking your gas car*/
   public static double travelHoursGasCar(double distance , double speed)
   {
      return distance/speed;
   }
   
   /*
   This method calculates the hours traveling using your electric car. Stops represents the number of times the car 
   needs to be charged. hoursPerStop represents the time it takes to fully charge your car. Distance represents the 
   total distance traveled. Speed represents the speed of the car.
   */
   public static double travelHoursWithElectricCar(int stops, double hoursPerStop, double distance, double speed)
   {
      return stops*hoursPerStop + distance/speed;
   }
   
   /*This method calculates the cost and the time to travel with a gas car*/
   public static void gasTravel(Scanner kb)
   {
      System.out.println("\nTraveling with a gas car\n");
      
      //prompt user for miles of travel
      System.out.println("Enter the total number of the miles you are traveling: ");
      //declare variable and save user's input
      double distance = kb.nextDouble();

      //prompt user for speed
      System.out.println("Enter Speed: ");
      //declare variable and save user's input
      double speed = kb.nextDouble();

      //prompt user for mpg
      System.out.println("Enter Miles per Gallon: ");
      //declare variable and save user's input
      double milesPerGallon = kb.nextDouble();

      //prompt user for cost per gallon
      System.out.println("Enter Cost per Gallon: ");
      //declare variable and save user's input
      double costPerGallon = kb.nextDouble();
      
      //displaying hours of travel and cost of gas car
      System.out.println("\nTraveling with your gas car: ");
      System.out.println("Will take " 
      + String.valueOf(travelHoursGasCar(distance, speed)) 
      + " hours and will cost $" 
      + String.valueOf(gasCost(distance, milesPerGallon, costPerGallon)) 
      + ".");
   }
   public static void electricTravel(Scanner kb)
   {  
      System.out.println("\nTraveling with an electric car\n");

      //prompt user for miles of travel
      System.out.println("Enter the total number of the miles you are traveling: ");
      //declare variable and save user's input
      double distance = kb.nextDouble();

      //prompt user for speed
      System.out.println("Enter Speed: ");
      //declare variable and save user's input
      double speed = kb.nextDouble();

      //prompt user for miles on a full charge
      System.out.println("Enter Miles on a Full Charge: ");
      //declare variable and save user's input
      double milePerCharge = kb.nextDouble();

      //prompt user for hours to charge
      System.out.println("Enter Hours to Charge: ");
      //declare variable and save user's input
      double hoursPerStop = kb.nextDouble();

      //prompt user for cost per charge
      System.out.println("Enter Cost to Charge: ");
      //declare variable and save user's input
      double pricePerCharge = kb.nextDouble();
      
      //displaying hours of travel and cost of gas car
      System.out.println("\nTraveling with your electric car: ");
      System.out.println("Will take " 
         + String.valueOf(travelHoursWithElectricCar(stops(distance, milePerCharge), hoursPerStop, distance, speed))
         + " hours with "
         + String.valueOf(stops(distance, milePerCharge)) 
         + " stops and will cost $" 
         + String.valueOf(chargeCost(stops(distance, milePerCharge), pricePerCharge)) 
         + ".");
   }

/* feel free to change the code in this method*/
   public static void description()
   {
      for(int i = 1; i <= 80; i++)
         System.out.print("&");
         System.out.println();
         System.out.println("This program calculates the cost and the time to travel to your destination ");
         System.out.println(" given the needed information for both gas car and the electric car.");
         System.out.println("Just answer some simple questions"); 
      for(int i = 1; i <= 80; i++)
         System.out.print("&");
      System.out.println();
   }
}