package etc.colloection.list;

import oop.static_.utils.PrintUtil;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {

       // String[] arr=new String[50];
       //이건 배열 선언이었지


       //<> ->(제너릭 타입의 형식을 지정하여 타입 안정성을 꾀하기 위한 문법)
       //리스트에다가 오브젝트 계열을 모아둘꺼야 <<
        //자식 타입으로 접근해야한느데 모든걸 다 오브젝트로하면 장점은 있지만
        //하지만 내가 진짜 그객체의 고유기능 사용하려면 오브젝트로는 볼수가 없다
        //오브제 말고 정확하게 명시를해줘
        //7번이후 <> 그냥해줘두도니다
     //   List<String> nick = new ArrayList<>(); <<다형성 누리기위해 인터페이스로받는다
     //   ArrayList<String> nick = new ArrayList<>();
        List<String> nick = new ArrayList<>();
        //add(객체): 리스트에 객체를 추가하는 메서드
        String str= "야오이";
        nick.add("멍멍미");
        nick.add(str);
        nick.add(new String("개구리"));
        nick.add("짹짹이");
        //중복 허용도 한다
        nick.add("야옹이");
        //리스트 내부를 보고싶어
        //알아서 해주니까 바로 보여준다
        System.out.println("nick = " + nick);
        // add(인덱스,객체): 원하는 위치에 객체 삽입
        //이건 넣어주고 그 다음친구는 한칸씩 밀린다
        nick.add(3,"어흥이");
        System.out.println("nick = " + nick);
        //3번주소 시작한다
        //값을 얻는다
        System.out.println(nick.get(1));
        //리스트 사이즈 !
        System.out.println(nick.size());

        //set (index, 수정객체): 리스트 내부 객체 수정
        //갈아낀다
        nick.set(2,"삐약이");
        System.out.println("nick = " + nick);
        //리스트 반복문 처리 드럽게 좋다
        PrintUtil.printLine();
        //범위 명확 플러스 인덱스 번호주로할때
        for(int i=0; i<nick.size(); i++){
            System.out.println(nick.get(i));
        }

        PrintUtil.printLine();

        //배열 내 모든 요소 순환할때 강제 느낌이니
        for(String s:nick){
            System.out.println(s);
        }
        //contains(객체): 리스트 내의 객체의 존재 유무를 파악
        PrintUtil.printLine();
        System.out.println(nick.contains("야오이"));
        System.out.println(nick.contains("없니"));

        PrintUtil.printLine();
        //indexOf(객체): 정확하게 어디있는지까지 알려준다
        //만약 그것이 없다면 -1 이 리턴
        System.out.println(nick.indexOf("야옹이"));
        System.out.println(nick.indexOf("개구리"));

        PrintUtil.printLine();
        //remove(객체 or 인덱스): 리스트 내부 객체 삭제
        System.out.println("nick = " + nick);
        nick.remove("삐약이");
        nick.remove(0);
        System.out.println("nick = " + nick);

        //전부 삭제
        PrintUtil.printLine();
        nick.clear();
        System.out.println("nick = " + nick);

        PrintUtil.printLine();
        //리스트 비어있냐도 있다
        //트루 폴스다
        System.out.println(nick.isEmpty());

        PrintUtil.printLine();
        /*
        * 컬렉션 객체는 collections의 기능을 사용할수 있다
        * collections는 컬렉션 객체들의 부가기능을 제공합니다
        * */

        //컬렉션은 객체타입을 넣어야해서 Inteager
       List<Integer> score = new ArrayList<>();
       //내가 리스트 안에 넣을 값이 이미 준비되어있다
       score.add(90);
       //미리알면 넣을수가 있다
        List<Integer> integersList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> integersList2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        //컬랙션스 메서든
        //넣고저하는것,리스트쭋
        //이건 기존에 있는거에다 값을 넣을때 있다
        Collections.addAll(score,78,100,88,79,100,21,25);

        System.out.println("score = " + score);
     //   integersList.add(11);  <<터짐 안됨
        //3개의 차이점이 뭐냐

    //컬렉션 내의 객체 개수 구하기
        System.out.println("100학생수" +Collections.frequency(score,100) );


        //최대 최솟값
        System.out.println("최댓값 :" + Collections.max(score));
        System.out.println("최솟값 :" + Collections.min(score));

        //정렬 오름차
        Collections.sort(score);
        System.out.println("score = " + score);

        //내림차 정렬기능 아님  그냥 역순
      //  Collections.reverse(score);
     //  System.out.println("score = " + score);
        //내림차정렬
        Collections.sort(score,Collections.reverseOrder());
        System.out.println("score = " + score);

        //두 요소의 위치를 교체 swap(리스트,i,j)
        //i,j 위치를 바꾼다
        Collections.swap(score,0,1);
        System.out.println("score = " + score);

        //리스트  내의 옵션 무작위로 섞기
        Collections.shuffle(score);
        System.out.println("score = " + score);

        //원하는 객체로 컬렉션을 전부 초기화
        Collections.fill(score,100);
        System.out.println("score = " + score);

    }
}
