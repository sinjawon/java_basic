package etc.stream;

// map : 리스트에서 원하는 데이터만 추출
// original : [ {}, {}, {}, {}, {} ]
// filter   : [ {}, {}, {} ]
// map      : [ "", "", "", "", "" ]

import oop.static_.utils.PrintUtil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static etc.stream.Menu.MENU_LIST;

public class Mapping {


        public static void main(String[] args) {

           // 요리 이름만 출력
           List<String> nameList =  MENU_LIST.stream()
                    .map(d ->d.getName())
                            .collect(Collectors.toList());// 컬랙션안에있는 투리스트를 넣어준다

                     //add 를 못한다
                     //그럼 어떻게 쓸까
                    //.forEach(System.out::println); 지우고 변수를 받아보자
                   // .forEach(System.out::println);

            nameList.add("pasta");
            System.out.println("nameList = " + nameList);

            PrintUtil.printLine();

            List<String> browser = List.of("safari", "chrome", "ms edge", "firefox", "opera");

            //문자열의 길이만 추출
          List<Integer> list = browser.stream()
                    .map(b-> b.length())//String의 length를 일괄 적용하여 리턴
                    .toList();

            System.out.println("list = " + list);

            List<Character> list2 = browser.stream()
                    .map(b -> b.charAt(0))
                    .toList();

            System.out.println("list2 = " + list2);

            PrintUtil.printLine();


            //메뉴 목록에서 메뉴 이름고 ㅏ칼로리만 추출해서  새로운 객체로 포장해서 받고싶다
            List<SimpleDish> simpleDishes = MENU_LIST.stream()
                    //객체바꾸려면 속성값을 너어주는건갑다 근데 좀길다
                    //
                    .map(d -> new SimpleDish(d))
                    .toList();
            simpleDishes.forEach(System.out::println);

            PrintUtil.printLine();



/*
            메뉴 목록에서 칼로리가 500칼로리보다 큰
            음식들을 필터링한 다음에 음식의 이름과 타입만
            추출해서 출력해주세요. -> DishDetail이라는 객체로 맵핑
            단, 타입은 MEAT의 경우 육류라고 저장
            FISH는 어류라고 저장, OTHER는 기타라고 저장
         */

             MENU_LIST.stream()
                    .filter(d -> d.getCalories() >500)
                    .map(d -> new DishDetail(d))
                    .toList()
                 //  DishDetail.forEach(System.out::println);
                         .forEach(System.out::println);
            PrintUtil.printLine();

            //메뉴 목록에 있는 요리들의 총 칼로리 구한다
            int sum = MENU_LIST.stream()
                    .mapToInt(d -> d.getCalories())
                    .sum();

            System.out.println("sum = " + sum);


            //육류 메뉴의 평균 칼로리 구하기
            double meatAvgcal = MENU_LIST.stream()
                    .filter(d -> d.getType() == Dish.Type.MEAT)
                    .mapToInt(d -> d.getCalories())
                    .average()
                    //옵셔널 더블 값이 있는지 검사가 있냐 해서 랩으로 씌워준거다 옵셔너 더블로 보통은
                    //다시 확인을 한다
                    //if present << 유무확인
                    .getAsDouble();

            //원하는 소수점자리까지 .2 2자리까지
            System.out.printf("meatAvgcal =  %.2f\n" ,meatAvgcal);


            PrintUtil.printLine();

            //모든 요리 이름에 포함된 알파벳을 중복없이 추출
            //split("") Strign 배열로 리턴해준다
            //구분자 없이 하니 쭉다 뿌려 분할했다
            //Arrays::stream 배열을 받으면 배열을 스트림으로  바꿔주는 매서드
            //작성은 Arrays.stream(arr)
            //flatMap: map처럼 변환을 하긴 하는데, 그 결과는 반드시 stream 이어야 한다
            //여러개의 스트림을 단일 스트림으로 합쳐준다
            List<String> stringList = MENU_LIST.stream()
                    .map(d -> d.getName().split(""))
                    .flatMap(arr -> Arrays.stream(arr))
                    .filter(s->!s.isBlank())
                    .distinct() //중복제거
                    .toList();

            System.out.println("stringList = " + stringList);

            PrintUtil.printLine();
            List<String> stringList1 = MENU_LIST.stream()
                    .filter(d -> d.getCalories() > 300)
                    .peek(d -> System.out.println(" 필터링후 : " +d.getName()))
                    .map(d -> d.getName())
                 //   .limit()
                    .toList();

            System.out.println("stringList1 = " + stringList1);


            //peek() : 스트림 중간과정 확인하고싶으면


        }
}
