public class Home{

   //fields
   private int door;

   private int window;
   
   private String roofStatus;
   
   //methods
      
   /**
   * Set Door
   **/
   public void setDoor(int door){
      this.door = door;
   }
   
   /**
   * Get Door
   **/
   public int getDoor(){
      return this.door;
   }
   
   public void setWindow(int window){
      this.window = window;
   }
   public int getWindow(){
      return this.window;
   }
   public void setRoofStatus(String roofStatus){
      this.roofStatus = roofStatus;
   }
   public String getRoofStatus(){
      return this.roofStatus;
   }

}