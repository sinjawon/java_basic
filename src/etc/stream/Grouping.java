package etc.stream;

import oop.static_.utils.PrintUtil;

import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static etc.stream.Menu.MENU_LIST;

public class Grouping {
    public static void main(String[] args) {

        //채식요리와 아닌 요리로 메뉴를 나눠보자
        //키맵?
        Map<Boolean, List<Dish>> veggieMenu = MENU_LIST.stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));

        System.out.println("--------채식메뉴-------");
        System.out.println(veggieMenu.get(true));
        System.out.println("------일반매뉴-------");
        System.out.println(veggieMenu.get(false));

        PrintUtil.printLine();

        //요리를 종류(Type)별로 그룹화 해보자!
        Map<Dish.Type, List<Dish>> menuByType = MENU_LIST.stream()
                //groupingBy()나누고자하는타입
                .collect(Collectors.groupingBy(dish -> dish.getType()));

        System.out.println(" --육류 메뉴---");
        System.out.println(menuByType.get(Dish.Type.MEAT));

        PrintUtil.printLine();



        //종류별로 나눈 메뉴를 칼로리 기준(500넘으면 고칼로리,나머지 저칼로리)으로 한번 더 그룹화 해줘?!!!
        Map<Dish.Type, Map<String, List<Dish>>> detailedMenu = MENU_LIST.stream()
                .collect(Collectors.groupingBy(Dish::getType//1차분류 타입
                        , Collectors.groupingBy(dish -> {
                            if (dish.getCalories() > 500) return "고칼로리";
                            else return "저칼로리";
                        })//2차분류 : 칼로리


                ));
        System.out.println(detailedMenu.get(Dish.Type.MEAT).get("저칼로리"));
        System.out.println(detailedMenu.get(Dish.Type.OTHER).get("고칼로리"));

        PrintUtil.printLine();

        //종류별 요리 개수

        Map<Dish.Type, Long> dishCount = MENU_LIST.stream()
                //groupingBy()나누고자하는타입
                .collect(Collectors.groupingBy(Dish::getType, Collectors.counting()));
        System.out.println(dishCount);

        //종류별 요리 총 칼로리
        Map<Dish.Type, Integer> totalCalByType = MENU_LIST.stream()
                //groupingBy()나누고자하는타입
                .collect(Collectors.groupingBy(Dish::getType,
                        Collectors.summingInt(Dish::getCalories)));
        System.out.println(totalCalByType);

        PrintUtil.printLine();

      //요약좀해라
        Map<Dish.Type, IntSummaryStatistics> calorieStats = MENU_LIST.stream()
                //groupingBy()나누고자하는타입
                .collect(Collectors.groupingBy(Dish::getType,
                        Collectors.summarizingInt(Dish::getCalories)));


    //통계 꾸러미 개수 ,평균 ,합계 ,최대 최소
        System.out.println(calorieStats);


    }
}
