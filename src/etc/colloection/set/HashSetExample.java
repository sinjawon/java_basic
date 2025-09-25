package etc.colloection.set;

import oop.static_.utils.PrintUtil;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
                  /*
                     # Set
                     - 집합을 구현해 놓은 인터페이스
                     - 요소로 같은 값이 들어오는 것을 허용하지 않는다.

                     # Hash
                     - 어떤 값을 넣었을 때 전혀 예측하지 못할 값이 생성되어야 하는 알고리즘
                     - 예측할 수 없는 값을 이용하기 때문에 정렬이 불가능.
                     - 생성된 값으로 원래 값을 찾는 것도 불가능에 가깝다.
                     - 다시 원래 값으로 돌아갈 수 없는 단방향성 알고리즘
                     - 속도가 빠르고 보안성이 뛰어난 알고리즘. 객체의 주소값을 할당하거나
                      암호화 알고리즘에서 많이 사용됩니다.
                    */

        Set<String> set = new HashSet<>();

        //객체 저장 : add(객체) 이넘은 인덱스가 없다 인덱스에 집착하지말자
        set.add("java");
        set.add("Spring");
        set.add("Oracle");
        set.add("Javascript");
        Collections.addAll(set,"MySQL","java");
        System.out.println("set = " + set);

        //set의 크기 확인 size()
        int size = set.size();
        System.out.println("size = " + size);

       /*
		 - set은 인덱스가 없기 때문에 메서드를 이용해서 객체를 얻는게 아니라
		  반복자 (Iterator)를 통해서 요소를 하나씩 꺼내 보셔야 합니다.
		  반복자 객체는 set 인터페이스가 제공하는 iterator()를 호출하여
		  얻어옵니다.
		 */

        Iterator<String> iter = set.iterator();
        //반복문은 와일인지 포인지
        //포는 범위를 알때
        //와일은 반복의 범위를 모를때
        //iter.hasNext() <<<다음요소가 있음ㄴtrue가 있다
       while(iter.hasNext()){
           System.out.println(iter.next());
       }

     //향상 포문이 위것을 대신 써준다
        PrintUtil.printLine();
       for (String str : set) {
           System.out.println(str);
       }
       //set 데이터 삭제 : remove(객체)
        //인덱스가 없어서 직접 지목해야한다
        set.remove("Javascript");
        System.out.println("set = " + set);

        //set을 리스트로 변환 -> 생성자의 매객밧으로 set을 전달
        List<String> convertedList = new ArrayList<>(set);
        System.out.println("convertedList = " + convertedList);
        
        //이리저리 가지고놀면
        convertedList.add(1,"java");
        convertedList.add(2,"Docker");
        convertedList.add(3,"Spring");
        System.out.println("convertedList = " + convertedList);
        
        //가지고놀다 헤시를 해보자
        //알아서 중복 해제한다
        Set<String> convertedSet = new HashSet<>(convertedList);
        System.out.println("convertedSet = " + convertedSet);


    }

}
