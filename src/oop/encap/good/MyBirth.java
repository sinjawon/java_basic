package oop.encap.good;

public class MyBirth {
    //외부에서 변수에 직접 접근 할 수 없도록 필드에 private 제한을 붙임

    private int year;
    private int month;
    private int day;

    public void setYear(int year) {
        if (year < 1900 || year > 2025) {
            System.out.println("잘못된 연도 입니다");
            //리턴할게 없어 바로종료 함수 종료 메서드 종료!!!
            return;
        }
        this.year = year;


    }

    public int getYear() {
        return this.year;
    }


    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day < 1 || day> 31) {
            System.out.println("1부터 31 까지 해야지");
            return;
        }
        if (this.day == 0 ) {
            System.out.println("일자를 입력하기 위해서 월입력이 선행되어야 한다");
            return;
        }

    //    boolean flag = isValidateMonth(day);
       if (!isValidateMonth(day)) {
           System.out.println("일자가 월에 맞지 않습니다");
       }
        this.day = day;
    }

    //각 월에 맞는 일자가 세팅되어있는지 판별하는 메서드
    private boolean isValidateMonth(int day){
         switch (this.month) {
             case 2:
                 if(day > 28 ) return false;
             case 4,6,9,11:
                 if(day > 31 ) return false;
             default:
                 return true;
         }
    }


    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month < 1 || month > 12) {
            System.out.println("잘못된 월이다 1부터 12이어야지");
            return;
        }
        this.month = month;
    }


    void birthInfo() {
        if(this.year == 0 || month == 0 || this.day == 0) {
            System.out.println("초기화되지 않는값이 있어");
        }
        System.out.printf("내 생일은 %d년 %d월 %d일 입니다."
                , this.year, this.month, this.day);
    }
}
