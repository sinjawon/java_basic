package etc.stream;

public class DishDetail {
    private  final String name;
    private  final String type;

    /*
            메뉴 목록에서 칼로리가 500칼로리보다 큰
            음식들을 필터링한 다음에 음식의 이름과 타입만
            추출해서 출력해주세요. -> DishDetail이라는 객체로 맵핑
            단, 타입은 MEAT의 경우 육류라고 저장
            FISH는 어류라고 저장, OTHER는 기타라고 저장
         */
    public DishDetail(Dish dish){
         this.name=dish.getName();
         this.type=dish.getType().getDesc();
    }

    @Override
    public String toString() {
        return "DishDetail{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
