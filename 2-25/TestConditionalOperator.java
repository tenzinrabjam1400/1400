public class TestConditionalOperator{
   public static void main(String[] args){
      double age = 45;
      if(age > 16){
         if(age < 65){  
            if(age == 50){ 
               System.out.println("you can do work");
            }
         }
      }
      
      if(age > 16 && age < 65 && age == 50){
         System.out.println("you can do work");
      }
      
      String y = "legit";
      if (y == "legit"){
         System.out.println("you are legit");
      }
      
      if(age == 21){
         System.out.println("you are legit");
      }
      
      if(!y.equals("legit") || age != 21){
         System.out.println("you are legit");
      }
      
   }
}