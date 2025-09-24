package etc.api.lang.obj;

import java.util.Objects;
//clone 메서드를 오버라이딩 했으면 clonable 인터페이스 구현해야한다
//아무기능이없고 그냥 약속이다
public class Person implements Cloneable{

    private String name;
    private int age;

    public Person() {}

    public Person(String name,int age) {
        this.age = age;
        this.name = name;
    }

    //toString(): 객체의 정보를 문자열 형태로 리턴
    //Object가 물려주는 toString 은 패키지 클레스 주소값 쓸 일 이없다
    //대부분 오버라이딩 사용한다
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age + "세" +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("이퀄스오버적용");
       /* if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(name, person.name);*/
        if (this == obj) return true;//주소값이 같다면 같은 객체다
        if(obj instanceof Person){
            //오브잭트 타입을 펄슨으로 맞춰줘야한다
            Person p =(Person)obj;
            if(this.age == p.age && this.name.equals(p.name)){
                return true;
            }
        }

        return false;
    }


    //equals를 오버라이딩 할 때는 hashCode도 함께 오버라이딩을 진행해 주시는 것이 좋습니다.
    //equals를 재 정의한다는 것은 내가 원하는 방식의 동등 비교를 하겠다는 것이기 때문에
    //hashcode의 값도 그에 맞게 같이 재 정의가 되어야 합니다. (hash 주소를 equals에 맞게 정의)
    //만약 같다고 판단했다면 주소값도 같게 해주겠다
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    protected  void finalize() throws Throwable {
        //생성된 객체가 소멸할때 자동으로 호추ㄹ되는 메서드 ()
        //garbage collector가 호출되는 순서를 보장할 수 없기때문에 사용을 권장하지 않음
        //쓰지말자
        super.finalize();
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
