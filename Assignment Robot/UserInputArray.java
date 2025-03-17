import java.util.Scanner;
public class UserInputArray{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int[] numList = new int[5];
      System.out.print("Enter 5 numbers: ");
      for(int i = 0; i < numList.length; i++){
         numList[i] = input.nextInt();
         input.nextLine();
      }
      
      int sum = 0; 
      
      for(int x : numList){
         System.out.print(x + " ");
         sum += x;//sum = sum + x;
      }    
      System.out.print("\n sum: " + sum);

   }
}