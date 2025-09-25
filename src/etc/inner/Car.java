package etc.inner;

public class Car {

    private int fuel;

    private  static int estblishedYear =1985;

    public Car(int fuel) {
        this.fuel = fuel;
    }

    //주유기능
    public  void refuel(int amount) {
        this.fuel += amount;
        System.out.println("주유 후 현재 연료" + fuel);
    }


    //이러면 이점이 뭐냐
    //1.인스턴스 내부 클래스
    //바깥클래스가 가지고 있는 변수 얼마든지 메서드 얼마든지 사용가능하다

    public  class  Engine{
            public  void Start(){
                System.out.println(">>엔진켠다. (인스턴스 내부 클래스)");
                //바깥쪽 클래스의 private 필드에 자유롭게 접근 가능
                if(fuel > 0){
                    System.out.println("시동이 걸렸다");
                    fuel -= 5;
                }else {
                    System.out.println("연료가 부족하다.시동 실패");
                }
            }


    }
    //정적 내부 클래스 (static inner class)
    //car가 가지고 있는 fuel 을 자유롭게 사용 가능했다
    //car와 논리적인 관련은 있지만 ,특정 car 객체에 종속되지 않는 독립적인 정보 묶음.
    //
    public static   class  TireSpec{
        public  void printInfo(){
            System.out.println("타이어스팩 확인 . (정적 내부 클래스)");

            //static이니 바깥에 fuel은 접근을 못한다
           // System.out.println("현재 연료 " + fuel);

            //이넘은 스태틱 이니 가능하다
            System.out.println("현재 연료 " + estblishedYear);
        }
    }

    //지역 내부 클래스 (Local Inner Class)
    //일회용 도우미 (drive가 호출되면 그 때에만 로직으 처리하는 용도의 클래스를 만들고 싶다)
    public  void drive(int distance) {
        System.out.println(">>" + distance + "km 주행을 시작한다 .");


        //메서드안에서만 사용가능하다
        class TripLogger{
              private  String tripName;
              public TripLogger(String tripName) {
                  this.tripName = tripName;
              }
              public void log( ){
                  System.out.println(tripName + "여행기록 (지역내부클래스):총"+distance+"km");
                  //변수사용 가능하다
                  System.out.println("연료량" +fuel);
              }
        }

        TripLogger logger = new TripLogger("부산");
        logger.log();
    }
}
