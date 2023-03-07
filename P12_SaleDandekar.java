/*

1. Neil Dandekar

2. 11/12/2022

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

public class P12_SaleDandekar {

}

class SaleRep {
   private double commissionRate;
   private double startingSalary;
   private String fullName;
   private double sales;

   // Constructor
   public SaleRep(double commissionRate, double salary, String fullName) {
      this.commissionRate = commissionRate;
      this.startingSalary = salary;
      this.fullName = fullName;
      sales = 0;
   }

   // Getter Methods
   public double getCommissionRate() {
      return this.commissionRate;
   }

   public double getStartingSalary() {
      return this.startingSalary;
   }

   public String getFullName() {
      return this.fullName;
   }

   public double getSales() {
      return this.sales;
   }

   // Setter Methods
   public void setCommissionRate(double newCommissionRate) {
      this.commissionRate = newCommissionRate;
   }

   public void setStartingSalary(double newStartingSalary) {
      this.startingSalary = newStartingSalary;
   }

   public void setFullName(String newFullName) {
      this.fullName = newFullName;
   }

   public void setSales(double newSales) {
      this.sales = newSales;
   }

       
   // Calculate the total monthly pay by calculating the commission that the person recived.
   public double paycheck() {
      return getCommission() + startingSalary;
   }

   // Calculates the commission.
   public double getCommission() {
     return sales * commissionRate / 100;
   }

   // Called every time the employee has a new sale
   public void addSale(double newSale) {
      this.sales += newSale;
   }

   // Reducing the sale
   public void returnItem(double amountReturned) {
      this.sales -= amountReturned;
   }

   public void getRaise(double raiseRate) {
      startingSalary *= 1 + raiseRate / 100;
   }

   public String toString() {
      String s = "";
      s += "Full name: "            + fullName;
      s += " | Starting salary: "   + startingSalary;
      s += "\nCommission rate: "    + commissionRate;
      s += " | Sales amount: "      + sales;
      s += " | Paycheck: "           + paycheck();
      s += "\n\nThe commission you made: " + getCommission();
      s += "\n\nTotal paid this month: "   + paycheck();
      return s;
   }
}

class MyDriver {
   public static void main(String[] args)
   {
      // String first, String last, double baseSalary, double commission)
      // creating objecs of Employee
      //( double salary, double comissionRate, String fullname)
      SaleRep e1 = new SaleRep(1000,6,"Jose Rodriguez");
      
      //sales for employee e1: Jose
      e1.addSale(5000);
      e1.addSale(3000);
      e1.addSale(1200);

      //an item is returned thefore the sale amount must be adjusted
      e1.returnItem(5000);

      //another item is sold by  
      e1.addSale(345);
      System.out.println(e1);

      //get a raise
      e1.getRaise(5);
    
      //displaying the result after the raise
      System.out.println(e1.toString());
      System.out.println("-------------------------------------------------------------------------");
    
      //Sale rep #2

      SaleRep e2 = new SaleRep(1800,12,"Maria Chavez");
      
      //adding sale
      e2.addSale(1234);
      e2.addSale(7645);
      e2.addSale(3456);

      //an item is returned thefore the sale amount must be adjusted
      e2.returnItem(5000);

      //another item is sold 
      e2.addSale(345);
      System.out.println(e2.toString());

      //got a raise
      e2.getRaise(8);

      //displaying the info after the raise
      System.out.println(e2);
      System.out.println("---------------------------------------------------------------------------");
   }
}

// Create 2 Objects of employee of your choice
// Create similar code given in the MyDriver class for each of the objects
// This driver has 15 points 
// Do not copy and paste the provided driver since it does not help you to learn
class yourDriver {
   public static void main(String[] args)
   {
      System.out.println("----------------------------------------------------------------\n");
      // Create the first object.
      SaleRep employee1 = new SaleRep(10.0, 10000.0, "John Doe");

      // Call the proper methods similar to the given code in the MyDriver class.
      
      // Before:
      System.out.println("BEFORE:" + "\n" + employee1);

      // Sales:
      employee1.addSale(1000);
      employee1.addSale(2500);
      employee1.addSale(5000);

      // Returns:
      employee1.returnItem(2000);

      // Another Sale:
      employee1.addSale(1500);

      // Raise:
      employee1.getRaise(10);

      // After:
      System.out.println("\n\nAFTER:" + "\n" + employee1);

      System.out.println("\n----------------------------------------------------------------\n");

      // Create the second object
      SaleRep employee2 = new SaleRep(20.0, 25000.0, "Jane Doe");

      // Call the methods in the code similar to the driver above.
      
      // Before:
      System.out.println("BEFORE:" + "\n" + employee2);

      // Sales:
      employee2.addSale(3500);
      employee2.addSale(90210);

      // Raise:
      employee2.getRaise(15);

      // Returns:
      employee2.returnItem(16 * 29);

      // Another Sale:
      employee2.addSale(913);

      // After:
      System.out.println("\n\nAFTER:" + "\n" + employee2);

      System.out.println("\n----------------------------------------------------------------");
   }
}