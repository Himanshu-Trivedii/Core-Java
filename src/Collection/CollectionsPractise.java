package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsPractise {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();arr.add(46346);arr.add(35);
        list.addAll(arr);
        // Collections is a Utility class where most methods are static hence no need to create object of Collections Class before using them on collection.
        Collections.sort(list);
        list.forEach((Integer i)->System.out.print(i +" "));
    }
}
