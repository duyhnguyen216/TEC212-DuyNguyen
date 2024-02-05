import java.util.Scanner;
public class AddingRecursively2
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int x, y;
      int result;
      String userInput;
      System.out.print("Enter a number >> ");
      userInput = input.nextLine();
      x = Integer.parseInt(userInput);
      System.out.print("Enter another number that is larger >> ");
      userInput = input.nextLine();
      y = Integer.parseInt(userInput);
      while(y < x)
      {
         System.out.print("Second number must be larger >> ");
         userInput = input.nextLine();
         y = Integer.parseInt(userInput);
      }
      result = sum(x, y);
      System.out.println("The sum of all the numbers between ");
      System.out.println("     " + x + " and " + y + " is " + result);
   }
   public static int sum(int start, int end)
   {
      System.out.println("Duy");
      if(end > start) 
         return(end + sum(start, end - 1));
      else
         return end;
   }
}