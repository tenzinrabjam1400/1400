/*********************************************************
 * RobotApp solves three challenges where a robot needs 
 * to figure out the number of rooms in a given grid.
 *
 * Important: 
 * The code still needs to work when you change
 * the grid dimensions.
 * 
 * Author: CS Starter Code + [your name]
 ********************************************************/

public class RobotApp {
	public static void main(String[] args) { 
      // square 4x4 grid to demo how the robot can be controlled
      Robot robot = new Robot(4, 4, 3, 0); 
      //  demo(robot);    
      
      // square nxn grid with the robot in the south-west corner
      int n = 5;
      Robot robot1 = new Robot(n, n, 0, n-1);        
      challenge1(robot1);    
      
      // rectangular grid with width w and height h
      // robot in the south-west corner
      int w1 = 5;
      int h1 = 7;
      Robot robot2 = new Robot(w1, h1, 0, h1-1);  
      challenge2(robot2);
      
      // square nxn grid; 
      int n2 = 6;
      Robot robot3 = new Robot(n2, n2, 3, 1);   
      challenge3(robot3);      
      
      // rectangular grid with width w and height h
      // robot's starting position: 4 over, 2 down 
      int w2 = 8;
      int h2 = 4;
      Robot robot4 = new Robot(w2, h2, 4, 2);   
      challenge4(robot4);
	}
     
   private static void challenge1(Robot robot) {      
      // TODO: Solve challenge 1 and update the text below
     int area = 0;
     int side = 1;
     while(robot.check('n') == true){
        robot.go('n');
        side++;
     }
     area = side * side;
      robot.say(area + " rooms {expression of " + side + "} moves");		
   }
   
   private static void challenge2(Robot robot) {      
     int area = 0;
     int width = 1;
     int height = 1;
     while(robot.check('n') == true){
        robot.go('n');
        height++;
     }
     
      while(robot.check('e') == true){
        robot.go('e');
        width++;
     }
     area = height * width;
     int steps = height + width;
     robot.say(area + " rooms {expression of " + steps + "} moves");	   }
   
   private static void challenge3(Robot robot) {   
      // TODO: Solve challenge 3 and update text below
   
      robot.say(3 + " rooms {expression of n} moves");   
   }
      
   private static void challenge4(Robot robot) {   
      // TODO: Solve challenge 4 and update text below
   
      robot.say(3 + " rooms {expression of w and h} moves");   
   }
   
   // This method briefly demonstrates how the robot can be controlled.
   // Note that the message is not correct and needs to be fixed.
   private static void demo(Robot robot) {
		int count = 10;
		robot.go('S');
        robot.go('W');
		if (robot.check('N')) {
			robot.go('N');
			count++;
		}
		robot.go('E');
      // robot.go('E'); // uncomment this line and see what happens
      
		robot.say( count + " rooms 2n + 5 moves");	// incorrect message
   }
}
