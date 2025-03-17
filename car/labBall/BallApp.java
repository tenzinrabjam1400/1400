public class BallApp{
   public static void main(String[] args){
      Ball myBall = new Ball();
      myBall.setSize(5);
      
      System.out.printf("Ball with size %.0f", myBall.getSize());
      System.out.println();
      myBall.roll();
      
      myBall.bounce(14);
      myBall.setSize(7);
      System.out.printf("\nBall with size %.0f", myBall.getSize());
   }  
}