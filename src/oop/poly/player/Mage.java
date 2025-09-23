package oop.poly.player;

import oop.static_.utils.PrintUtil;

public class Mage  extends Player {
     int mana;
     
     public Mage(String name){
         super(name);
         this.mana=100;
     }
    //가변인수적용
     public void blizzard (Player... targets){
         System.out.printf("%s님이 눈보라 시전!! \n",this.nickname);
         this.mana -= 30;
         System.out.printf("30의 마나가 소모됩니다 남은 정신력 : %d \n",this.mana);

         PrintUtil.printLine();

         for(Player target:targets){
            if(target == this) continue;
            //난수 0,0이상 1.0미만
             //만약 10에서 15사이면
             //곱할떄  더하기를 고려해서 해야한다
             //시작 앞자리가 무조건 0이라
             //그리고 리턴은 더블로 해준다
             int damage = (int) (Math.random()*6 + 10);//10~15 난수 발생
             target.hp -= damage;
             System.out.printf("%s님이 %d의 피해를 입었습니다. (남은 체력: %d)\n"
                     ,target.nickname,damage,target.hp);
         }
     }

    @Override
    void characterInfo() {
        super.characterInfo();
        System.out.println("mana = " + mana);
    }
}
