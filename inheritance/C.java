package inheritance;

import java.util.ArrayList;
import java.util.List;

public class C extends  B{
    void cshow(){
        System.out.println("Cshow");
    }
    List<? super Integer> list=new ArrayList<>();
}
