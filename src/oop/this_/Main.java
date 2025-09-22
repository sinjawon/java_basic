package oop.this_;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("플레이어1",200);
        p1.characterInfo();
        System.out.println("p1 = " + p1);

        System.out.println("=================");
        Player p3 = new Player("플3",200);
       p3.characterInfo();

    }

}
