package Comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Client {
        
    public static void main(String[] args) {

        List<Students> ls=new ArrayList<>();
        ls.add(new Students(1,2,"hello"));
        ls.add(new Students(2,4,"hi"));
        ls.add(new Students(3,6,"by"));

        Collections.sort(ls, new SortingMech());
    }
}
