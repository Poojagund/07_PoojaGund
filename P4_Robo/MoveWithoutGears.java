/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movewithoutgears;
import ch.aplu.robotsim.*;

/**
 *
 * @author SUMIT
 */
public class MoveWithoutGears {
MoveWithoutGears()
  {
TurtleRobot robot=new TurtleRobot();
robot.forward(100);
robot.left(45);
robot.forward(200);
robot.right(90);
robot.backward(100);
robot.exit();
   }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MoveWithoutGears  m=new MoveWithoutGears();
    }
    
}
