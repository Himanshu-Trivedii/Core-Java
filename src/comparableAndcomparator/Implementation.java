package src.ComparableandComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Implementation {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(21,"Tom"));
        list.add(new Student(22, "Jerry"));
        list.add(new Student(23, "Jane"));
        list.add(new Student(24, "Street"));
        Collections.sort(list);
        for(Student s:list){
            System.out.println(s);
        }
    }
}

