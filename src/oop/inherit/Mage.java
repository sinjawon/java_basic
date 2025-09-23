package oop.inherit;

public class Mage  extends Player{
     int mana;
     
     public Mage(String name,int mana){
         super(name);
         this.mana=mana;
     }

    @Override
    void characterInfo() {
        super.characterInfo();
        System.out.println("mana = " + mana);
    }
}
