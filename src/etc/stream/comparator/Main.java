package etc.stream.comparator;

import oop.static_.utils.PrintUtil;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class Main {
    public static void main(String[] args) {



        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("홍길동", 15, 79));
        studentList.add(new Student("오로라핑", 18, 98));
        studentList.add(new Student("대길이", 30, 40));
        studentList.add(new Student("춘식이", 7, 20));

        //리스트를 나이순으,로 오름차 정렬 (나이적은순서)
        //런값이 양수냐 음수냐  차이로
        studentList.sort((o1,o2) ->o1.getAge() - o2.getAge());
        System.out.println(studentList);

        PrintUtil.printLine();

        studentList.sort((o1,o2) ->o2.getAge() - o1.getAge());
        System.out.println(studentList);

        PrintUtil.printLine();

        //이름 가나다순으로 정렬
        studentList.sort((o1,o2) ->o1.getName().compareTo(o2.getName()));
        System.out.println(studentList);

        PrintUtil.printLine();

        //성적 오름차
        //위의 정렬방식은 짜친다
        studentList.sort(comparing(Student::getScore));
        System.out.println(studentList);
        //내림차
        studentList.sort(comparing(Student::getScore).reversed());

        PrintUtil.printLine();
        //이름 오름차
        studentList.sort(comparing(Student::getName));
        studentList.sort(comparing(Student::getName));
        studentList.forEach(System.out::println);


    }
}
