package oop.inter;

public class RobotOperator {
    public  void testRobot(Controllable robot) {
        System.out.println("RobotOperator testRobot");
        robot.turnOn();
        robot.moveBackward();
        robot.moveForward();
        robot.turnOff();
    }
    //전투기능 테스트
   public void testRobot2(Attackable robot) {
        System.out.println("RobotOperator testRobot2");
   }
   public void testRobot3(Controllable robot) {
        System.out.println("RobotOperator testRobot3");
   }


    public static void main(String[] args) {
      RobotOperator operator  =  new RobotOperator();
        operator.testRobot(new BattleBot());// 전투로봇
        operator.testRobot(new ChefBot());
        //나중에 청소 로봇이 추가된다 해도 testRobot 메서드 고칠 필욕 ㅏ없다

        operator.testRobot2(new BattleBot());
        operator.testRobot3(new ChefBot());



    }

}
