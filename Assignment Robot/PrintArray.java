public class PrintArray{
   public static void main(String[] args){
      int[] numList = {10,20,30,40,50};
      
      for(int i = 0; i < numList.length; i++){
         System.out.print(numList[i] + " ");
      }
      System.out.println();
      for(int x : numList){
         System.out.print(x + " ");
      }
   }
}