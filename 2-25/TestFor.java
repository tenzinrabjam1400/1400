public class TestFor{
   public static void main(String[] args){
      int x = 20;
      
      for(int i = 0; i <= x; i++){
         System.out.println(i*2);
      }
      
      for(int i = 0; i <= x; i+=2){
         System.out.println(i);
      }
      
      for(int i = -15; i <= 15; i+=3){
         System.out.println(i);
      }

      for(int i = 0; i < 11; i++){
         System.out.println((i*3) - 15);
      }
      
      //-50,-45,-40,-35,-30,-25,-20,-15,-10,-5,0,5,10,15,20,25
      for(int i = 0; i < 16; i++){
         System.out.println((i*5) - 50);
      }
      
      for(int i = -50; i <= 25; i+=5){
         //if(i % 5 == 0){
            Systme.out.println(i);
        // }
      }
      
      
   }
}