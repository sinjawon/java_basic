package oop.solid.opc;

public class DiscountCalculator {

    public long calculateDiscount(DiscountPolicy policy, long price) {


        return policy.getDiscountPrice(price);
    }
}
