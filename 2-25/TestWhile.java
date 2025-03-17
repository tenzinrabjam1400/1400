import java.util.Scanner;

public class TestWhile{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      // int x = 1;
//       int sum = 0;
//       int factorial = 1;
//       System.out.print("enter a number: ");
//       int number = input.nextInt();
//       input.nextLine();
//       
//       while(x <= number){
//          sum = sum + x; // sum += x;
//          factorial = factorial * x; // factorial *= x;
//          System.out.println(x);
//          x = x + 1; //x++ or x += 1;
//       }
//       System.out.println(sum);
//       System.out.println(factorial);
      
      // Create a string variable, create a loop checking if the string is "end" if not 
      // print "doing work..." and then read in the variable again
      System.out.print("enter a string: ");
      String x = input.nextLine();// = ""
      String end = "end";
      while(!x.equals(end)){
         System.out.println("doing work...");
         System.out.print("enter a string: ");
         x = input.nextLine();// = ""
      }
   }
}