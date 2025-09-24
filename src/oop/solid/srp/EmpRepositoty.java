package oop.solid.srp;

public class EmpRepositoty {

    //책임 2 : 직원의 정보를 db에 저장
    public  void  saveToDatabase(Employee e) {
        //데이터 베이스 연결로적
        //sql 쿼리 작성 로직
        //데이터 저장 실행 로직
        System.out.println(e.getName() +"직원의 정보를 db에 저장");
    }

}
