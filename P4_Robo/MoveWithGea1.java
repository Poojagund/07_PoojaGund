/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movewithgea1;
import ch.aplu.robotsim.*;
/**
 *
 * @author SUMIT
 */
 class MoveWithGea1 {
MoveWithGea1()
        {
NxtRobot robot=new NxtRobot();
    Gear gear=new Gear();
robot.addPart(gear);	

gear.forward(400);
gear.setSpeed(30);

gear.left(800);
gear.forward(200);
gear.right(480);
robot.exit();
  }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MoveWithGea1  m=new MoveWithGea1();
    }
    
}
