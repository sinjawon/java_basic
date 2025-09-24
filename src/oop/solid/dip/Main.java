package oop.solid.dip;

public class Main {
    public static void main(String[] args) {
       Car car = new Car(
               new HanKookTire(),new HanKookTire(),new MichelinTire(),new MichelinTire()
       );

    }
}
