package basic.array;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        int [][] arr = new int[3][4];
        arr[1][1] = 1;
        //배열은 선언 할때 각 인데스에 기본값을 ㅗ초기화 된다
        //문자 공백 스트링은 null 은 참조하는것이 벗다
        //2차원으 딥 투스트링
        System.out.println(Arrays.deepToString(arr));
        for(int[] a : arr ){
            for(int i : a){
                 System.out.print(i + " ");
            }
            System.out.println();//괄호를 비우면 줄개행이다
        }
    }
}
