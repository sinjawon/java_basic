package oop.solid.opc;

public class SilverDiscountPolicy implements DiscountPolicy {
    @Override
    public long getDiscountPrice(long price) {
        return price *5/100;
    }
}
