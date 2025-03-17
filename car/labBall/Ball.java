public class Ball{
   
   //fields
   private double size;
   
   //methods
   public double getSize(){
      return this.size;
   }
   
   public void setSize(double s){
      this.size = s;
   }
   
   public void roll(){
         System.out.println("rolling . . .");
   }
   
   public void bounce(int numberOfBounces){
      System.out.printf("bouncing %d times", numberOfBounces);
   }
}