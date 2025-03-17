public class BikeTest{
   public static void main(Strin g[] args){
      Bike myBike = new Bike();

      double x = myBike.go(11);
      
      System.out.printf("I am going at %.1f km/h",x);
      //I am going at 18.7 km/h
   }
}