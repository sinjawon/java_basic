package etc.stream;

import java.util.List;                    // ✅ List import 추가
import oop.static_.utils.PrintUtil;

import static etc.stream.Menu.*;          // MENU_LIST 사용하려면 static import 필요

public class Filtering {

    public static void main(String[] args) {

        // 1) 채식 요리만 필터링
        List<Dish> dishList = MENU_LIST.stream()
               // .filter(d -> d.isVegetarian())
                .filter(Dish::isVegetarian)
                .toList();

        dishList.forEach(d -> System.out.println(d));

        // 기존 for-each
        for (Dish d : dishList) {
            System.out.println(d);
        }

        PrintUtil.printLine();

        // 2) 육류 && 600칼로리 미만
        MENU_LIST.stream()
                .filter(d -> d.getType() == Dish.Type.MEAT
                        && d.getCalories() < 600)
                .forEach(System.out::println);

        PrintUtil.printLine();

        // 3) 이름이 4글자인 요리만
        MENU_LIST.stream()
                .filter(d -> d.getName().length() == 4)
                .forEach(d -> System.out.println(d));

        PrintUtil.printLine();
     //칼로리가 300 칼로리보다 큰 요리중에 앞에 3개만 가져와
        MENU_LIST.stream()
                .filter(d -> d.getCalories() > 300)
                .limit(3)//앞자리 3개 추출
                .toList()
                .forEach(System.out::println);
        PrintUtil.printLine();
        //300칼로리보다 높은 요리 중 처음 2개 제끼고 필터링
        MENU_LIST.stream()
                .filter(d -> d.getCalories() > 300)
                .skip(2)//맨앞 두개 제외
                .toList()
                .forEach(System.out::println);
        PrintUtil.printLine();
        List<Integer> numbers = List.of(1, 2, 1, 3, 4, 5, 6, 3, 5, 6, 3, 4);

        //리스트에서 짝수마 필터링 (중복 제거해서)
        numbers.stream()
                .filter( n -> n%2 == 0)
                .distinct() //중복처리
                .toList()
                .forEach(System.out::println);
    }
}
