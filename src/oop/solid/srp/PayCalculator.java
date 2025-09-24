package oop.solid.srp;


//급여 관련 로직에만 집중한다
public class PayCalculator {

    //책임 1: 직원 월급 계산
    public long calculateSalary(Employee e) {
        //복잡한 급여 계산로직이 이다
        //세금 계산 ,보너스 계산 , 연차 -반차 체크
        return e.getBaseSalary();
    }
}
