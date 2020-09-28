import java.util.Scanner;
 
public class ConstructionTester
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       //Creates all variables, initalizes several
       double lumberCost = 8.0;
       double windowCost = 11.0;
       double salesTax;
       int numBoards, numWindows;
       double total = 0.0, grandTotal = 0.0;
       //Accepts input from the user for the sales tax, number of Boards, and the nubmer of Windows
       System.out.println("Enter the sales tax rate: ");
       salesTax = in.nextDouble();
       System.out.println("Enter the number of boards");
       numBoards = in.nextInt();
       System.out.println("Enter the amount of windows");
       numWindows = in.nextInt();
       //Creates a construction object using the sales tax, cost of wood, and cost of windows.
       Construction construct = new Construction(lumberCost, windowCost, salesTax);
       //Finds the amount that the boards will cost, the amount that the window will costs, inputs it as total, then uses total multiplied by 1+salesTax to find GrandTotal.
       total += construct.lumberCost(numBoards);
       total += construct.windowCost(numWindows);
       grandTotal += construct.grandTotal(total);
 
       System.out.println(total);
       System.out.println(grandTotal);
   }
}
