package etc.colloection.map;

import oop.static_.utils.PrintUtil;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        //멥은 키와 벨류가 한쌍이다
        //key삽을 통해 value를 참조하는 방식
        //key는 중복 저장을 허용하지 않는다

        //key와 value쌍을 이루기 때문에 멀티 제너릭을 선언한다
        //list쪽에 add 같은 느낌이다
        Map<String, String> map = new HashMap<>();
        map.put("멍멍이", "홍길동");
        map.put("야옹이", "김철수");
        map.put("짹짹이", "박영희");
        System.out.println("map = " + map);
        //혹시 키가 중복되면 ?
        map.put("멍멍이","김춘식");//키중복
        map.put("어흥이","홍길동");//발루중복
        System.out.println("map = " + map);
        //결과 키는 가같으면 덮어쓴다
        // 키가다르면 키가 다르니 추가되고
        //내용물은 같을수도 있다
        //KEY를 이용하니
        //KEY를중복하면 기존 KEY값에 VALUE가 수정
        //KEY는 고유해야한다

        //이넘도 contains가있다
     String nick ="야옹이";
     //값을 리턴해준다
     //null을 참조하면 위험하다   
        String result = map.get(nick);
        System.out.println("result = " + result);
        
        //키가 있냐 존재하냐 
        if(map.containsKey(nick)){
            System.out.printf("별명이%s인 학생의 이름은 %s입니다.\n", nick, map.get(nick));
        }else {
            System.out.println("없는별멍이다");
        }

        //향상된 포문은 어떻게할꺼냐
        //향상 포문에 맵을 그대로 할수 없다
        //map.key() >> 매ㅂ키셋이다
        //키값만 담은 타입
        //이건 키순회하는거다
        for(String k :map.keySet()){
            System.out.printf("key: %s , value: %s \n", k, map.get(k));
        }
        PrintUtil.printLine();

        //map.entrySet()이건 set을 리턴한다
        //entry객체를 뭍혀서
        //entrySet() key와 value를 하나의 묶음(map.emtry)로 취급하고
        //그 묶음을 set으로 담아서 전달한다
        //묶어서 다 다루고 싶다
        for(Map.Entry<String,String> entry: map.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
        }
        
        // map.remove(key)
        //key 삭제 하면 항상 함께이기 때문에 삭제해준다 
        map.remove("야옹이");
        System.out.println("map = " + map);

        map.clear();

        //collections의 메서드는 collection 인터페이스 타입 전달받아
        //map은 사용이 힘들어용
        
    }

}
