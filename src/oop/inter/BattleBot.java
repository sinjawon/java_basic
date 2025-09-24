package oop.inter;

public class BattleBot implements Controllable , Attackable  {
    
    
    //전투 로봇은 controag규칙따르겠다
    @Override
    public void attck() {
        System.out.println("레이저포 발사");
    }

    @Override
    public void turnOn() {
        System.out.println("BattleBot turned on 눈에서 붉은빛이 번쩍인다" );
    }

    @Override
    public void turnOff() {
        System.out.println("BattleBot turned off");
    }

    @Override
    public void moveForward() {
        System.out.println("전투로봇이 식씪하게 앞으로 전진한다");
    }

    @Override
    public void moveBackward() {
        System.out.println("전투로봇이 뒤로 물러납니다");
    }
}
