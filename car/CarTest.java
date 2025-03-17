public class CarTest{
   public static void main(String[] args){
      Car myCar1 = new Car();
      myCar1.displayInfo();
      
      System.out.println();
      
      Car myCar2 = new Car("Lexus", 2014);
      myCar2.displayInfo();
      
   }
}