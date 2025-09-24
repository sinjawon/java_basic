package oop.solid.opc;

public class VipDiscountPolicy implements DiscountPolicy {
    @Override
    public long getDiscountPrice(long price) {
        return price * 20/100;
    }
}
