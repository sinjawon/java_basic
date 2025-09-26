package etc.stream;

import java.util.Comparator;

import static etc.stream.Menu.MENU_LIST;

public class Finding {
    public static void main(String[] args) {

        //하나라도 존재하면 트루?
        //값을 많이담아서 돌려준는것이 아니라 결과만
        //하나라도 존재하냐
        boolean flag1 = MENU_LIST.stream()
                .filter(d -> d.getCalories() > 500)
                .anyMatch(d -> d.isVegetarian());

        System.out.println("flag1 = " + flag1);

        //메뉴 목록주 ㅇ 칼로리  100 이하인 요리가 하나라도 존재하는가
        boolean flag2 = MENU_LIST.stream()
                .anyMatch(d -> d.getCalories() <= 100); // 하나라도 일치

        System.out.println("flag2 = " + flag2);

        //음식 메뉴중에 모든요리가 1000칼로리 미만이냐
        //번에는전부다이일치하냐
        boolean flag3 = MENU_LIST.stream()
                .allMatch(d -> d.getCalories() < 1000); //전부일치?

        System.out.println("flag3 = " + flag3);

        //음식 메뉴중에 모든요리가 1000칼로리 미만이 아니냐
        //번에는전부다이일치하냐
        boolean flag4 = MENU_LIST.stream()
                .noneMatch(d -> d.getCalories() > 1000); //전부 불일치 ?

        System.out.println("flag4 = " + flag3);

        //음식 중에 칼로리가 제일 낮은애가 누구인가요
        Dish dish = MENU_LIST.stream()
                //Comparator.comparing() 이걸 해서 조건을 충당시켜야 한다
                .min(Comparator.comparing(d -> d.getCalories()))
                .get();
        //이런건 증복 확인 안해두되나
        System.out.println("dish = " + dish);






    }
}
