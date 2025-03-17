import java.util.Random;

public class RandomApp{
   public static void main(String[] args){
      Random rand = new Random();
      
      int x = rand.nextInt(4) * 10 - 10; //{-10,0,10,20}
      System.out.println(x);
   }
}