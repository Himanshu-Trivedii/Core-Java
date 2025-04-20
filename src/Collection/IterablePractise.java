package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterablePractise {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);  list.add(3565);  list.add(675);
        // It is used to iterate over the collection.
        Iterator<Integer> iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        for(int i:list){
            System.out.println(i);
        }
        while(iter.hasNext()){
            if(iter.next().equals(3)){
                iter.remove();
            }
        }
        list.forEach((Integer i)->System.out.println(i));
    }
}