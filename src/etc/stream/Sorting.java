package etc.stream;

import oop.static_.utils.PrintUtil;

import java.util.Comparator;
import java.util.List;

import static etc.stream.Menu.MENU_LIST;
import static java.util.Comparator.comparing;

public class Sorting {
    public static void main(String[] args) {

        //육류 요리 중 칼로리가 낮은 순으로 정렬하기
        //sorted
        List<Dish> lowCalMeats = MENU_LIST.stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT)
                //    .sorted(comparing(d -> d.getCalories()));
                .sorted(comparing(Dish::getCalories))
                .toList();
        lowCalMeats.forEach(System.out::println);

         PrintUtil.printLine();

        //메뉴들을 이름 내림차로 정렬 (zxy순)
        MENU_LIST.stream()
                .sorted(comparing(Dish::getName).reversed())
                .toList()
                .forEach(System.out::println);

        PrintUtil.printLine();

        //300칼로리 이상 요리중 칼로리가 낮은 탑3 요리 필터링
        MENU_LIST.stream()
                .filter(dish -> dish.getCalories() >= 300)
                //칼로리 오름차순으로 , 칼로리가 같다면 이름오름차순으로
                .sorted(comparing(Dish::getCalories).thenComparing(Dish::getName))
                .limit(3)
                .forEach(System.out::println);

        //정렬을 2차로 가능하다

    }
}
