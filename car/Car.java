public class Car {
    private String make;
    private int year;

    public Car() {
        make = "honda";
        year = 2000;
    }

    // Parameterized constructor
    public Car(String make, int year) {
      this.make = make;
      this.year = year;
    }
     
   

    public void displayInfo() {
        System.out.println("Car Make: " + this.make);
        System.out.println("Car Year: " + this.year);
    }
}