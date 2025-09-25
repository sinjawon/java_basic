package etc.colloection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCompare {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        List<Integer> linked = new LinkedList<>();

        for(int i=0;i<= 1000000;i++){

            array.add(i);
            linked.add(i);
        }


        long start,end;

        //배열리스트에서 데이터 제어
         start = System.currentTimeMillis();
        for(int j=0;j<=array.size();j++){
         array.remove(0);

        }
        end = System.currentTimeMillis();
        System.out.printf("배열 리스트 소요시간 : %dms\n", end -start);


       //링크드 데이터제어
        start = System.currentTimeMillis();
        for(int j=0;j<=linked.size();j++){
           linked.remove(0);

        }
        end = System.currentTimeMillis();
        System.out.printf("배열 리스트 소요시간 : %dms\n", end -start);

    }



}
