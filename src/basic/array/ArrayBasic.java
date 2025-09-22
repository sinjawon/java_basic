package basic.array;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {
        //1.배열  선언
        int[] nubesrs;
        //2. 배열 객체 생성
        nubesrs = new int[5];

        //배열 내부 초기화
        //인덱스는 0부터 1씩증가한다
        //마지막 인덱스는 배열크기 1작다
        nubesrs[0] = 50;
        nubesrs[1] = 77;
        //alt enter 제안 커맨드
        nubesrs[2] = (int) 3.14;
        nubesrs[3] = nubesrs[0] + 20;
//        nubesrs[4] = "마롱";
        nubesrs[4] = 100;
//        nubesrs[5] = 10;
        System.out.println(nubesrs.length);
        System.out.println(nubesrs[4]);
        //5배열 순회
        for (int i = 0; i < nubesrs.length - 1 ; i++) {
            System.out.println(nubesrs[i]);
        }
        System.out.println("==============================");
        //향상 for문 for 이치
        for(int a : nubesrs){
            System.out.println(a);

        }
        //배열 내부 한 번에 출력하기
        //변수 저장 스택
        //커다란 저장공간은 힙
        System.out.println(Arrays.toString(nubesrs));
        //배열 쉽게 초기화
        int[] pointList = {10,20,30,40,50};
        String[] pets = {"5","3","2"};

    }
}
