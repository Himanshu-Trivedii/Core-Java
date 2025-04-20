package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionPractise {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();arr.add(46346);arr.add(35);
        list.addAll(arr);
        // Collection is a framework which effectively manages the group of objects and can perform operations on it.
        // Here List is interface and arraylist is  class which implements it
        // so now the arraylist will implement all the common methods that are there in List Interface same for LL arraylist and vector.
        // Just Do list. and you will get all the methods that list variable implements from interface List
        list.forEach((Integer i)->System.out.print(i +" "));

    }
}
