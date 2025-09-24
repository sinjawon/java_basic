package oop.solid.srp;
//오직 직원의 정보를 담는 책임만 지자
//계산이나 저장은 다른 역할을 맡은 애들한테 맡기 자
//dto 도메인객체라고 부른다

public class Employee {
    private String name;
    private long baseSalary;

    public Employee(String name, long baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(long baseSalary) {
        this.baseSalary = baseSalary;
    }
}
