package oop.poly.player;


import java.sql.SQLOutput;

public class Hunter extends Player {
    String pet;
    
    public Hunter(String nickname, String pet) {
        super(nickname);
        this.pet = pet;
        
    }

            /*
                사냥꾼의 고유 기술인 magicArrow()를 완성해 주세요.
                타겟은 단일 타겟이고, 어떤 직업이든 매직 **우를 맞출 수 있습니다.

                각 직업별로 데미지가 다르게 들어갑니다.
                전사는 10, 마법사는 20, 사냥꾼은 15
                타겟의 직업이 무엇이냐에 따라 각각 다른 데미지를 적용해 주세요.
                %s가 %d의 피해를 입었고, 남은 체력은 얼마다 라는 정보도 출력해 주시고
                Main 클래스에서 메서드를 호출해 보세요.
                 */

    public void magicArrow(Player... player) {
        System.out.printf("%s님이 메직에로우시전 타겟 %d명\n",this.nickname,player.length);
        for (Player p : player) {
            if (p instanceof Warrior) {
                System.out.printf("%s가 10의 피해를 입었고 남은 체력은%d다.\n",p.nickname,p.hp-10);
            } else if (p instanceof Mage) {
                System.out.printf("%s가 20의 피해를 입었고 남은 체력은%d다.\n",p.nickname,p.hp-20);
            }else if (p instanceof Hunter) {
                System.out.printf("%s가 15의 피해를 입었고 남은 체력은%d다.\n",p.nickname,p.hp-15);
            }
        }
    }

    @Override
    void characterInfo() {
        super.characterInfo();
        System.out.println("pet = " + pet);
    }
}
