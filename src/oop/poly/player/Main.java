package oop.poly.player;

import oop.static_.utils.PrintUtil;

public class Main {
    public static void main(String[] args) {
        Warrior w1 = new Warrior("전사1");
        Warrior w2 = new Warrior("전사2");
        Mage m1 = new Mage("법사1");
        Mage m2 = new Mage("법사2");
        Hunter h1 =new Hunter("냥꾼1","멍멍이");
        Hunter h2 =new Hunter("냥꾼2","야옹이");
         w1.characterInfo();

      //   Player[] players = {w1,w2,h1,h2,m2};
     //    m1.blizzard(new Player[]{w1,w2,h1,h2,m2});
        m1.blizzard(w1,w2,h1,h2,m2);
        PrintUtil.printLine();
        h1.magicArrow(w1,w2,m1,m2,h2);
    }
}
