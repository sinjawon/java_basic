package oop.poly.player;

public class Player {
    String nickname;
    int level;
    int hp;

    public Player() {
        System.out.println("기본 생성자 호출!");
        level = 1;
        hp = 50;
    }



    public Player(String nickname) {

        this();//이게뭘까 같은 클래스 내에 다른 생성자 호출
        //이건 매개값이 없는 this가 가장먼저 된다
        System.out.println("2번생성자");

        this.nickname = nickname;

    }
    //이건 닉네임전달
    public Player(String nickname, int hp) {
        this(nickname);
        System.out.println("3번 생성자");
        this.hp = hp
        ;
    }

    //일반 메서드

    void attack(Player target){
         if(target == this){
             System.out.println("타겠이 잘못되었습니다");
             return;
         }
        System.out.printf("%s님이 %s님을 공격합니다!\n"
                         ,this.nickname,target.nickname);
         //맞는 player의 체력을 10 감소시키고 , 때리는 player의 체력은 3 감소시키자
        target.hp -= 10;
        this.hp -= 3;

        System.out.printf("%s님의 남은 체력: %d\n",this.nickname,this.hp);
        System.out.printf("%s님의 남은 체력: %d\n",target.nickname,target.hp);

    }

    void  characterInfo(){
        System.out.println("***캐릭터의 정보***");
        System.out.println("nickname = " + nickname);
        System.out.println("level = " + level);
        System.out.println("hp = " + hp);
    }


}
