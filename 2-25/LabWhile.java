import java.util.Scanner;
public class LabWhile{
   public static void main(String[] args){
      multiplyNumbers();
   }
   
   public static void multiplyNumbers(){
      Scanner input = new Scanner(System.in);
      int product = 1;
      System.out.print("0 to quit: ");
      int number = input.nextInt();
      input.nextLine();
      while(number != 0){
         product = product * number; // product *= number;
         System.out.print("0 to quit: ");
         number = input.nextInt();
      }
      System.out.println("product is " + product);
   }
}